package richTea.core.factory.bindings;

import richTea.core.node.TreeNode;

public class BootstrapBindingSet extends BindingSet {
	
	public BootstrapBindingSet() {
		addChild(new BootstrapBinding("Bindings", BindingSet.class.getName()));
		addChild(new BootstrapBinding("Node", Binding.class.getName()));
		addChild(new BootstrapBinding("Function", FunctionBinding.class.getName()));
		addChild(new BootstrapBinding("Attribute", AttributeNode.class.getName()));
		addChild(new BootstrapBinding("Scope", TreeNode.class.getName()));
	}
}
