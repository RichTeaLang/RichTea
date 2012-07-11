package richTea.impl.ui;

import javax.swing.JFrame;

import richTea.core.execution.AbstractFunction;
import richTea.impl.ui.event.RWindowListener;

public class RFrame extends AbstractFunction {

	@Override
	protected void run() throws Exception {
		JFrame frame = new JFrame(getTitle());
		
		frame.setSize(getWidth(), getHeight());
		frame.setVisible(true);
		
		frame.addWindowListener(new RWindowListener(context));
		
		context.setLastReturnValue(frame);
		context.executeBranch("content");
	}
	
	protected String getTitle() {
		return context.getString("title");
	}
	
	protected int getWidth() {
		return (int) context.getNumberOrDefault("width", 800);
	}
	
	protected int getHeight() {
		return (int) context.getNumberOrDefault("height", 800);
	}

}
