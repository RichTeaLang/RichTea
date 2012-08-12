package richTea.impl.ui.event;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import richTea.core.execution.ExecutionContext;

public class RKeyListener extends EventHandler implements KeyListener {

	public RKeyListener(ExecutionContext context) {
		super(context);
	}

	@Override
	public void keyPressed(KeyEvent e) {
		dispatchEvent("keyPressed", e);
	}

	@Override
	public void keyReleased(KeyEvent e) {
		dispatchEvent("keyReleased", e);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		dispatchEvent("keyTyped", e);
	}
}