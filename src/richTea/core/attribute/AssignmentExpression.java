package richTea.core.attribute;

import richTea.core.attribute.expression.ExpressionAttribute;
import richTea.core.attribute.modifier.SetModifier;
import richTea.core.node.TreeNode;

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
	public void setOwner(TreeNode owner) {
		super.setOwner(owner);
		
		getExpression().setOwner(owner);
	}
	
	@Override 
	public Object getValue() {
		ExpressionAttribute expression = getExpression();
		
		Object value = expression.getValue();
		
		expression.getLeftOperand().modify(new SetModifier(value));
		
		return value;
	}
}