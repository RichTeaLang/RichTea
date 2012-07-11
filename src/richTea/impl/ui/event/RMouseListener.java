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
		getExeutionContext().executeBranch("mouseReleased");
	}
	
	@Override
	public void mousePressed(MouseEvent e) {
		getExeutionContext().executeBranch("mousePressed");
	}
	
	@Override
	public void mouseExited(MouseEvent e) {
		getExeutionContext().executeBranch("mouseExit");
	}
	
	@Override
	public void mouseEntered(MouseEvent e) {
		getExeutionContext().executeBranch("mouseEntered");
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		getExeutionContext().executeBranch("mouseClicked");
	}
}