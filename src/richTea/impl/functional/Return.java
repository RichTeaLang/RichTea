package richTea.impl.functional;

import richTea.core.execution.AbstractFunction;
import richTea.core.execution.ReturnException;

public class Return extends AbstractFunction {

	@Override
	protected void run() throws Exception {
		context.setLastReturnValue(getReturnValue());
		
		// This runtime exception should be handled by a Scope function causing execution to jump outside of that scope
		throw new ReturnException(context.getExecutionStack());
	}
	
	protected Object getReturnValue() {
		return context.getValue("value");
	}
}