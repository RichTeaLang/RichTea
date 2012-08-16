package richTea.impl.ui.event;

import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import richTea.core.execution.EventDispatcher;
import richTea.core.execution.ExecutionContext;

public class RListSelectionListener extends EventDispatcher implements ListSelectionListener {

	public RListSelectionListener(ExecutionContext context) {
		super(context);
	}

	@Override
	public void valueChanged(ListSelectionEvent e) {
		dispatchEvent("valueChanged", e);
	}
}