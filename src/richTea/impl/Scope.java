package richTea.impl;

import richTea.core.execution.AbstractFunction;

public class Scope extends AbstractFunction {

	@Override
	protected void run() {
		context.executeBranch("do");
	}
}