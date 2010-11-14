package richTea.impl;

import richTea.core.execution.AbstractFunction;

public class DoWhile extends AbstractFunction {

	@Override
	protected void run() {
		while(getWhile()) {
			doAction();
		}
	}
	
	protected void doAction() {
		getValue("action");
	}
	
	protected boolean getWhile() {
		return getBoolean("while");
	}

}
