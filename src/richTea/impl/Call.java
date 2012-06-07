package richTea.impl;

import richTea.core.attribute.Attribute;
import richTea.core.execution.AbstractFunction;
import richTea.core.execution.ExecutionContext;
import richTea.core.node.TreeNode;

public class Call extends AbstractFunction {

	@Override
	protected void run() throws Exception {
		Object functionValue = context.getValue("function");
		
		if(functionValue instanceof TreeNode)
		{
			TreeNode functionNode = (TreeNode) functionValue;
			TreeNode currentNode = context.getCurrentNode();
			
			Attribute[] originalAttributes = functionNode.getAttributes();
			
			for(Attribute contextAttribute : currentNode.getAttributes()) {
				if(contextAttribute.getName().equals("function")) continue;
				
				functionNode.setAttribute(contextAttribute);
			}
			
			context.returnValue(new ExecutionContext().execute(functionNode));
			
			for(Attribute attribute : originalAttributes) {				
				functionNode.setAttribute(attribute);
			}
		}
	}
}