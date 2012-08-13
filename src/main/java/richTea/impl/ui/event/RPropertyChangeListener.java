package richTea.impl.ui.event;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import richTea.core.execution.EventDispatcher;
import richTea.core.execution.ExecutionContext;

public class RPropertyChangeListener extends EventDispatcher implements PropertyChangeListener {

	public RPropertyChangeListener(ExecutionContext context) {
		super(context);
	}

	@Override
	public void propertyChange(PropertyChangeEvent e) {
		dispatchEvent("propertyChange", e);
	}
}