package richTea.compiler.bootstrap;

import java.util.HashMap;
import java.util.Map;

import richTea.runtime.node.Branch;
import richTea.runtime.node.TreeNode;

public class BindingSet extends TreeNode {
	
	private Map<String, BindingNode> bindings;
	
	public BindingSet() {
		bindings = new HashMap<String, BindingNode>();
	}
	
	public void registerBinding(BindingNode binding) {
		bindings.put(binding.getName().toLowerCase(), binding);
	}
	
	public BindingNode getBinding(String bindingName) {
		return bindings.get(bindingName.toLowerCase());
	}
	
	public BindingNode[] getBindings() {
		return bindings.values().toArray(new BindingNode[bindings.size()]);
	}
	
	@Override
	public void setBranch(Branch branch) {
		super.setBranch(branch);
		
		if(branch.getName().equalsIgnoreCase("bindings")) {
			for(TreeNode child : branch.getChildren()) {
				if(child instanceof BindingNode) {
					registerBinding((BindingNode) child);
				}
			}
		}
	}
}