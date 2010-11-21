package richTea.core.attribute;

import richTea.core.attribute.modifier.AttributeModifier;
import richTea.core.node.TreeNode;

public interface Attribute {
	
	public String getName();
	public void setName(String name);
	
	public TreeNode getOwner();
	public void setOwner(TreeNode owner);
	
	public Object getValue();
	public Object modify(AttributeModifier modifier);
}