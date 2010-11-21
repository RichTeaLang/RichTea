package richTea.core.node;

import java.util.ArrayList;
import java.util.List;

public class Branch {
	
	private String name;
	private TreeNode parent;
	private List<TreeNode> children;
	
	public Branch(String name) {
		setName(name);
		
		children = new ArrayList<TreeNode>();
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setParent(TreeNode parent) {
		this.parent = parent;
		
		for(TreeNode child : getChildren()) {
			child.setParent(parent);
		}
	}
	
	public TreeNode getParent() {
		return parent;
	}

	public boolean addChild(TreeNode child) {
		boolean added = false;
		
		if(!containsChild(child)) {
			children.add(child);
			
			added = true;
		}
		
		return added;
	}
	
	public boolean containsChild(TreeNode child) {
		return children.contains(child);
	}
	
	public TreeNode[] getChildren() {
		return children.toArray(new TreeNode[children.size()]);
	}
	
	public boolean removeChild(TreeNode child) {
		boolean removed = false;
		
		if(containsChild(child) && children.remove(child)) {
			child.setParent(null);
			
			removed = true;
		}
		
		return removed;
	}
}