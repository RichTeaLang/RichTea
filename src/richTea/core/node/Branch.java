package richTea.core.node;

import java.util.ArrayList;
import java.util.List;

public class Branch extends TreeNode {
	
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

	public void addChild(TreeNode child) {		
		if(!containsChild(child)) {
			child.setParent(parent);
			children.add(child);
		}
	}
	
	public boolean containsChild(TreeNode child) {
		return children.contains(child);
	}
	
	public TreeNode[] getChildren() {
		return children.toArray(new TreeNode[children.size()]);
	}
	
	public void removeChild(TreeNode child) {		
		if(containsChild(child) && children.remove(child)) {
			child.setParent(null);
		}
	}
}