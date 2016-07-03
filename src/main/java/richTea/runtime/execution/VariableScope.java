package richTea.runtime.execution;

import java.util.HashMap;
import java.util.Map;

import richTea.compiler.bootstrap.Binding;
import richTea.runtime.attribute.Attribute;
import richTea.runtime.attribute.AttributeSet;
import richTea.runtime.node.TreeNode;

public class VariableScope extends AttributeSet {

	private TreeNode owner;
	private VariableScope parent;
	
	public VariableScope(TreeNode owner) {
		this(owner, null);
	}
	
	public VariableScope(TreeNode owner, VariableScope parent) {
		this.owner = owner;
		this.parent = parent;
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
		
		if(attribute == null && owner != null) {
			attribute = owner.getAttribute(attributeName);
			
			if(attribute == null) {
				Binding binding = owner.getBinding();
				
				if(binding != null) {
					attribute = binding.getDefinition().getDefaultAttributes().getAttribute(attributeName);
				}
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
		return super.hasAttribute(attributeName) || (owner != null && owner.hasAttribute(attributeName));
	}
	
	@Override
	public Attribute[] getAttributes() {
		Map<String, Attribute> attributes = new HashMap<>();
		
		for(Attribute attribute : super.getAttributes()) {
			attributes.put(attribute.getName(), attribute);
		}
		
		if (owner != null) {
			for(Attribute attribute : owner.getAttributes()) {
				if (! attributes.containsKey(attribute.getName())) {
					attributes.put(attribute.getName(), attribute);
				}
			}
			
			for(Attribute attribute : owner.getBinding().getDefinition().getDefaultAttributes().getAttributes()) {
				if (! attributes.containsKey(attribute.getName())) {
					attributes.put(attribute.getName(), attribute);
				}
			}
		}
		
		return attributes.values().toArray(new Attribute[attributes.size()]);
	}
	
	@Override
	public String toString() {
		String ownerName = owner != null ? owner.getFunction().getClass().getSimpleName() : "";
		StringBuilder string = new StringBuilder(ownerName);
		Attribute[] attributes = getAttributes();
		
		if (attributes.length > 0) {
			string.append("\n  Attibutes:");
			
			for (Attribute attribute : attributes) {
				string.append("\n\t" + attribute.toString());
			}
		}
		
		return string.toString();
	}
}
