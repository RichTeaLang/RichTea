package richTea.core.attribute;

import richTea.core.execution.ExecutionContext;
import richTea.core.node.TreeNode;
import richTea.core.resolver.Resolver;

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
	public void setContext(Resolver context) {
		super.setContext(context);
		
		if(context instanceof TreeNode) {
			getFunction().setParent((TreeNode) context);
		}
	}
	
	@Override
	public Object getValue() {		
		return new ExecutionContext().execute(getFunction());
	}
}