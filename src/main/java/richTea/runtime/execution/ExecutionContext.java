package richTea.runtime.execution;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

import richTea.runtime.attribute.Attribute;
import richTea.runtime.attribute.PrimativeAttribute;
import richTea.runtime.node.Branch;
import richTea.runtime.node.TreeNode;
import richTea.runtime.resolver.AbstractResolver;

public class ExecutionContext extends AbstractResolver {
	private Deque<VariableScope> scopes;
	private Object returnValue;
	private boolean isGeneratingStackTrace;
	
	public ExecutionContext() {
		scopes = new ArrayDeque<VariableScope>();
		isGeneratingStackTrace = false;
	}
	
	public ExecutionContext(VariableScope initialScope) {
		this();
		
		pushScope(initialScope);
	}
		
	public Object execute(TreeNode node) {
		try {
			executeFunction(node);
		} catch (ReturnException e) {
			// If this node contains a Return function we will have to catch the return exception
			// ourselves.  Usually a "Scope" function would deal with a return exception
		} catch (ExecutionException e) {
			// Re-throw ExecutionException - There is no need to create a new one (it is possible that an infinite loop
			// of ExecutionException creation could occur.
			throw e;
		} catch (Exception e) {
			// Wrap the exception within an ExecutionException - This will generate a RichTea specific stack trace.
			// Instantiation of the ExecutionException could result in generating further exceptions within this context
			// (For example, getting the value of an ExecutableFunctionAttribute may result in an exception).
			// In such a case, the original exception is thrown to be handled within the ExecutionExceptio
			if (!isGeneratingStackTrace) {
				isGeneratingStackTrace = true;
				throw new ExecutionException(this, e); // Generate useful stack trace
			} else {
				throw e; // Exception thrown when generating stack trace
			}
		} finally {
			isGeneratingStackTrace = false;
		}
		
		return getLastReturnValue();
	}
	
	public boolean executeBranch(String branchName, Attribute... attributes) {
		return executeBranch(branchName, createScope(attributes));
	}
	
	public boolean executeBranch(String branchName, VariableScope scope) {
		pushScope(scope);
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
	
	public VariableScope getParentScope() {
		return getParentScope(null);
	}
	
	public VariableScope getParentScope(Class<? extends RichTeaFunction> ownedBy) {
		Iterator<VariableScope> iterator = scopes.iterator();
		
		while(iterator.hasNext()) {
			VariableScope scope = iterator.next();
			
			if (scope.getOwner().getFunction().getClass().equals(ownedBy)) {
				return scope;
			}
		}
		
		return null;
	}
	
	public TreeNode getCurrentNode() {
		VariableScope scope = getCurrentScope();
		
		return scope != null ? scope.getOwner() : null;
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