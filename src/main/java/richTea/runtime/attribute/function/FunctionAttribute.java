package richTea.runtime.attribute.function;

import richTea.runtime.attribute.AbstractAttribute;
import richTea.runtime.execution.ExecutionContext;
import richTea.runtime.node.TreeNode;

public class FunctionAttribute extends AbstractAttribute {

	private TreeNode functionNode;
	
	public FunctionAttribute(String name, TreeNode functionNode) {
		super(name);
		
		this.functionNode = functionNode;
	}
	
	public TreeNode getFunctionNode() {
		return functionNode;
	}
		
	@Override
	public Object getValue(ExecutionContext context) {		
		return getFunctionNode();
	}
}