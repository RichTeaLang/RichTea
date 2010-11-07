package richTea.core.attribute.bool;

import java.util.List;

import richTea.core.attribute.Attribute;

public class OrAttribute extends AbstractBooleanExpressionAttribute {

	public OrAttribute(String name, List<Attribute> operands) {
		super(name, operands);
	}

	@Override
	protected boolean getValue(boolean value1, boolean value2) {
		return value1 || value2;
	}
}