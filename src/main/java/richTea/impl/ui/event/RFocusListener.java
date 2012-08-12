package richTea.impl.ui.event;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import richTea.core.execution.EventDispatcher;
import richTea.core.execution.ExecutionContext;

public class RFocusListener extends EventDispatcher implements FocusListener {

	public RFocusListener(ExecutionContext context) {
		super(context);
	}

	@Override
	public void focusGained(FocusEvent e) {
		dispatchEvent("focusGained", e);
	}

	@Override
	public void focusLost(FocusEvent e) {
		dispatchEvent("focusLost", e);
	}
}