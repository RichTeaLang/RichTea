package richTea.core.attribute.math;

import java.util.List;

import richTea.core.attribute.Attribute;

public class PlusAttribute extends AbstractMathExpressionAttribute {

	public PlusAttribute(String name, List<Attribute> operands) {
		super(name, operands);
	}
	
	@Override
	protected Object getValue(Object value1, Object value2) {
		Object value = super.getValue(value1, value2);
		
		if(value == null) {
			// If we couldn't perform a typical math operation, we concat the values as Strings
			value = value1.toString() + value2.toString();
		}
		
		return value;
	}
	
	@Override
	protected Number getValue(double value1, double value2) {
		return value1 + value2;
	}
}
