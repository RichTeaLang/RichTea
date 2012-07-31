package richTea.impl;

import richTea.core.execution.AbstractFunction;

public class Print extends AbstractFunction {

	@Override
	protected void run() {
		String message = getMessage();
		
		if(prependNewLine()) {
			message = "\n" + message;
		}
		
		if(appendNewLine()) {
			message += "\n";
		}
		
		System.out.print(message);
		
		context.setLastReturnValue(message);
	}
	
	protected String getMessage() {
		return context.getString("message");
	}
	
	protected boolean prependNewLine() {
		return context.getBooleanOrDefault("prependNewLine", false);
	}
	
	protected boolean appendNewLine() {
		return context.getBooleanOrDefault("appendNewLine", true);
	}
}