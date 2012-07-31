package richTea.core.attribute.math;

import richTea.core.attribute.Attribute;

public class MinusAttribute extends AbstractMathExpressionAttribute {

	public MinusAttribute(String name, Attribute leftOperand, Attribute rightOperand) {
		super(name, leftOperand, rightOperand);
	}

	@Override
	protected Number getValue(double value1, double value2) {
		return value1 - value2;
	}
}