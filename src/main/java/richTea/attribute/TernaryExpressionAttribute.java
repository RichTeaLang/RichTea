package richTea.attribute;

import richTea.execution.ExecutionContext;

public class TernaryExpressionAttribute extends AbstractAttribute {

	private Attribute expression;
	private Attribute trueAttribute;
	private Attribute falseAttribute;
	
	public TernaryExpressionAttribute(String name, Attribute expression, Attribute trueAttribute, Attribute falseAttribute) {
		super(name);
		
		this.expression = expression;
		this.trueAttribute = trueAttribute;
		this.falseAttribute = falseAttribute;
	}
	
	public Attribute getExpression() {
		return expression;
	}
	
	public Attribute getTrueAttribute() {
		return trueAttribute;
	}
	
	public Attribute getFalseAttribute() {
		return falseAttribute;
	}

	@Override
	public Object getValue(ExecutionContext context) {
		boolean expressionResult = Boolean.parseBoolean(String.valueOf(getExpression().getValue(context)));
		
		return expressionResult ? getTrueAttribute().getValue(context) : getFalseAttribute().getValue(context);
	}
}
