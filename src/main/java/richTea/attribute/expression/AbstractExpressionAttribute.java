package richTea.attribute.expression;

import richTea.attribute.AbstractAttribute;
import richTea.attribute.Attribute;
import richTea.execution.ExecutionContext;

public abstract class AbstractExpressionAttribute extends AbstractAttribute implements ExpressionAttribute {

	private Attribute leftOperand;
	private Attribute rightOperand;

	public AbstractExpressionAttribute(String name, Attribute leftOperand, Attribute rightOperand) {
		super(name);
		
		this.leftOperand = leftOperand;
		this.rightOperand = rightOperand;
	}
	
	public Attribute getLeftOperand() {
		return leftOperand;
	}
	
	public Attribute getRightOperand() {
		return rightOperand;
	}

	public Object getValue(ExecutionContext context) {
		Object value1 = getLeftOperand().getValue(context);
		Object value2 = getRightOperand().getValue(context);
		
		return getValue(value1, value2);
	}
	
	abstract protected Object getValue(Object value1, Object value2);
}