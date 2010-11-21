package richTea.core.execution;

import java.util.Stack;

import richTea.core.node.Branch;
import richTea.core.node.TreeNode;
import richTea.core.resolver.AbstractResolver;
import richTea.core.resolver.BasicNodeResolver;

public class ExecutionContext extends AbstractResolver {
	
	private Stack<TreeNode> executionStack;
	
	private BasicNodeResolver<TreeNode> resolver;
	
	private Object returnValue;
	
	public ExecutionContext() {
		executionStack = new Stack<TreeNode>();
		resolver = new BasicNodeResolver<TreeNode>();
	}
	
	public Stack<TreeNode> getExecutionStack() {
		return executionStack;
	}
	
	public TreeNode getCurrentNode() {
		return executionStack.peek();
	}
	
	public Object execute(TreeNode node) {		
		getExecutionStack().push(node);
		
		resolver.setContext(node);
		
		node.getFunction().execute(this);
		
		getExecutionStack().pop();
		
		resolver.setContext(null);
		
		return getReturnValue();
	}
	
	public boolean executeBranch(String branchName) {
		boolean branchExecuted = false;
		
		TreeNode previousContext = getCurrentNode();
		
		Branch branch = getCurrentNode().getBranchByName(branchName);
		
		if(branch != null) {
			for(TreeNode node : branch.getChildren()) {
				execute(node);
			}
			
			branchExecuted = true;
		}
		
		resolver.setContext(previousContext);
		
		return branchExecuted;
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
		return resolver.getValue(key);
	}
}