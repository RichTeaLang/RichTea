package richTea.core.factory.bindings;


public class BootstrapBindingSet extends BindingSet {
	
	public BootstrapBindingSet() {
		addChild(new Binding("Bindings", BindingSet.class.getName()));
		addChild(new Binding("Binding", Binding.class.getName()));
		addChild(new Binding("Attribute", AttributeNode.class.getName()));
	}
}
