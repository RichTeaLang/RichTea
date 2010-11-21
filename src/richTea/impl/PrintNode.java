package richTea.impl;

import richTea.core.execution.AbstractFunction;

public class PrintNode extends AbstractFunction {

	@Override
	protected void run() {
		Object message = getMessage();

		if(prependNewLine()) {
			System.out.println();
		}
		
		System.out.print(message);
		
		if(appendNewLine()) {
			System.out.println();
		}
	}
	
	protected Object getMessage() {
		return context.getValue("message");
	}
	
	protected boolean prependNewLine() {
		return context.getBoolean("prependNewLine");
	}
	
	protected boolean appendNewLine() {
		return context.getBoolean("appendNewLine");
	}
}