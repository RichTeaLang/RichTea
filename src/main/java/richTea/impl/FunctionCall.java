package richTea.impl;

import richTea.core.attribute.VariableAttribute;
import richTea.core.node.TreeNode;

public class FunctionCall extends Call {

	@Override 
	protected TreeNode getFunctionNode() {
		String functionName = context.getCurrentNode().getBinding().getName();

		Object functionNode = new VariableAttribute(functionName).getValue(context);
		
		return functionNode instanceof TreeNode ? (TreeNode) functionNode : null;
	}
}