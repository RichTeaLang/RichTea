package richTea.impl;

import richTea.core.execution.AbstractFunction;

public class If extends AbstractFunction {

	@Override
	protected void run() {
		boolean expressionValue = getExpressionValue();
		
		getValue(expressionValue ? "then" : "else");
	}
	
	protected boolean getExpressionValue() {
		return getBoolean("expression");
	}
}