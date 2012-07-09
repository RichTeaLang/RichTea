package richTea.impl.functional;

import java.util.Arrays;

import richTea.core.attribute.VariableAttribute;
import richTea.core.node.TreeNode;

public class FunctionCall extends Call {

	@Override 
	protected TreeNode getFunctionNode() {
		String functionName = context.getCurrentNode().getBinding().getName();
		
		VariableAttribute functionLookup = new VariableAttribute("functionLookup", Arrays.asList(new String[] { functionName }));
		
		Object functionNode = functionLookup.getValue(context);
		
		return functionNode instanceof TreeNode ? (TreeNode) functionNode : null;
	}
}