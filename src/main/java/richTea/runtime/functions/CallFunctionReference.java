package richTea.runtime.functions;

import richTea.runtime.attribute.Attribute;
import richTea.runtime.attribute.PrimativeAttribute;
import richTea.runtime.attribute.variable.LookupChainRoot;
import richTea.runtime.attribute.variable.PropertyLookup;
import richTea.runtime.execution.AbstractFunction;
import richTea.runtime.node.TreeNode;

public class CallFunctionReference extends AbstractFunction {

	@Override
	protected void run() {
		TreeNode functionNode = getFunctionNode();
		
		if(functionNode != null) {
			Attribute[] newAttributes = context.getCurrentNode().getAttributes();
			Attribute[] oldAttributes = functionNode.getAttributes();
			
			for(Attribute attribute : newAttributes){
				functionNode.setAttribute(new PrimativeAttribute(attribute.getName(), attribute.getValue(context)));
			}
			
			context.execute(functionNode);
			
			for(Attribute attribute : newAttributes) {
				functionNode.removeAttribute(attribute.getName());
			}
			
			for(Attribute attribute : oldAttributes) {
				functionNode.setAttribute(attribute);
			}
		} else {
			throw new IllegalArgumentException("Invalid function specified");
		}
	}
	
	protected TreeNode getFunctionNode() {
		String functionName = context.getCurrentNode().getBinding().getName();
		Attribute functionVariable = new PropertyLookup(new PrimativeAttribute("", functionName), new LookupChainRoot("", false));
		
		Object functionNode = functionVariable.getValue(context);
		
		return functionNode instanceof TreeNode ? (TreeNode) functionNode : null;
	}
}