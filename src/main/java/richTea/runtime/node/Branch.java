package richTea.runtime.node;

import java.util.ArrayList;
import java.util.List;

import richTea.runtime.attribute.Attribute;
import richTea.runtime.attribute.PrimativeAttribute;

public class Branch {
	
	private String name;
	private Attribute guard;
	private List<Attribute> attributes;
	private TreeNode parent;
	private List<TreeNode> children;
	
	public Branch(String name) {
		this(name, new PrimativeAttribute("guard", true));
	}
	
	public Branch(String name, Attribute guard) {
		this(name, guard, new ArrayList<Attribute>());
	}
	
	public Branch(String name, Attribute guard, List<Attribute> attributes) {
		this.name = name;
		this.guard = guard;
		this.attributes = attributes;
		this.children = new ArrayList<TreeNode>();
	}
	
	public String getName() {
		return name;
	}
	
	public Attribute getGuard() {
		return guard;
	}
	
	public List<Attribute> getAttributes() {
		return attributes;
	}
	
	public TreeNode getParent() {
		return parent;
	}
	
	public void setParent(TreeNode parent) {
		this.parent = parent;
		
		for(TreeNode child : getChildren()) {
			child.setParent(parent);
		}
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