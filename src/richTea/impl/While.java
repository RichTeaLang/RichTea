package richTea.impl;

import richTea.core.execution.AbstractFunction;

public class While extends AbstractFunction {
	
	@Override 
	protected void run() {
		while(getWhileCondition()) {
			context.executeChildren();
		}
		
		context.setRunChildren(false);
	}
	
	protected Boolean getWhileCondition() {
		return getBoolean("condition");
	}
}
