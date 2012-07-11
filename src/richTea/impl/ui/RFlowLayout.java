package richTea.impl.ui;

import java.awt.FlowLayout;

import javax.swing.JFrame;

import richTea.core.execution.AbstractFunction;

public class RFlowLayout extends AbstractFunction {

	@Override
	protected void run() throws Exception {
		JFrame frame = getFrame();
		
		frame.setLayout(new FlowLayout());
	}
	
	protected JFrame getFrame() {
		return (JFrame) context.getValueOrDefault("frame", context.getLastReturnValue());
	}

}
