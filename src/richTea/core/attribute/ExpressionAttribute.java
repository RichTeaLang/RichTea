package richTea.core.attribute;

import java.util.List;

import richTea.core.resolver.Resolver;

public abstract class ExpressionAttribute extends PrimativeAttribute {

	public ExpressionAttribute(String name, List<Attribute> operands) {
		super(name, operands);
		
		int operandCount = operands.size();
		
		if(operandCount > 2) {
			throw new IllegalArgumentException(String.format("Expected 2 operands - Got %s", operandCount));
		}
	}
	
	@Override 
	public void setContext(Resolver context) {
		for(Attribute attribute : getInitialValue()) {
			attribute.setContext(context);
		}
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Attribute> getInitialValue() {
		return (List<Attribute>) super.getInitialValue();
	}
	
	public Attribute getOperand(int number) {
		return getInitialValue().get(number);
	}
	
	public Object getValue() {
		Object value1 = getOperand(0).getValue();
		Object value2 = getOperand(1).getValue();
		
		return getValue(value1, value2);
	}
	
	abstract protected Object getValue(Object value1, Object value2);
}