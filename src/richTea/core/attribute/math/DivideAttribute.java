package richTea.core.attribute.math;

import java.util.List;

import richTea.core.attribute.Attribute;

public class DivideAttribute extends AbstractMathExpressionAttribute {

	public DivideAttribute(String name, List<Attribute> operands) {
		super(name, operands);
	}

	@Override
	protected Number getValue(double value1, double value2) {
		return value1 / value2;
	}
}
