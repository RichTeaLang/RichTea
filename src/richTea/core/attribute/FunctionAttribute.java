package richTea.core.attribute;

import richTea.core.execution.ExecutionContext;
import richTea.core.node.TreeNode;
import richTea.core.resolver.Resolver;

public class FunctionAttribute extends PrimativeAttribute {

	public FunctionAttribute(String name, TreeNode function) {
		super(name, function);
	}
	
	@Override
	public TreeNode getInitialValue() {
		return (TreeNode) super.getInitialValue();
	}
	
	@Override
	public void setContext(Resolver context) {
		super.setContext(context);
		
		if(context instanceof TreeNode) {
			getInitialValue().setParent((TreeNode) context);
		}
	}
	
	@Override
	public Object getValue() {
		return new ExecutionContext().execute(getInitialValue());
	}
}