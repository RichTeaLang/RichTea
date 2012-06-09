package richTea.core.attribute;

import richTea.core.attribute.modifier.AttributeModifier;
import richTea.core.node.TreeNode;

public abstract class AbstractAttribute implements Attribute {
	
	private String name;
	
	private TreeNode owner;
	
	public AbstractAttribute(String name) {
		setName(name);
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public TreeNode getOwner() {
		return owner;
	}

	@Override
	public void setOwner(TreeNode owner) {
		this.owner = owner;
	}
	
	@Override
	public abstract Object getValue();

	@Override
	public Object modify(AttributeModifier modifier) {
		return null;
	}
	
	@Override
	public String toString() {
		return String.format("[%s(%s)] -> %s", getClass().getSimpleName(), getName(), getValue());
	}
}