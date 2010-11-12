package richTea.core.attribute.bool;

import richTea.core.attribute.Attribute;

public class OrAttribute extends AbstractBooleanExpressionAttribute {

	public OrAttribute(String name, Attribute leftOperand, Attribute rightOperand) {
		super(name, leftOperand, rightOperand);
	}

	@Override
	protected boolean getValue(boolean value1, boolean value2) {
		return value1 || value2;
	}
}