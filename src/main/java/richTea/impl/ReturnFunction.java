package richTea.impl;

import richTea.execution.AbstractFunction;
import richTea.execution.ReturnException;

public class ReturnFunction extends AbstractFunction {

	@Override
	protected void run() throws Exception {
		context.setLastReturnValue(getReturnValue());
		
		// This runtime exception should be handled by a Scope function causing execution to jump outside of that scope
		throw new ReturnException(context.getCurrentScope());
	}
	
	protected Object getReturnValue() {
		return context.getValue("value");
	}
}