package richTea.impl;

import richTea.core.attribute.PrimativeAttribute;
import richTea.core.execution.AbstractFunction;
import richTea.core.execution.VariableScope;

public class Let extends AbstractFunction {

	@Override
	protected void run() throws Exception {
		VariableScope scope = context.getCurrentScope().getParent();
		
		if(scope != null) {
			scope.setAttribute(new PrimativeAttribute(getVariableName(), getVariableValue()));
		} else {
			throw new IllegalArgumentException("No scope to create variable");
		}
	}
	
	protected String getVariableName() {
		return context.getString("var");
	}

	protected Object getVariableValue() {
		return context.getValue("be");
	}
}
