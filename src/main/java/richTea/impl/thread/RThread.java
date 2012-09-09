package richTea.impl.thread;

import richTea.core.execution.AbstractFunction;
import richTea.core.execution.ExecutionContext;

public class RThread extends AbstractFunction {

	@Override
	protected void run() throws Exception {
		Thread thread = new Thread(new RichTeaThreadRunnable(context));
		
		context.setLastReturnValue(thread);
		
		thread.start();
	}
	
	private class RichTeaThreadRunnable implements Runnable {
		
		private ExecutionContext context;
		
		public RichTeaThreadRunnable(ExecutionContext context) {
			this.context = new ExecutionContext(context.getCurrentScope());
		}
		
		public ExecutionContext getExecutionContext() {
			return context;
		}

		@Override
		public void run() {
			getExecutionContext().executeBranch("do");
		}
	}
}
