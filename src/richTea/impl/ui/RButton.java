package richTea.impl.ui;

import javax.swing.JButton;
import javax.swing.JFrame;

import richTea.core.execution.AbstractFunction;
import richTea.impl.ui.event.RMouseListener;

public class RButton extends AbstractFunction {

	@Override
	protected void run() throws Exception {
		JFrame frame = getFrame();
		
		JButton button = new JButton(getText());
		
		button.addMouseListener(new RMouseListener(context));
		
		frame.add(button);
		frame.validate();
	}
	
	protected JFrame getFrame() {
		return (JFrame) context.getValueOrDefault("frame", context.getLastReturnValue());
	}
	
	protected String getText() {
		return context.getString("text");
	}
	
	protected int getX() {
		return (int) context.getNumberOrDefault("x", 0);
	}
	
	protected int getY() {
		return (int) context.getNumberOrDefault("y", 0);
	}

}
