package richTea.core.factory.bindings;

public class BootstrapBinding extends Binding {
	
	public BootstrapBinding(String name, String nodeClassName) {
		setBindingName(name);
		setNodeClassName(nodeClassName);
		
		initialize();
	}
}