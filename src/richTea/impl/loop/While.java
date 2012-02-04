package richTea.impl.loop;

import richTea.core.execution.AbstractFunction;

public class While extends AbstractFunction {
	
	@Override 
	protected void run() {
		while(getWhileCondition()) {
			context.executeBranch("do");
		}
	}
	
	protected boolean getWhileCondition() {
		return context.getBoolean("condition");
	}
}
