package richTea.test.testLib.exports;

import richTea.runtime.execution.AbstractFunction;

public class Assert extends AbstractFunction {

	@Override
	protected void run() throws Exception {
		boolean expected = context.getBoolean("expected");
		String message = context.getString("message");
		
		org.junit.Assert.assertEquals(message, expected, true);
	}
}
