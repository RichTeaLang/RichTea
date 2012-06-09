package richTea.core.execution;

import java.util.Deque;

import richTea.core.node.TreeNode;

public class ReturnException extends RuntimeException {

	private static final long serialVersionUID = 8628072971422883351L;
	
	private Deque<TreeNode> executionStack;
	
	public ReturnException(Deque<TreeNode> executionStack) {
		this.executionStack = executionStack;
	}
	
	public Deque<TreeNode> getExecutionStack() {
		return executionStack;
	}
}