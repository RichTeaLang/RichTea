package richTea.core.attribute.bool;

import richTea.core.attribute.Attribute;
import richTea.core.attribute.modifier.AttributeModifier;

public class AndAttribute extends AbstractBooleanExpressionAttribute {

	public AndAttribute(String name, Attribute leftOperand, Attribute rightOperand) {
		super(name, leftOperand, rightOperand);;
	}

	@Override
	protected boolean getValue(boolean value1, boolean value2) {
		return value1 && value2;
	}
	
	@Override
	public Object modify(AttributeModifier modifier) {
		getLeftOperand().modify(modifier);
		getRightOperand().modify(modifier);
		
		return getValue(null);
	}
}