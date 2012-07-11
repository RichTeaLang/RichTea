package richTea.impl;

import richTea.core.execution.AbstractFunction;
import richTea.core.execution.ReturnException;

public class Scope extends AbstractFunction {
	
	@Override
	protected void run() {
		try {
			context.executeBranch("do");
		}catch(ReturnException e) {
			context.unRollScopeTo(this);
		}
	}
}