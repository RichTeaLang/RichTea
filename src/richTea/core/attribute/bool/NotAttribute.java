package richTea.core.attribute.bool;

import richTea.core.attribute.AbstractAttribute;
import richTea.core.attribute.Attribute;
import richTea.core.node.TreeNode;

public class NotAttribute extends AbstractAttribute {

	private Attribute initalValue;
	
	public NotAttribute(String name, Attribute initalValue) {
		super(name);
		
		this.initalValue = initalValue;
	}
	
	protected Attribute getInitialValue() {
		return initalValue;
	}
	
	@Override
	public void setOwner(TreeNode owner) {
		super.setOwner(owner);
		
		getInitialValue().setOwner(owner);
	}
	
	@Override
	public Boolean getValue() {
		Object value = getInitialValue().getValue();
		
		return !Boolean.parseBoolean(value.toString());
	}
}