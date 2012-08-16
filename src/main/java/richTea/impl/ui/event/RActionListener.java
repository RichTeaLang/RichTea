package richTea.impl.ui.event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import richTea.core.execution.EventDispatcher;
import richTea.core.execution.ExecutionContext;

public class RActionListener extends EventDispatcher implements ActionListener {

	public RActionListener(ExecutionContext context) {
		super(context);	}

	@Override
	public void actionPerformed(ActionEvent e) {
		dispatchEvent("actionPerformed", e);
	}
}