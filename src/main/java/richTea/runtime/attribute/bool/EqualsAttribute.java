package richTea.runtime.attribute.bool;

import richTea.runtime.attribute.Attribute;
import richTea.runtime.attribute.expression.AbstractExpressionAttribute;

public class EqualsAttribute extends AbstractExpressionAttribute {

	public EqualsAttribute(String name, Attribute leftOperand, Attribute rightOperand) {
		super(name, leftOperand, rightOperand);
	}

	@Override
	protected Boolean getValue(Object value1, Object value2) {
		return value1.equals(value2);
	}
}