package richTea.impl.functional;

import richTea.core.attribute.Attribute;
import richTea.core.attribute.PrimativeAttribute;
import richTea.core.execution.AbstractFunction;
import richTea.core.node.TreeNode;

public class Call extends AbstractFunction {

	@Override
	protected void run() {
		Object functionValue = context.getValue("function");
		
		if(functionValue instanceof TreeNode)
		{			
			Attribute[] callAttributes = context.getCurrentNode().getAttributes();
			Attribute[] callAttributeValues = new Attribute[callAttributes.length];
			
			for(int i = 0; i < callAttributes.length; i++) {
				Attribute attribute = callAttributes[i];
				
				callAttributeValues[i] = new PrimativeAttribute(attribute.getName(), attribute.getValue(context));
			}
			                                                              
			context.pushScope(context.createScope(callAttributeValues));			
			context.execute((TreeNode) functionValue);
			context.popScope();
		} else {
			throw new IllegalArgumentException("Invalid function specified");
		}
	}
}