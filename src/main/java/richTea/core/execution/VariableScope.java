package richTea.core.execution;

import richTea.core.attribute.Attribute;
import richTea.core.attribute.AttributeSet;
import richTea.core.attribute.PrimativeAttribute;
import richTea.core.factory.bindings.Binding;
import richTea.core.node.TreeNode;

public class VariableScope extends AttributeSet {

	private TreeNode owner;
	private VariableScope parent;
	
	public VariableScope(TreeNode owner) {
		this(owner, null);
	}
	
	public VariableScope(TreeNode owner, VariableScope parent) {
		this.owner = owner;
		this.parent = parent;
		
		setAttribute(new PrimativeAttribute("super", parent));
	}
	
	public TreeNode getOwner() {
		return owner;
	}
	
	public VariableScope getParent() {
		return parent;
	}
	
	public VariableScope getRoot() {
		return getParent() != null ? getParent().getRoot() : this;
	}
	
	@Override
	public Attribute getAttribute(String attributeName) {
		Attribute attribute = super.getAttribute(attributeName);
		
		if(attribute == null) {
			attribute = owner.getAttribute(attributeName);
			
			if(attribute == null) {
				Binding binding = owner.getBinding();
				
				if(binding != null) attribute = binding.getDefaultAttributes().getAttribute(attributeName);
			}
		}
		
		return attribute;
	}
	
	public Attribute resolveAttribute(String attributeName) {
		VariableScope scope = this;
		Attribute attribute = null;
		
		while(scope != null) {
			attribute = scope.getAttribute(attributeName);
			
			if(attribute == null) {
				scope = scope.getParent();
			} else {
				break;
			}
		}
		
		return attribute;
	}
	
	@Override
	public boolean hasAttribute(String attributeName) {
		return super.hasAttribute(attributeName) || getOwner().hasAttribute(attributeName);
	}
}
