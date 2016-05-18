package richTea.attribute.function;

import richTea.attribute.AbstractAttribute;
import richTea.execution.ExecutionContext;
import richTea.node.TreeNode;

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