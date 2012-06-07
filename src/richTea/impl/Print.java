package richTea.impl;

import richTea.core.execution.AbstractFunction;

public class Print extends AbstractFunction {

	@Override
	protected void run() {
		String message = getMessage().toString();
		
		if(prependNewLine()) {
			message = "\n" + message;
		}
		
		if(appendNewLine()) {
			message += "\n";
		}
		
		System.out.print(message);
		
		context.returnValue(message);
	}
	
	protected Object getMessage() {
		return context.getValue("message");
	}
	
	protected boolean prependNewLine() {
		return context.getBooleanOrDefault("prependNewLine", false);
	}
	
	protected boolean appendNewLine() {
		return context.getBooleanOrDefault("appendNewLine", true);
	}
}