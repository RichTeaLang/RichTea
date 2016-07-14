package richTea.runtime.functions;

import richTea.runtime.execution.AbstractFunction;
import richTea.runtime.execution.ReturnException;

public class Scope extends AbstractFunction {
	
	@Override
	protected void run() {
		try {
			context.executeBranch("do");
			context.setLastReturnValue(context.getCurrentNode());
		} catch(ReturnException e) {
			context.unRollScopeTo(this);
		}
	}
}