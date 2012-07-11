package richTea.impl.ui;

import javax.swing.JMenu;
import javax.swing.JMenuBar;

import richTea.core.execution.AbstractFunction;

public class RMenuItem extends AbstractFunction {

	@Override
	protected void run() throws Exception {
		JMenu menu = new JMenu();
		
		menu.setText(context.getString("text"));
		
		((JMenuBar) context.getLastReturnValue()).add(menu);
	}

}
