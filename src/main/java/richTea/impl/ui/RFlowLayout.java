package richTea.impl.ui;

import java.awt.FlowLayout;

import richTea.core.execution.AbstractFunction;

public class RFlowLayout extends AbstractFunction {

	@Override
	protected void run() throws Exception {	
		context.setLastReturnValue(new FlowLayout());
	}
}