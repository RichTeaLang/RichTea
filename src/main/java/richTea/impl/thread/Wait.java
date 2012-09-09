package richTea.impl.thread;

import richTea.core.execution.AbstractFunction;

public class Wait extends AbstractFunction {

	@Override
	protected void run() throws Exception {
		Thread.sleep(getTimeout());
	}
	
	protected int getTimeout() {
		return (int) context.getNumber("timeout");
	}
}