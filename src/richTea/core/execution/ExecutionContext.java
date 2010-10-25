package richTea.core.execution;

import java.util.Stack;

import richTea.core.node.TreeNode;

public class ExecutionContext {
	
	private Stack<TreeNode> executionTrace;
			
	private boolean runChildren;
	
	private Object returnValue;
	
	public ExecutionContext() {
		executionTrace = new Stack<TreeNode>();
	}
	
	public Stack<TreeNode> getExecutionTrace() {
		return executionTrace;
	}
	
	public Object execute(TreeNode node) {		
		getExecutionTrace().push(node);
		
		setRunChildren(true);
		
		node.execute(this);
		
		if(getRunChildren()) executeChildren(node);
		
		getExecutionTrace().pop();
		
		return getReturnValue();
	}
	
	public void executeChildren(TreeNode node) {
		for(TreeNode child : node.getChildren()) {
			execute(child);
		}
	}
	
	public void setRunChildren(boolean runChildren) {
		this.runChildren = runChildren;
	}
	
	public boolean getRunChildren() {
		return runChildren;
	}
	
	public Object getReturnValue() {
		return returnValue;
	}
	
	public void setReturnValue(Object returnValue) {
		this.returnValue = returnValue;
	}
}