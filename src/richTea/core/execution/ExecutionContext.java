package richTea.core.execution;

import java.util.ArrayDeque;
import java.util.Deque;

import richTea.core.attribute.Attribute;
import richTea.core.attribute.PrimativeAttribute;
import richTea.core.node.Branch;
import richTea.core.node.TreeNode;
import richTea.core.resolver.AbstractResolver;

public class ExecutionContext extends AbstractResolver {
	
	private Deque<Scope> scopes;
	
	private Object returnValue;
	
	public ExecutionContext() {
		scopes = new ArrayDeque<Scope>();
	}
	
	public Deque<Scope> getScopes() {
		return scopes;
	}
	
	public Scope getCurrentScope() {
		return getScopes().peek();
	}
	
	public TreeNode getCurrentNode() {
		return getCurrentScope().getOwner();
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
		}

		return branchExecuted;
	}
	
	protected void executeFunction(TreeNode node) {		
		scopes.push(new Scope(node, scopes.peek()));
		
		node.getFunction().execute(this);

		scopes.pop();
	}

	public Object getLastReturnValue() {
		return returnValue;
	}
	
	public void setLastReturnValue(Object returnValue) {
		this.returnValue = returnValue;
	}

	@Override
	public Object getValue(String attributeName) {	
		Attribute attribute = scopes.peek().getAttribute(attributeName);
		
		return attribute != null ? attribute.getValue(this) : null;
	}

	public void setValue(String attributeName, Object value) {
		scopes.peek().setAttribute(new PrimativeAttribute(attributeName, value));
	}
}