package richTea.impl;

import richTea.core.execution.AbstractFunction;
import richTea.core.execution.ReturnException;

public class Scope extends AbstractFunction {
	
	@Override
	protected void run() {
		try {
			context.executeBranch("do");
		}catch(ReturnException e) {
			/* Return encountered.  Swallowing the "exception" here will cause the program execution to jump out of the
			 * enclosing scope in which the Return function was contained. */
		}
	}
}