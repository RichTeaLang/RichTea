package richTea.core.attribute;

import richTea.core.attribute.expression.ExpressionAttribute;
import richTea.core.attribute.modifier.SetModifier;
import richTea.core.resolver.Resolver;

public class AssignmentExpression extends AbstractAttribute {

	private ExpressionAttribute expression;
	
	public AssignmentExpression(String name, ExpressionAttribute expression) {
		super(name);
		
		this.expression = expression;
	}
	
	protected ExpressionAttribute getExpression() {
		return expression;
	}
	
	@Override
	public void setContext(Resolver context) {
		super.setContext(context);
		
		getExpression().setContext(context);
	}
	
	@Override 
	public Object getValue() {
		ExpressionAttribute expression = getExpression();
		
		Object value = expression.getValue();
		
		expression.getLeftOperand().modify(new SetModifier(value));
		
		return value;
	}
}