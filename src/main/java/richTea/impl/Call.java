package richTea.impl;

import richTea.core.attribute.Attribute;
import richTea.core.attribute.PrimativeAttribute;
import richTea.core.execution.AbstractFunction;
import richTea.core.node.TreeNode;

public class Call extends AbstractFunction {

	@Override
	protected void run() {
		TreeNode functionNode = getFunctionNode();
		
		if(functionNode != null) {			
			Attribute[] callAttributes = context.getCurrentNode().getAttributes();
			Attribute[] callAttributeValues = new Attribute[callAttributes.length];
			
			for(int i = 0; i < callAttributes.length; i++) {
				Attribute attribute = callAttributes[i];
				
				callAttributeValues[i] = new PrimativeAttribute(attribute.getName(), attribute.getValue(context));
			}
			                                                              
			context.pushScope(context.createScope(callAttributeValues));			
			context.execute(functionNode);
			context.popScope();
		} else {
			throw new IllegalArgumentException("Invalid function specified");
		}
	}
	
	protected TreeNode getFunctionNode() {
		Object functionNode = context.getValue("function");
		
		return functionNode instanceof TreeNode ? (TreeNode) functionNode : null;
	}
}