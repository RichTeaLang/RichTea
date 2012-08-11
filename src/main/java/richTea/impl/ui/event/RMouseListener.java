package richTea.impl.ui.event;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import richTea.core.execution.ExecutionContext;

public class RMouseListener extends EventHandler implements MouseListener {

	public RMouseListener(ExecutionContext context) {
		super(context);
	}
	
	@Override
	public void mouseReleased(MouseEvent e) {
		dispatchEvent("mouseReleased", e);
	}
	
	@Override
	public void mousePressed(MouseEvent e) {
		dispatchEvent("mousePressed", e);
	}
	
	@Override
	public void mouseExited(MouseEvent e) {
		dispatchEvent("mouseExited", e);
	}
	
	@Override
	public void mouseEntered(MouseEvent e) {
		dispatchEvent("mouseEntered", e);
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		dispatchEvent("mouseClicked", e);
	}
}