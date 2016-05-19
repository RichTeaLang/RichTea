package richTea.runtime.attribute.expression;

import richTea.runtime.attribute.Attribute;

public interface ExpressionAttribute extends Attribute {
	public Attribute getLeftOperand();
	public Attribute getRightOperand();
}