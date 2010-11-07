package richTea.core.attribute.bool;

import java.util.List;

import richTea.core.attribute.Attribute;
import richTea.core.attribute.ExpressionAttribute;

public class EqualsAttribute extends ExpressionAttribute {

	public EqualsAttribute(String name, List<Attribute> operands) {
		super(name, operands);
	}

	@Override
	protected Boolean getValue(Object value1, Object value2) {
		return value1.equals(value2);
	}
}