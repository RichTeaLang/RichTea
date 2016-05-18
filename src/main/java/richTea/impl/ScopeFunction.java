package richTea.impl;

import richTea.execution.AbstractFunction;
import richTea.execution.ReturnException;

public class ScopeFunction extends AbstractFunction {
	
	@Override
	protected void run() {
		try {
			context.executeBranch("do");
		} catch(ReturnException e) {
			context.unRollScopeTo(this);
		}
	}
}