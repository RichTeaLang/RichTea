package richTea.execution;

import java.util.ArrayDeque;
import java.util.Deque;

import richTea.attribute.Attribute;
import richTea.attribute.PrimativeAttribute;
import richTea.node.Branch;
import richTea.node.TreeNode;
import richTea.resolver.AbstractResolver;

public class ExecutionContext extends AbstractResolver {
	
	private Deque<VariableScope> scopes;
	
	private Object returnValue;
	
	public ExecutionContext() {
		scopes = new ArrayDeque<VariableScope>();
	}
	
	public ExecutionContext(VariableScope initialScope) {
		this();
		
		pushScope(initialScope);
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
	
	public boolean executeBranch(String branchName, Attribute... attributes) {
		pushScope(createScope(attributes));
		
		boolean executed = executeBranch(branchName);
		
		popScope();
		
		return executed;
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
		pushScope(new VariableScope(node, getCurrentScope()));
		
		node.getFunction().execute(this);

		popScope();
	}
	
	public VariableScope createScope(Attribute... attributes) {
		VariableScope scope = new VariableScope(getCurrentNode(), getCurrentScope());
		
		for(Attribute attribute : attributes) {
			scope.setAttribute(attribute);
		}
		
		return scope;
	}

	public void pushScope(VariableScope scope) {		
		scopes.push(scope);
	}
	
	public VariableScope popScope() {
		return scopes.pop();
	}
	
	public void unRollScopeTo(RichTeaFunction function) {
		while(getCurrentNode().getFunction() != function) {
			popScope();
		}
	}
	
	public VariableScope getCurrentScope() {
		return scopes.peek();
	}
	
	public TreeNode getCurrentNode() {
		return getCurrentScope().getOwner();
	}

	public Object getLastReturnValue() {
		return returnValue;
	}
	
	public void setLastReturnValue(Object returnValue) {
		this.returnValue = returnValue;
	}

	@Override
	public Object getValue(String attributeName) {	
		Attribute attribute = getCurrentScope().getAttribute(attributeName);
		
		return attribute != null ? attribute.getValue(this) : null;
	}

	public void setValue(String attributeName, Object value) {
		getCurrentScope().setAttribute(new PrimativeAttribute(attributeName, value));
	}
}