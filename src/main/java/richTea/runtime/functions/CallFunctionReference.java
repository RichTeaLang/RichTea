package richTea.runtime.functions;

import richTea.runtime.attribute.Attribute;
import richTea.runtime.attribute.PrimativeAttribute;
import richTea.runtime.attribute.VariableAttribute;
import richTea.runtime.execution.AbstractFunction;
import richTea.runtime.node.TreeNode;

public class CallFunctionReference extends AbstractFunction {

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
		String functionName = context.getCurrentNode().getBinding().getName();
		Object functionNode = new VariableAttribute(functionName).getValue(context);
		
		return functionNode instanceof TreeNode ? (TreeNode) functionNode : null;
	}
}