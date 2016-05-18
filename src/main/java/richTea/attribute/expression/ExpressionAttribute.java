package richTea.attribute.expression;

import richTea.attribute.Attribute;

public interface ExpressionAttribute extends Attribute {
	public Attribute getLeftOperand();
	public Attribute getRightOperand();
}