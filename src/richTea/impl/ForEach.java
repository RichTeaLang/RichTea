package richTea.impl;

import richTea.core.execution.ExecutionContext;
import richTea.core.node.TreeNode;

public class ForEach extends TreeNode {
	
	@Override
	public void execute(ExecutionContext executionContext) {
		Iterable<Object> inList = inList();
		String as = as();
		
		for(Object element : inList) {
			setValue(as, element);
			
			for(TreeNode child : getChildren()) {
				executionContext.execute(child);
			}
		}
		
		executionContext.setRunChildren(false);
	}
	
	@SuppressWarnings("unchecked")
	protected Iterable<Object> inList() {
		return (Iterable<Object>) getValue("in");
	}
	
	protected String as() {
		return getString("as");
	}
}