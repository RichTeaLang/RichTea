package richTea.impl;

import richTea.core.execution.AbstractFunction;

public class PrintNode extends AbstractFunction {

	@Override
	protected void run() {
		Object message = getMessage();
		
		if(appendNewLine()) {
			System.out.println(message);
		}else {
			System.out.print(message);
		}
	}
	
	protected Object getMessage() {
		return getValue("message");
	}
	
	protected Boolean appendNewLine() {
		return getBoolean("appendNewLine");
	}
}