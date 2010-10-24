package richTea.core.execution;

import java.util.Stack;

import richTea.core.node.TreeNode;

public class ExecutionContext {
	
	private Stack<Scope> stack;
	
	public Scope currentScope;
	
	private boolean runChildren;
	
	public ExecutionContext() {
		stack = new Stack<Scope>();
	}
	
	public Scope execute(TreeNode node) {
		currentScope = new Scope(node.getAttributes(), currentScope);
		
		stack.push(currentScope);
		
		setRunChildren(true);
		
		node.execute(this);
		
		if(getRunChildren()) executeChildren(node);
		
		return stack.pop();
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
	
	public void doReturn() {
		doReturn(null);
	}
	
	public void doReturn(Object returnValue) {
		currentScope.setReturnValue(returnValue);
	}
}