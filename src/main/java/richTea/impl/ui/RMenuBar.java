package richTea.impl.ui;

import javax.swing.JMenuBar;

import richTea.core.execution.AbstractFunction;

public class RMenuBar extends AbstractFunction {

	@Override
	protected void run() throws Exception {
		JMenuBar menuBar = new JMenuBar();
		
		context.setLastReturnValue(menuBar);
		
		context.executeBranch("content");
		
		context.setLastReturnValue(menuBar);
	}

}
