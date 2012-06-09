package richTea.core.execution;

import java.util.ArrayDeque;
import java.util.Deque;

import richTea.core.attribute.PrimativeAttribute;
import richTea.core.node.Branch;
import richTea.core.node.TreeNode;
import richTea.core.resolver.AbstractResolver;
import richTea.core.resolver.BasicNodeResolver;

public class ExecutionContext extends AbstractResolver {
	
	private Deque<TreeNode> executionStack;
	
	private BasicNodeResolver<TreeNode> resolver;
	
	private Object returnValue;
	
	public ExecutionContext() {
		executionStack = new ArrayDeque<TreeNode>();
		resolver = new BasicNodeResolver<TreeNode>();
	}
	
	public Deque<TreeNode> getExecutionStack() {
		return executionStack;
	}
	
	public TreeNode getCurrentNode() {
		return executionStack.peek();
	}
	
	public Object execute(TreeNode node) {
		try {
			executeFunction(node);
		} catch(ReturnException e) {
			/* If this node contains a Return function we will have to catch the return exception
			 * ourselves.  Usually a "Scope" function would deal with a return exception */
		}
		
		return getLastReturnValue();
	}
	
	public boolean executeBranch(String branchName) {
		boolean branchExecuted = false;
		
		TreeNode node = getCurrentNode();
		Branch branch = node.getBranch(branchName);
		
		if(branch != null) {	
			for(TreeNode child : branch.getChildren()) {
				executeFunction(child);
			}
			
			branchExecuted = true;
			
			resolver.setContext(node);
		}

		return branchExecuted;
	}
	
	protected void executeFunction(TreeNode node) {		
		getExecutionStack().push(node);
		
		resolver.setContext(node);
		
		node.getFunction().execute(this);
		
		getExecutionStack().pop();
		
		resolver.setContext(null);
	}
	
	public Object getLastReturnValue() {
		return returnValue;
	}
	
	public void setLastReturnValue(Object returnValue) {
		this.returnValue = returnValue;
	}
	
	public void doReturn(Object returnValue) {
		setLastReturnValue(returnValue);
		
		throw new ReturnException(getExecutionStack());
	}

	@Override
	public Object getValue(String key) {
		return resolver.getValue(key);
	}
	
	public void setValue(String key, Object value) {
		getCurrentNode().setAttribute(new PrimativeAttribute(key, value));
	}
}