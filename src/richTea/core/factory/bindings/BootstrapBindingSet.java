package richTea.core.factory.bindings;

public class BootstrapBindingSet extends BindingSet {
	
	public BootstrapBindingSet() {
		addChild(new BootstrapBinding("Bindings", BindingSet.class.getName()));
		addChild(new BootstrapBinding("Node", Binding.class.getName()));
		addChild(new BootstrapBinding("Function", FunctionBinding.class.getName()));
		addChild(new BootstrapBinding("Attribute", AttributeNode.class.getName()));
	}
}
