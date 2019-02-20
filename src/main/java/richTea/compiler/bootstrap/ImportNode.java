package richTea.compiler.bootstrap;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLClassLoader;
import java.nio.file.Path;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.antlr.runtime.ANTLRInputStream;

import richTea.compiler.Compiler;
import richTea.runtime.attribute.Attribute;
import richTea.runtime.node.Branch;
import richTea.runtime.node.DataNode;
import richTea.runtime.node.TreeNode;
import richTea.runtime.resolver.AttributeResolver;

public class ImportNode extends DataNode {
	public static final String FUNCTIONS_ATTRIBUTE_NAME = "functions";
	public static final String REBINDING_BRANCH_NAME = "rebind";
	public static final String IMPORT_ALL = "*";
	public static final String EXPORTS_BRANCH_NAME = "exports";
	
	private Path workingDir;
	private ClassLoader classLoader;
	private Map<String, BindingDefinition> definitions;
	private Map<String, Binding> bindings;
	
	@Override
	public void initialize() throws Exception {
		try {
			workingDir = new File(System.getProperty("user.dir")).toPath().toAbsolutePath().normalize();
			classLoader = getClassLoaderForModule(getModulePath());
			definitions = getImportDefinitions(getExportDefinitions(classLoader, getExportsFileName()));
			bindings = createBindings(getImportPrefix(), classLoader, definitions.values());
		} catch (Throwable e) {
			throw new Exception(getModulePath().toString(), e);
		}
	}
	
	public Path getDeclaredPath() {
		String from = resolver.getString("from");
		
		if (from != null) {
			from = from.endsWith(".jar") ? from : from + ".jar";
		} else {
			// No path was specified.  Assume the import library in is composed of classes on the current class path
			// and so provide a best-guess at the location of those classes.
			URL location = getClass().getProtectionDomain().getCodeSource().getLocation();
			
			from = location.getPath();
		}
		
		return new File(from).toPath();
	}
	
	public Path getModulePath() {
		Path path = getDeclaredPath();
		String pathOverride = System.getProperty(path.toString());
		path = pathOverride == null ? workingDir.resolve(path) : new File(pathOverride).toPath();
		
		return path.toAbsolutePath().normalize();
	}
	
	public String getExportsFileName() {
		return resolver.getStringOrDefault("exportsFileName", "exports.tea");
	}
	
	public String getImportPrefix() {
		return resolver.getStringOrDefault("importPrefix", "");
	}
	
	public Binding getImportedBinding(String name) {
		return bindings.get(name);
	}
	
	public Map<String, Binding> getImportedBindings() {
		return Collections.unmodifiableMap(bindings);
	}
	
	public ClassLoader getClassLoader() {
		return classLoader;
	}
	
	protected ClassLoader getClassLoaderForModule(Path modulePath) {
		try {
			File moduleFile = modulePath.toFile();
			URL moduleURL = moduleFile.toURI().toURL();
			
			if (!moduleFile.exists()) {
				throw new FileNotFoundException(modulePath + " does not exist");
			}
			
			return new URLClassLoader(new URL[] { moduleURL }, getClass().getClassLoader());
		} catch (Exception e) {
			throw new RuntimeException("Unable to read module file (" + modulePath + ")", e);
		}
	}
	
	protected Map<String, BindingDefinition> getExportDefinitions(ClassLoader classLoader, String exportsFileName) throws IOException {
		InputStream manifest = classLoader.getResourceAsStream(exportsFileName);
		
		if (manifest == null) {
			throw new FileNotFoundException("Missing export manifest: " + exportsFileName);
		}
		
		Compiler compiler = new Compiler(new ANTLRInputStream(manifest));
		TreeNode manifestNode =  compiler.compile().getProgram();
		Map<String, BindingDefinition> exports = new HashMap<>();
		
		if (manifestNode.hasBranch(EXPORTS_BRANCH_NAME)) {
			for(TreeNode node : manifestNode.getBranch(EXPORTS_BRANCH_NAME).getChildren()) {
				BindingDefinition export = (BindingDefinition) node;
				
				exports.put(export.getName().toLowerCase(), export);
			}
			
			return exports;
		} else {
			throw new IllegalArgumentException("Export manifest does not contain " + EXPORTS_BRANCH_NAME + " branch");
		}
	}
	
	protected Map<String, BindingDefinition> getImportDefinitions(Map<String, BindingDefinition> exportedDefinitions) throws IOException {
		Map<String, BindingDefinition> importedDefinitions = new HashMap<>();
		
		// Import bindings from functions attribute
		Object functionsAttributeValue = resolver.getValueOrDefault(FUNCTIONS_ATTRIBUTE_NAME, "");
		
		if (functionsAttributeValue.equals(IMPORT_ALL)) {
			for(BindingDefinition export : exportedDefinitions.values()) {
				importedDefinitions.put(export.getName(), export);
			}
		} else if (functionsAttributeValue instanceof List<?>) {
			for(Object namedImport : (List<?>) functionsAttributeValue) {
				BindingDefinition export = exportedDefinitions.get(String.valueOf(namedImport).toLowerCase());
				
				importedDefinitions.put(export.getName(), export);
			}
		}
		
		// Import bindings from rebind branch 
		Branch rebindBranch = getBranch(REBINDING_BRANCH_NAME);
		
		if (rebindBranch != null) {
			AttributeResolver<TreeNode> resolver = new AttributeResolver<TreeNode>();
			for(TreeNode rebindNode : rebindBranch.getChildren()) {
				resolver.setContext(rebindNode);
				
				String exportedName = resolver.getString("if"); // Hack: Scope's implicit attribute is "if"
				String importedName = resolver.getStringOrDefault("as", exportedName);
				BindingDefinition exportedDefinition = exportedDefinitions.get(exportedName.toLowerCase());
				BindingDefinition importedDefinition = new BindingDefinition(importedName, exportedDefinition);
				
				for(Attribute attribute : rebindNode.getAttributes()) {
					String attributeName = attribute.getName();
					if (!attributeName.equals("if") && !attributeName.equals("as")) {
						importedDefinition.getDefaultAttributes().setAttribute(attribute);
					}
				}
				
				importedDefinitions.put(importedDefinition.getName(), importedDefinition);
			}
		}
		
		return importedDefinitions;
	}
	
	protected Map<String, Binding> createBindings(
			String prefix, 
			ClassLoader classLoader, 
			Collection<BindingDefinition> definitions) throws ClassNotFoundException {
		
		Map<String, Binding> bindings = new HashMap<>();
		
		for(BindingDefinition definition : definitions) {
			String name = prefix + definition.getName();
			Binding binding = new Binding(name, classLoader, definition);
			
			bindings.put(name.toLowerCase(), binding);
		}
		return bindings;
	}
}
