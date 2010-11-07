package richTea.impl;

import richTea.core.execution.AbstractFunction;

public class GetSystemTime extends AbstractFunction {

	@Override
	protected void run() {
		context.doReturn(System.currentTimeMillis());
	}
}