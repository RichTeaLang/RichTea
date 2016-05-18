package richTea.attribute.bool;

import richTea.attribute.Attribute;

public class NotEqualsAttribute extends EqualsAttribute {

	public NotEqualsAttribute(String name, Attribute leftOperand, Attribute rightOperand) {
		super(name, leftOperand, rightOperand);
	}
	
	@Override 
	protected Boolean getValue(Object value1, Object value2) {
		return !super.getValue(value1, value2);
	}
}