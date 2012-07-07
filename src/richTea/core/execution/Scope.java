package richTea.core.execution;

import richTea.core.attribute.Attribute;
import richTea.core.attribute.AttributeSet;
import richTea.core.node.TreeNode;

public class Scope extends AttributeSet {

	private TreeNode owner;
	private Scope parent;
	
	public Scope(TreeNode owner) {
		this(owner, null);
	}
	
	public Scope(TreeNode owner, Scope parent) {
		this.owner = owner;
		this.parent = parent;
	}
	
	public TreeNode getOwner() {
		return owner;
	}
	
	public Scope getParent() {
		return parent;
	}
	
	@Override
	public Attribute getAttribute(String attributeName) {
		Attribute attribute = super.getAttribute(attributeName);
		
		if(attribute == null) {
			attribute = owner.getAttribute(attributeName);
		}
		
		return attribute;
	}
	
	@Override
	public boolean hasAttribute(String attributeName) {
		return super.hasAttribute(attributeName) || getOwner().hasAttribute(attributeName);
	}
}
