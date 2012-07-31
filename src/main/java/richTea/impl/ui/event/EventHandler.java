package richTea.impl.ui.event;

import richTea.core.execution.ExecutionContext;

public class EventHandler {

	private ExecutionContext context;
	
	public EventHandler(ExecutionContext context) {
		this.context = new ExecutionContext(context.getCurrentScope());
	}
	
	public ExecutionContext getExeutionContext() {
		return context;
	}
}
