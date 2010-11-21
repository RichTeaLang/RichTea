package richTea.impl;

import richTea.core.execution.AbstractFunction;

public class DoWhile extends AbstractFunction {

	@Override
	protected void run() {
		while(getWhile()) {
			context.executeBranch("action");
		}
	}
	
	protected boolean getWhile() {
		return context.getBoolean("while");
	}

}
