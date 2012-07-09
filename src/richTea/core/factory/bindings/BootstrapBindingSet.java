package richTea.core.factory.bindings;

import richTea.core.node.Branch;

public class BootstrapBindingSet extends BindingSet {
	
	public BootstrapBindingSet() {
		Branch bindings = new Branch("bindings");
		
		bindings.addChild(new BootstrapBinding("Bindings", BindingSet.class));
		bindings.addChild(new BootstrapBinding("Function", Binding.class));
		bindings.addChild(new BootstrapBinding("Attribute", AttributeNode.class));
		bindings.addChild(new BootstrapBinding("Branch"));
		bindings.addChild(new BootstrapBinding("Scope"));
		
		setBranch(bindings);
	}
}
