package richTea.core.attribute.expression;

import richTea.core.attribute.AbstractAttribute;
import richTea.core.attribute.Attribute;
import richTea.core.resolver.Resolver;

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
	
	@Override 
	public void setContext(Resolver context) {
		getLeftOperand().setContext(context);
		getRightOperand().setContext(context);
	}

	public Object getValue() {
		Object value1 = getLeftOperand().getValue();
		Object value2 = getRightOperand().getValue();
		
		return getValue(value1, value2);
	}
	
	abstract protected Object getValue(Object value1, Object value2);
}