package richTea.impl.ui.event;

import java.awt.event.ContainerEvent;
import java.awt.event.ContainerListener;

import richTea.core.execution.EventDispatcher;
import richTea.core.execution.ExecutionContext;

public class RContainerListener extends EventDispatcher implements ContainerListener {

	public RContainerListener(ExecutionContext context) {
		super(context);	
	}
	
	@Override
	public void componentAdded(ContainerEvent e) {
		dispatchEvent("componentAdded", e);
	}

	@Override
	public void componentRemoved(ContainerEvent e) {
		dispatchEvent("componentRemoved", e);
	}
}