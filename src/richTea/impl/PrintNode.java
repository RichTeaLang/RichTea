package richTea.impl;

import richTea.core.execution.ExecutionContext;
import richTea.core.node.TreeNode;

public class PrintNode extends TreeNode {

	@Override
	public void execute(ExecutionContext executionContext) {
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