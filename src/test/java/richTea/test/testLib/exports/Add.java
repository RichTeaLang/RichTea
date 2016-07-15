package richTea.test.testLib.exports;

import richTea.runtime.execution.AbstractFunction;

public class Add extends AbstractFunction {
	
	@Override
	protected void run() {
		int x = context.getNumber("x").intValue();
		int y = context.getNumber("to").intValue();
		
		context.setLastReturnValue(x + y);
	}
}
