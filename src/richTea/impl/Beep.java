package richTea.impl;

import java.awt.Toolkit;

import richTea.core.execution.AbstractFunction;

public class Beep extends AbstractFunction {

	@Override
	protected void run() {
		Toolkit.getDefaultToolkit().beep();
	}

}
