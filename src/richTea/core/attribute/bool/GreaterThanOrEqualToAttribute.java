package richTea.core.attribute.bool;

import java.util.List;

import richTea.core.attribute.Attribute;

public class GreaterThanOrEqualToAttribute extends AbstractMathBooleanExpressionAttribute {

	public GreaterThanOrEqualToAttribute(String name, List<Attribute> operands) {
		super(name, operands);
	}

	@Override
	protected Object getValue(double value1, double value2) {
		return value1 >= value2;
	}
}