package richTea.impl;

import richTea.core.execution.ExecutionContext;
import richTea.core.node.TreeNode;

public class Set extends TreeNode {
	
	@Override
	public void execute(ExecutionContext executionContext) {
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