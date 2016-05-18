package richTea.impl;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.List;
import java.util.jar.JarFile;

import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;

import richTea.antlr.RichTeaLexer;
import richTea.antlr.RichTeaParser;
import richTea.antlr.RichTeaTreeAdaptor;
import richTea.antlr.tree.NodeData;
import richTea.attribute.Attribute;
import richTea.factory.RichTeaNodeFactory;
import richTea.node.Branch;
import richTea.node.DataNode;
import richTea.node.TreeNode;
import richTea.resolver.AttributeResolver;

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
		File moduleFile = getModuleFile();
		String importPrefix = getImportPrefix();
		
		// Configure class loader before loading bindings
		ClassLoader moduleClassLoader = createModuleClassLoader(moduleFile);
		Thread.currentThread().setContextClassLoader(moduleClassLoader);
		BindingSet moduleExports = loadModuleExports(moduleFile);
		
		// Import bindings from functions attribute
		Object functionsAttributeValue = resolver.getValueOrDefault(FUNCTIONS_ATTRIBUTE_NAME, "");
			
		if (functionsAttributeValue.equals(IMPORT_ALL)) {
			for(Binding export : moduleExports.getBindings()) {
				registerImportedBinding(export.getName(), importPrefix, export);
			}
		} else if (functionsAttributeValue instanceof List<?>) {
			for(Object namedImport : (List<?>) functionsAttributeValue) {
				Binding export = moduleExports.getBinding(String.valueOf(namedImport));
				
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
				Binding exportedBinding = moduleExports.getBinding(exportName);
				Binding importedBinding = registerImportedBinding(importName, importPrefix, exportedBinding);
				
				for(Attribute attribute : rebindNode.getAttributes()) {
					String attributeName = attribute.getName();
					if (!attributeName.equals("if") && !attributeName.equals("as")) {
						importedBinding.getDefaultAttributes().setAttribute(attribute);
					}
				}
			}
		}
	}
	
	public File getModuleFile() {
		return new File(resolver.getString("from") + ".jar");
	}
	
	public String getImportPrefix() {
		return resolver.getStringOrDefault("importPrefix",  "");
	}
	
	protected URLClassLoader createModuleClassLoader(File moduleFile) throws MalformedURLException {
		URL[] urls = { moduleFile.toURI().toURL() };
		
		return new URLClassLoader(urls, this.getClass().getClassLoader());
	}

	protected BindingSet loadModuleExports(File moduleFile) throws IOException, RecognitionException {
		JarFile moduleJar = new JarFile(moduleFile);
		InputStream bindingsFileInput = moduleJar.getInputStream(moduleJar.getEntry("bindings.tea"));
		
		ANTLRStringStream sourceStream = new ANTLRInputStream(bindingsFileInput);
		RichTeaLexer lexer = new RichTeaLexer(sourceStream);
		RichTeaParser parser = new RichTeaParser(new CommonTokenStream(lexer));
		parser.setTreeAdaptor(new RichTeaTreeAdaptor());
		
		NodeData bindingsData = (NodeData) parser.program().getTree();

		RichTeaNodeFactory nodeFactory = new RichTeaNodeFactory(new BindingSet[] { new BootstrapBindingSet() });
		
		moduleJar.close();
	
		return (BindingSet) nodeFactory.create(bindingsData);
	}
	
	protected Binding registerImportedBinding(String name, String prefix, Binding binding) throws ClassNotFoundException {
		Binding importedBinding = createImportedBinding(name, prefix, binding);
		
		getImportedBindings().registerBinding(importedBinding);
		
		return importedBinding;
	}
	
	protected Binding createImportedBinding(String name, String prefix, Binding binding) throws ClassNotFoundException {
		Binding importedBinding = new Binding();
		
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