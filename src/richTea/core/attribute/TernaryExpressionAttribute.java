package richTea.core.attribute;

import richTea.core.node.TreeNode;

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
	public void setOwner(TreeNode owner) {
		super.setOwner(owner);
		
		getExpression().setOwner(owner);
		getTrueAttribute().setOwner(owner);
		getFalseAttribute().setOwner(owner);
	}

	@Override
	public Object getValue() {
		boolean expressionResult = Boolean.parseBoolean(String.valueOf(getExpression().getValue()));
		
		return expressionResult ? getTrueAttribute().getValue() : getFalseAttribute().getValue();
	}
}
