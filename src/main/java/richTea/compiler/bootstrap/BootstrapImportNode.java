package richTea.compiler.bootstrap;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLClassLoader;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;

import richTea.runtime.execution.EmptyFunction;
import richTea.runtime.execution.RichTeaFunction;
import richTea.runtime.functions.Eval;
import richTea.runtime.functions.Import;
import richTea.runtime.functions.Return;
import richTea.runtime.functions.Scope;
import richTea.runtime.node.TreeNode;

public class BootstrapImportNode extends ImportNode {
	
	protected Class<? extends TreeNode> defaultNodeClass;
	protected Class<? extends RichTeaFunction> defaultFunctionClass;
	
	public BootstrapImportNode() {
		defaultNodeClass = TreeNode.class;
		defaultFunctionClass = EmptyFunction.class;
		
		setValue(FUNCTIONS_ATTRIBUTE_NAME, IMPORT_ALL);
		
		try {
			initialize();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	@Override
	public Path getModulePath() {
		URL location = this.getClass().getProtectionDomain().getCodeSource().getLocation();

		try {
			return new File(location.toURI()).toPath();
		} catch (URISyntaxException e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public String getImportPrefix() {
		return "";
	}
	
	@Override
	public URLClassLoader getClassLoaderForModule(Path modulePath) {
		return (URLClassLoader) getClass().getClassLoader();
	}
	
	@Override
	protected Map<String, BindingDefinition> getExportDefinitions(ClassLoader classLoader) throws IOException {
		BindingDefinition[] definitions = new BindingDefinition[] {
			createAttributeDefinition(),
			createBranchDefinition(),
			createEvalDefinition(),
			createFunctionDefinition(),
			createImportDefinition(),
			createReturnDefinition(),
			createScopeDefinition()
		};
		
		Map<String, BindingDefinition> definitionMap = new HashMap<>();
		
		for(BindingDefinition definition : definitions) {
			definitionMap.put(definition.getName().toLowerCase(), definition);
		}
		
		return definitionMap;
	}

	protected BindingDefinition createAttributeDefinition() {
		BindingDefinition definition = new BindingDefinition("Attribute", AttributeNode.class, defaultFunctionClass);

		definition.setImplicitAttributeName("name");

		return definition;
	}

	protected BindingDefinition createBranchDefinition() {
		BindingDefinition definition = new BindingDefinition("Branch", defaultNodeClass, defaultFunctionClass);

		definition.setImplicitAttributeName("name");

		return definition;
	}

	protected BindingDefinition createEvalDefinition() {
		BindingDefinition definition = new BindingDefinition("Eval", defaultNodeClass, Eval.class);

		definition.setImplicitAttributeName("source");

		return definition;
	}

	protected BindingDefinition createFunctionDefinition() {
		BindingDefinition definition = new BindingDefinition("Function", BindingDefinition.class, defaultFunctionClass);

		definition.setImplicitAttributeName("name");
		definition.setImplicitBranchName("attributes");

		return definition;
	}

	protected BindingDefinition createImportDefinition() {
		BindingDefinition definition = new BindingDefinition("Import", ImportNode.class, Import.class);

		definition.setImplicitAttributeName(ImportNode.FUNCTIONS_ATTRIBUTE_NAME);
		definition.setImplicitBranchName(ImportNode.REBINDING_BRANCH_NAME);

		return definition;
	}

	protected BindingDefinition createReturnDefinition() {
		BindingDefinition definition = new BindingDefinition("Return", defaultNodeClass, Return.class);

		definition.setImplicitAttributeName("value");

		return definition;
	}

	protected BindingDefinition createScopeDefinition() {
		BindingDefinition definition = new BindingDefinition("Scope", defaultNodeClass, Scope.class);

		definition.setImplicitAttributeName("if");
		definition.setImplicitBranchName("do");

		return definition;
	}
}
