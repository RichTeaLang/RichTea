package richTea.impl;

import richTea.core.execution.AbstractFunction;

public class Return extends AbstractFunction {

	@Override
	protected void run() throws Exception {
		context.returnValue(getReturnValue());
	}
	
	protected Object getReturnValue() {
		return context.getValue("value");
	}
}