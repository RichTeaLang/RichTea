package richTea.core.execution;

import java.util.Stack;

import richTea.core.attribute.Attribute;
import richTea.core.node.TreeNode;
import richTea.core.resolver.Resolver;

public class ExecutionContext implements Resolver {
	
	private Stack<TreeNode> executionStack;
			
	private boolean runChildren;
	
	private Object returnValue;
	
	public ExecutionContext() {
		executionStack = new Stack<TreeNode>();
	}
	
	public Stack<TreeNode> getExecutionStack() {
		return executionStack;
	}
	
	public TreeNode getCurrentNode() {
		return executionStack.peek();
	}
	
	public Object execute(TreeNode node) {		
		getExecutionStack().push(node);
		
		setRunChildren(true);
		
		node.getFunction().execute(this);
		
		if(getRunChildren()) executeChildren(node);
		
		getExecutionStack().pop();
		
		return getReturnValue();
	}
	
	public void executeChildren() {
		executeChildren(getCurrentNode());
	}
	
	protected void executeChildren(TreeNode node) {
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
	
	public void doReturn() {
		doReturn(null);
	}
	
	public void doReturn(Object returnValue) {
		this.returnValue = returnValue;
	}

	@Override
	public Object getValue(String key) {
		return getCurrentNode().getValue(key);
	}
	
	public Attribute getAttribute(String key) {
		return getCurrentNode().getAttributes().getAttribute(key);
	}
	
	public void setValue(String key, Object value) {
		getCurrentNode().setValue(key, value);
	}
}