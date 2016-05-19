package richTea.runtime.attribute.function;

import richTea.runtime.attribute.AbstractAttribute;
import richTea.runtime.execution.ExecutionContext;
import richTea.runtime.node.TreeNode;

public class ExecutableFunctionAttribute extends AbstractAttribute {

	private FunctionAttribute functionAttribute;
	
	public ExecutableFunctionAttribute(String name, FunctionAttribute functionAttribute) {
		super(name);
		
		this.functionAttribute = functionAttribute;
	}
	
	public FunctionAttribute getFunctionAttribute() {
		return functionAttribute;
	}
	
	@Override
	public Object getValue(ExecutionContext context) {
		TreeNode functionNode = getFunctionAttribute().getFunctionNode();
		
		functionNode.setParent(context.getCurrentNode());
		
		Object returnValue = context.execute(functionNode);
		
		functionNode.setParent(null);
		
		return returnValue;
	}
}