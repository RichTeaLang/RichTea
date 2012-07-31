package richTea.impl.io;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import richTea.core.execution.AbstractFunction;

public class GetTextInput extends AbstractFunction {

	@Override
	protected void run() throws Exception {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		
		context.setLastReturnValue(input.readLine());
		
		input.close();
	}
}
