package richTea.runtime.attribute.bool;

import richTea.runtime.attribute.Attribute;
import richTea.runtime.attribute.expression.AbstractExpressionAttribute;

public abstract class AbstractBooleanExpressionAttribute extends AbstractExpressionAttribute {

	public AbstractBooleanExpressionAttribute(String name, Attribute leftOperand, Attribute rightOperand) {
		super(name, leftOperand, rightOperand);;
	}

	@Override
	protected Boolean getValue(Object value1, Object value2) {
		boolean booleanValue1 = Boolean.parseBoolean(value1.toString());
		boolean booleanValue2 = Boolean.parseBoolean(value2.toString());
		
		return getValue(booleanValue1, booleanValue2);
	}
	
	abstract protected boolean getValue(boolean value1, boolean value2);
}