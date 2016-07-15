package richTea.test.testLib;

import java.net.URLClassLoader;
import java.nio.file.Path;
import java.util.Map;

import richTea.compiler.bootstrap.BindingDefinition;
import richTea.compiler.bootstrap.ImportNode;

public class TestLibImportNode extends ImportNode {
	
	public TestLibImportNode() {
		setValue(FUNCTIONS_ATTRIBUTE_NAME, IMPORT_ALL);
		
		try {
			initialize();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	@Override
	protected URLClassLoader getClassLoaderForModule(Path modulePath) {
		return (URLClassLoader) getClass().getClassLoader();
	}
	
	@Override
	public String getExportsFileName() {
		return "lib-test-exports.tea";
	}
	
	@Override 
	protected Map<String, BindingDefinition> getImportDefinitions(Map<String, BindingDefinition> exportedDefinitions) {
		return exportedDefinitions;
	}
}
