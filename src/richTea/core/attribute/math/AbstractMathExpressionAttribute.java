package richTea.core.attribute.math;

import richTea.core.attribute.Attribute;
import richTea.core.attribute.expression.AbstractExpressionAttribute;

public abstract class AbstractMathExpressionAttribute extends AbstractExpressionAttribute {

	public AbstractMathExpressionAttribute(String name, Attribute leftOperand, Attribute rightOperand) {
		super(name, leftOperand, rightOperand);
	}
	
	@Override
	protected Object getValue(Object value1, Object value2) {		
		try {
			// Try to convert to numbers
			double doubleValue1 = Double.parseDouble(value1.toString());
			double doubleValue2 = Double.parseDouble(value2.toString());
			
			return getValue(doubleValue1, doubleValue2);
		}catch(NumberFormatException e) {
			return null;
		}
	}
	
	abstract protected Object getValue(double value1, double value2);
}