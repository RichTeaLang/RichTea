package richTea.core.resolver;

import richTea.core.node.TreeNode;

public class TreeNodeResolver extends BasicNodeResolver {

	public TreeNodeResolver(TreeNode owner) {
		super(owner);
	}
	
	@Override
	public TreeNode getOwner() {
		return (TreeNode) super.getOwner();
	}
	
	@Override
	public Object getValue(String key) {
		Object value = super.getValue(key);
		
		TreeNode owner = getOwner();
		
		if(value == null && !owner.getAttributes().hasAttribute(key)) {
			if(value == null) {
				// Couldn't find a child to return, so look in the parent node
				TreeNode parent = owner.getParent();
				
				if(parent != null) {
					value = parent.getValue(key);
				}
				
				if(value == null) {
					// Couldn't find an attribute to return, so lookup children in the node
					value = owner.getChildByID(key);
				}
			}
		}
		
		return value;
	}
}