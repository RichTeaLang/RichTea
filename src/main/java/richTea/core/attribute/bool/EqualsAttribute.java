package richTea.core.attribute.bool;

import richTea.core.attribute.Attribute;
import richTea.core.attribute.expression.AbstractExpressionAttribute;

public class EqualsAttribute extends AbstractExpressionAttribute {

	public EqualsAttribute(String name, Attribute leftOperand, Attribute rightOperand) {
		super(name, leftOperand, rightOperand);
	}

	@Override
	protected Boolean getValue(Object value1, Object value2) {
		return value1.equals(value2);
	}
}