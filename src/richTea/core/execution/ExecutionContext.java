package richTea.core.execution;

import java.util.Stack;

import richTea.core.attribute.Attribute;
import richTea.core.node.Branch;
import richTea.core.node.TreeNode;
import richTea.core.resolver.Resolver;

public class ExecutionContext implements Resolver {
	
	private Stack<TreeNode> executionStack;
	
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
		getExecutionStack().push(node);;
		
		node.getFunction().execute(this);
		
		getExecutionStack().pop();
		
		return getReturnValue();
	}
	
	public boolean executeBranch(String branchName) {
		Branch branch = getCurrentNode().getBranchByName(branchName);
		
		if(branch != null) {
			for(TreeNode node : branch.getChildren()) {
				execute(node);
			}
		}
		
		return branch != null;
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