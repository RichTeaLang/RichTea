package richTea.core.attribute;

import richTea.core.attribute.expression.ExpressionAttribute;
import richTea.core.attribute.modifier.SetModifier;
import richTea.core.execution.ExecutionContext;

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
	public Object getValue(ExecutionContext context) {
		ExpressionAttribute expression = getExpression();
		
		Object value = expression.getValue(context);
		
		expression.getLeftOperand().modify(context, new SetModifier(value));
		
		return value;
	}
}