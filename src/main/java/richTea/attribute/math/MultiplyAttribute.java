package richTea.attribute.math;

import richTea.attribute.Attribute;

public class MultiplyAttribute extends AbstractMathExpressionAttribute {

	public MultiplyAttribute(String name, Attribute leftOperand, Attribute rightOperand) {
		super(name, leftOperand, rightOperand);
	}

	@Override
	protected Number getValue(double value1, double value2) {
		return value1 * value2;
	}
}