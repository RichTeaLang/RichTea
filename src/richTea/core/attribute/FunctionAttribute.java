package richTea.core.attribute;

import richTea.core.execution.ExecutionContext;
import richTea.core.node.TreeNode;

public class FunctionAttribute extends PrimativeAttribute {

	public FunctionAttribute(String name, TreeNode function) {
		super(name, function);
	}
	
	@Override
	public Object getValue() {
		TreeNode function = (TreeNode) super.getValue();
		
		ExecutionContext executionContext = new ExecutionContext();
		
		return executionContext.execute(function).getReturnValue();
	}
}