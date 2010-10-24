package richTea.core.factory.bindings;

import java.util.HashMap;
import java.util.Map;
import richTea.core.node.TreeNode;

public class BindingSet extends TreeNode {
	
	private Map<String, Binding> bindings;
	
	public BindingSet() {
		bindings = new HashMap<String, Binding>();
	}
	
	public void registerBinding(Binding binding) {
		bindings.put(binding.getBindingName().toLowerCase(), binding);
	}
	
	public Binding getBinding(String bindingName) {
		return bindings.get(bindingName.toLowerCase());
	}
	
	@Override
	public boolean addChild(TreeNode child) {
		if((child instanceof Binding) && super.addChild(child)) {
			registerBinding((Binding) child);
		}
		
		return containsChild(child);
	}
}