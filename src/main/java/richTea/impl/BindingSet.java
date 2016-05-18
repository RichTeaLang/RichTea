package richTea.impl;

import java.util.HashMap;
import java.util.Map;

import richTea.node.Branch;
import richTea.node.TreeNode;

public class BindingSet extends TreeNode {
	
	private Map<String, Binding> bindings;
	
	public BindingSet() {
		bindings = new HashMap<String, Binding>();
	}
	
	public void registerBinding(Binding binding) {
		bindings.put(binding.getName().toLowerCase(), binding);
	}
	
	public Binding getBinding(String bindingName) {
		return bindings.get(bindingName.toLowerCase());
	}
	
	public Binding[] getBindings() {
		return bindings.values().toArray(new Binding[bindings.size()]);
	}
	
	@Override
	public void setBranch(Branch branch) {
		super.setBranch(branch);
		
		if(branch.getName().equalsIgnoreCase("bindings")) {
			for(TreeNode child : branch.getChildren()) {
				if(child instanceof Binding) {
					registerBinding((Binding) child);
				}
			}
		}
	}
}