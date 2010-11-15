 package richTea.core.resolver;

import richTea.core.node.TreeNode;

public class TreeNodeResolver extends BasicNodeResolver {

	public TreeNodeResolver(TreeNode owner) {
		super(owner);
	}
	
	@Override
	public TreeNode getContext() {
		return (TreeNode) super.getContext();
	}
	
	@Override
	public Object getValue(String key) {
		Object value = super.getValue(key);
		
		TreeNode owner = getContext();
		
		if(value == null && !owner.getAttributes().hasAttribute(key)) {			
			// Couldn't find an attribute to return, so lookup branches in the node
			value = owner.getBranchByName(key);
		}
		
		return value;
	}
}