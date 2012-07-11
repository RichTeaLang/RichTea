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
		getExeutionContext().executeBranch("windowActivated");
	}

	@Override
	public void windowClosed(WindowEvent e) {
		getExeutionContext().executeBranch("windowClosed");
	}

	@Override
	public void windowClosing(WindowEvent e) {
		getExeutionContext().executeBranch("windowClosing");
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		getExeutionContext().executeBranch("windowDeactivated");
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		getExeutionContext().executeBranch("windowDeiconified");
	}

	@Override
	public void windowIconified(WindowEvent e) {
		getExeutionContext().executeBranch("windowIconified");
	}

	@Override
	public void windowOpened(WindowEvent e) {
		getExeutionContext().executeBranch("windowOpened");
	}

}
