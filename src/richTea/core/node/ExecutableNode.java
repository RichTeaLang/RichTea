package richTea.core.node;

import richTea.core.execution.RichTeaFunction;

public class ExecutableNode extends BasicNode {
	
	private RichTeaFunction function;
	
	public RichTeaFunction getFunction() {
		return function;
	}
	
	public void setRichTeaFunction(RichTeaFunction function) {
		this.function = function;
	}
}
