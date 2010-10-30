package richTea.impl;

import richTea.core.execution.AbstractFunction;
import richTea.core.node.TreeNode;

public class Set extends AbstractFunction {
	
	@Override
	protected void run() {
		TreeNode target = getTarget();
		
		if(target != null) {
			String attributeName = getAttributeName();
			Object attributeValue = getAttributeValue();
			
			target.setValue(attributeName, attributeValue);
		}
	}
	
	protected TreeNode getTarget() {
		return (TreeNode) getValue("target");
	}
	
	protected String getAttributeName() {
		return getString("name");
	}

	protected Object getAttributeValue() {
		return getValue("value");
	}
}