package richTea.core.factory.bindings;

import richTea.core.node.Branch;
import richTea.core.node.TreeNode;

public class BootstrapBindingSet extends BindingSet {
	
	public BootstrapBindingSet() {
		Branch bindings = new Branch("bindings");
		
		bindings.addChild(new BootstrapBinding("Bindings", BindingSet.class.getName()));
		bindings.addChild(new BootstrapBinding("Node", Binding.class.getName()));
		bindings.addChild(new BootstrapBinding("Function", FunctionBinding.class.getName()));
		bindings.addChild(new BootstrapBinding("Attribute", AttributeNode.class.getName()));
		bindings.addChild(new BootstrapBinding("Scope", TreeNode.class.getName()));
		
		setBranch(bindings);
	}
}
