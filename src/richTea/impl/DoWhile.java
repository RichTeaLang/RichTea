package richTea.impl;

import richTea.core.execution.AbstractFunction;

public class DoWhile extends AbstractFunction {

	@Override
	protected void run() {
		while(getWhileCondition()) {
			context.executeBranch("action");
		}
	}
	
	protected boolean getWhileCondition() {
		return context.getBoolean("while");
	}
}