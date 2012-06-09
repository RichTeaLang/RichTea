package richTea.impl.functional;

import richTea.core.execution.AbstractFunction;

public class Return extends AbstractFunction {

	@Override
	protected void run() throws Exception {
		context.doReturn(getReturnValue());
	}
	
	protected Object getReturnValue() {
		return context.getValue("value");
	}
}