package richTea.impl.ui.event;

import richTea.core.attribute.PrimativeAttribute;
import richTea.core.execution.ExecutionContext;

public class EventHandler {

	public static final String EVENT_ATTRIBUTE_NAME = "event";
	
	private ExecutionContext context;
	
	public EventHandler(ExecutionContext context) {
		this.context = new ExecutionContext(context.getCurrentScope());
	}
	
	public ExecutionContext getExeutionContext() {
		return context;
	}
	
	protected boolean dispatchEvent(String eventName, Object event) {
		return getExeutionContext().executeBranch(eventName, new PrimativeAttribute(EVENT_ATTRIBUTE_NAME, event));
	}
}