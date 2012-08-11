package richTea.impl.ui.event;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import richTea.core.execution.ExecutionContext;

public class RWindowListener extends EventHandler implements WindowListener {

	public RWindowListener(ExecutionContext context) {
		super(context);
	}
	
	@Override
	public void windowActivated(WindowEvent e) {
		dispatchEvent("windowActivated", e);
	}

	@Override
	public void windowClosed(WindowEvent e) {
		dispatchEvent("windowClosed", e);
	}

	@Override
	public void windowClosing(WindowEvent e) {
		dispatchEvent("windowClosing", e);
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		dispatchEvent("windowDeactivated", e);
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		dispatchEvent("windowDeiconified", e);
	}

	@Override
	public void windowIconified(WindowEvent e) {
		dispatchEvent("windowIconified", e);
	}

	@Override
	public void windowOpened(WindowEvent e) {
		dispatchEvent("windowOpened", e);
	}
}