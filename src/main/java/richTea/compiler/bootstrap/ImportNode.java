package richTea.compiler.bootstrap;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.List;

import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.RecognitionException;

import richTea.compiler.RichTeaCompiler;
import richTea.runtime.attribute.Attribute;
import richTea.runtime.node.Branch;
import richTea.runtime.node.DataNode;
import richTea.runtime.node.TreeNode;
import richTea.runtime.resolver.AttributeResolver;

public class ImportNode extends DataNode {
	
	public static final String FUNCTIONS_ATTRIBUTE_NAME = "functions";
	public static final String REBINDING_BRANCH_NAME = "rebind";
	protected static final String IMPORT_ALL = "*";
	
	private BindingSet importedBindings;
	
	public ImportNode() {
		importedBindings = new BindingSet();
	}
	
	public BindingSet getImportedBindings() {
		return importedBindings;
	}

	@Override
	public void initialize() throws IOException, RecognitionException, ClassNotFoundException {
		String modulePath = getModulePath();
		String exportsFileName = getExportsFileName(modulePath);
		ClassLoader moduleClassLoader = getClassLoaderForModule(modulePath);
		Thread.currentThread().setContextClassLoader(moduleClassLoader);
		BindingSet moduleExports = loadModuleExports(moduleClassLoader, exportsFileName);
		
		// Import bindings from functions attribute
		Object functionsAttributeValue = resolver.getValueOrDefault(FUNCTIONS_ATTRIBUTE_NAME, "");
		String importPrefix = getImportPrefix();
		
		if (functionsAttributeValue.equals(IMPORT_ALL)) {
			for(BindingNode export : moduleExports.getBindings()) {
				registerImportedBinding(export.getName(), importPrefix, export);
			}
		} else if (functionsAttributeValue instanceof List<?>) {
			for(Object namedImport : (List<?>) functionsAttributeValue) {
				BindingNode export = moduleExports.getBinding(String.valueOf(namedImport));
				
				registerImportedBinding(export.getName(), importPrefix, export);
			}
		}
		
		// Import bindings from rebind branch 
		Branch rebindBranch = getBranch(REBINDING_BRANCH_NAME);
		
		if (rebindBranch != null) {
			AttributeResolver<TreeNode> resolver = new AttributeResolver<TreeNode>();
			for(TreeNode rebindNode : rebindBranch.getChildren()) {
				resolver.setContext(rebindNode);
				
				String exportName = resolver.getString("if"); // Hack: Scope's implicit attribute is "if"
				String importName = resolver.getStringOrDefault("as", exportName);
				BindingNode exportedBinding = moduleExports.getBinding(exportName);
				BindingNode importedBinding = registerImportedBinding(importName, importPrefix, exportedBinding);
				
				for(Attribute attribute : rebindNode.getAttributes()) {
					String attributeName = attribute.getName();
					if (!attributeName.equals("if") && !attributeName.equals("as")) {
						importedBinding.getDefaultAttributes().setAttribute(attribute);
					}
				}
			}
		}
	}
	
	public String getModulePath() {
		String path = resolver.getString("from");
		
		return path.endsWith(".jar") ? path : path + ".jar";
	}
	
	public String getImportPrefix() {
		return resolver.getStringOrDefault("importPrefix",  "");
	}
	
	protected ClassLoader getClassLoaderForModule(String modulePath) {
		String moduleName = getModuleName(modulePath);
		String exportsFileName = getExportsFileName(moduleName);
		ClassLoader classLoader = getClass().getClassLoader();
		
		if (classLoader.getResource(exportsFileName) == null) {
			try {
				String workingDir = System.getProperty("user.dir");
				URL moduleURL = new File(workingDir, modulePath).toURI().toURL();
				
				classLoader = new URLClassLoader(new URL[] { moduleURL }, classLoader);
			} catch (MalformedURLException e) {
				throw new RuntimeException("Unable to read module file", e);
			}
		}
		
		return classLoader;
	}
	
	protected String getModuleName(String modulePath) {
		String name = new File(modulePath).getName();
		int extensionIndex = name.lastIndexOf('.');
		
		return extensionIndex == -1 ? name : name.substring(0, extensionIndex);
	}
	
	protected String getExportsFileName(String modulePath) {
		return getModuleName(modulePath) + ".tea";
	}

	protected BindingSet loadModuleExports(ClassLoader classLoader, String exportsFileName) throws IOException {
		CharStream moduleBindings = new ANTLRInputStream(classLoader.getResourceAsStream(exportsFileName));
		RichTeaCompiler compiler = new RichTeaCompiler(moduleBindings);
		
		return (BindingSet) compiler.compile();
	}
	
	protected BindingNode registerImportedBinding(String name, String prefix, BindingNode binding) throws ClassNotFoundException {
		BindingNode importedBinding = createImportedBinding(name, prefix, binding);
		
		getImportedBindings().registerBinding(importedBinding);
		
		return importedBinding;
	}
	
	protected BindingNode createImportedBinding(String name, String prefix, BindingNode binding) throws ClassNotFoundException {
		BindingNode importedBinding = new BindingNode();
		
		for(Attribute attribute : binding.getAttributes()) {
			importedBinding.setAttribute(attribute);
		}
		
		for(Branch branch : binding.getBranches()) {
			importedBinding.setBranch(branch);
		}
		
		importedBinding.setName(prefix + name);
		importedBinding.initialize();
		
		return importedBinding;
	}
}