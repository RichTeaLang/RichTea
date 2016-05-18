package richTea.execution;

import richTea.attribute.PrimativeAttribute;

public class EventDispatcher {

	public static final String EVENT_ATTRIBUTE_NAME = "event";
	
	private ExecutionContext context;
	
	public EventDispatcher(ExecutionContext context) {
		this.context = new ExecutionContext(context.getCurrentScope());
	}
	
	public ExecutionContext getExeutionContext() {
		return context;
	}
	
	protected boolean dispatchEvent(String eventName, Object event) {
		return getExeutionContext().executeBranch(eventName, new PrimativeAttribute(EVENT_ATTRIBUTE_NAME, event));
	}
}