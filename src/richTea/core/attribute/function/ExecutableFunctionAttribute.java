package richTea.core.attribute.function;

import richTea.core.attribute.AbstractAttribute;
import richTea.core.execution.ExecutionContext;
import richTea.core.node.TreeNode;

public class ExecutableFunctionAttribute extends AbstractAttribute {

	private FunctionAttribute functionAttribute;
	
	public ExecutableFunctionAttribute(String name, FunctionAttribute functionAttribute) {
		super(name);
		
		this.functionAttribute = functionAttribute;
	}
	
	public FunctionAttribute getFunctionAttribute() {
		return functionAttribute;
	}
	
	@Override
	public void setOwner(TreeNode owner) {
		super.setOwner(owner);
		
		getFunctionAttribute().setOwner(owner);
	}
	
	@Override
	public Object getValue() {		
		return new ExecutionContext().execute(getFunctionAttribute().getFunctionNode());
	}
}