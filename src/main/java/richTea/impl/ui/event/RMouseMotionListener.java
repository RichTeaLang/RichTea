package richTea.impl.ui.event;

import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import richTea.core.execution.EventDispatcher;
import richTea.core.execution.ExecutionContext;

public class RMouseMotionListener extends EventDispatcher implements MouseMotionListener {

	public RMouseMotionListener(ExecutionContext context) {
		super(context);
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		dispatchEvent("mouseDragged", e);
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		dispatchEvent("mouseMoved", e);
	}
}