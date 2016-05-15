package richTea.core.attribute.function;

import richTea.core.attribute.AbstractAttribute;
import richTea.core.execution.ExecutionContext;
import richTea.core.node.TreeNode;

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