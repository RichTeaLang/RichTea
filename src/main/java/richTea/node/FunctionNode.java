package richTea.node;

import richTea.execution.RichTeaFunction;

public class FunctionNode extends BasicNode {
	
	private RichTeaFunction function;
	
	public RichTeaFunction getFunction() {
		return function;
	}
	
	public void setFunction(RichTeaFunction function) {
		this.function = function;
	}
}
