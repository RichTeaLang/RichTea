package richTea.core.node;

import java.util.ArrayList;
import java.util.List;

public class Branch extends AttributeContainerNode {
	
	protected TreeNode parent;
	
	protected List<TreeNode> children;
	
	public Branch(String name) {
		setName(name);
		setValue("children", children = new ArrayList<TreeNode>());
	}
	
	public String getName() {
		return getString("name");
	}
	
	public void setName(String id) {
		setValue("name", id);
	}
	
	public void setParent(TreeNode parent) {
		setValue("parent", parent);
		
		for(TreeNode child : getChildren()) {
			child.setParent(parent);
		}
	}
	
	public TreeNode getParent() {
		return (TreeNode) getValue("parent");
	}

	public boolean addChild(TreeNode child) {
		if(!containsChild(child)) {

			children.add(child);
		}
		
		return containsChild(child);
	}
	
	public boolean containsChild(TreeNode child) {
		return children.contains(child);
	}
	
	public TreeNode getChildByID(String id) {
		TreeNode requestedChild = null;
		
		if(id != null) {
			for(TreeNode child : getChildren()) {
				if(id.equalsIgnoreCase(child.getID())) {
					requestedChild = child;
					break;
				}
			}
		}
		
		return requestedChild;
	}
	
	public TreeNode[] getChildren() {
		return children.toArray(new TreeNode[children.size()]);
	}
	
	public boolean removeChild(TreeNode child) {
		if(containsChild(child) && children.remove(child)) {
			child.setParent(getParent());
		}
		
		return containsChild(child);
	}
}