package richTea.attribute.bool;

import richTea.attribute.Attribute;
import richTea.attribute.expression.AbstractExpressionAttribute;

public class EqualsAttribute extends AbstractExpressionAttribute {

	public EqualsAttribute(String name, Attribute leftOperand, Attribute rightOperand) {
		super(name, leftOperand, rightOperand);
	}

	@Override
	protected Boolean getValue(Object value1, Object value2) {
		return value1.equals(value2);
	}
}