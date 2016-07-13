package richTea.runtime.attribute.function;

import richTea.runtime.execution.ExecutionContext;
import richTea.runtime.node.TreeNode;

public class FunctionAttribute extends NodeReferenceAttribute {

	public FunctionAttribute(String name, TreeNode node) {
		super(name, node);
	}
	
	@Override
	public Object getValue(ExecutionContext context) {
		TreeNode node = getNode();
		TreeNode parent = node.getParent();
		
		node.setParent(context.getCurrentNode());
		Object returnValue = context.execute(node);
		node.setParent(parent);
		
		return returnValue;
	}
}