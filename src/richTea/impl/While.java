package richTea.impl;

import richTea.core.execution.ExecutionContext;
import richTea.core.node.TreeNode;

public class While extends TreeNode {
	
	@Override 
	public void execute(ExecutionContext executionContext) {
		while(getWhileCondition()) {
			executionContext.executeChildren(this);
		}
		
		executionContext.setRunChildren(false);
	}
	
	protected Boolean getWhileCondition() {
		return getBoolean("condition");
	}
}
