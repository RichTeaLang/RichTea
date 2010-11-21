package richTea.core.attribute;

import richTea.core.execution.ExecutionContext;
import richTea.core.node.TreeNode;

public class FunctionAttribute extends AbstractAttribute {

	private TreeNode function;
	
	public FunctionAttribute(String name, TreeNode function) {
		super(name);
		
		this.function = function;
	}
	
	protected TreeNode getFunction() {
		return function;
	}
	
	@Override
	public void setOwner(TreeNode owner) {
		super.setOwner(owner);
		
		getFunction().setParent(owner);
	}
	
	@Override
	public Object getValue() {		
		return new ExecutionContext().execute(getFunction());
	}
}