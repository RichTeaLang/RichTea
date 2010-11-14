package richTea.core.attribute.expression;

import richTea.core.attribute.Attribute;

public interface ExpressionAttribute extends Attribute {
	public Attribute getLeftOperand();
	public Attribute getRightOperand();
}