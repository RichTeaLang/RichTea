package richTea.core.attribute;

import richTea.core.attribute.modifier.SetModifier;
import richTea.core.resolver.Resolver;

public class AssignmentAttribute extends PrimativeAttribute {

	public AssignmentAttribute(String name, ExpressionAttribute expression) {
		super(name, expression);
	}
	
	@Override
	public void setContext(Resolver context) {
		super.setContext(context);
		
		getInitialValue().setContext(context);
	}
	
	@Override 
	public ExpressionAttribute getInitialValue() {
		return (ExpressionAttribute) super.getInitialValue();
	}
	
	@Override 
	public Object getValue() {
		ExpressionAttribute expression = getInitialValue();
		
		Object value = expression.getValue();
		
		expression.getOperand(0).modify(new SetModifier(value));
		
		return value;
	}
}