package richTea.core.attribute.math;

import richTea.core.attribute.Attribute;

public class ModulusAttribute extends AbstractMathExpressionAttribute {

	public ModulusAttribute(String name, Attribute leftOperand, Attribute rightOperand) {
		super(name, leftOperand, rightOperand);
	}

	@Override
	protected Object getValue(double value1, double value2) {
		return value1 % value2;
	}
}