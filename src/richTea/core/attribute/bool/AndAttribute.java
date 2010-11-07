package richTea.core.attribute.bool;

import java.util.List;

import richTea.core.attribute.Attribute;

public class AndAttribute extends AbstractBooleanExpressionAttribute {

	public AndAttribute(String name, List<Attribute> operands) {
		super(name, operands);
	}

	@Override
	protected boolean getValue(boolean value1, boolean value2) {
		return value1 && value2;
	}
}