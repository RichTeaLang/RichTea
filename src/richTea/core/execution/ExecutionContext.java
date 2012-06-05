package richTea.core.execution;

import java.util.Stack;

import richTea.core.attribute.PrimativeAttribute;
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
		
		TreeNode node = getCurrentNode();
		Branch branch = node.getBranch(branchName);
		
		if(branch != null) {			
			for(TreeNode child : branch.getChildren()) {
				execute(child);
			}
			
			branchExecuted = true;
			
			resolver.setContext(node);
		}

		return branchExecuted;
	}
	
	public Object getReturnValue() {
		return returnValue;
	}
	
	public void returnValue(Object returnValue) {
		this.returnValue = returnValue;
	}

	@Override
	public Object getValue(String key) {
		return resolver.getValue(key);
	}
	
	public void setValue(String key, Object value) {
		getCurrentNode().setAttribute(new PrimativeAttribute(key, value));
	}
}