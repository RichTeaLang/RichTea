package richTea.attribute.math;

import richTea.attribute.Attribute;

public class PlusAttribute extends AbstractMathExpressionAttribute {

	public PlusAttribute(String name, Attribute leftOperand, Attribute rightOperand) {
		super(name, leftOperand, rightOperand);
	}
	
	@Override
	protected Object getValue(Object value1, Object value2) {
		Object value = super.getValue(value1, value2);
		
		if(value == null) {
			// If we couldn't perform a typical math operation, we concat the values as Strings
			value = String.valueOf(value1) + String.valueOf(value2);
		}
		
		return value;
	}
	
	@Override
	protected Number getValue(double value1, double value2) {
		return value1 + value2;
	}
}
