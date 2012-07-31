package richTea.core.attribute.function;

import richTea.core.attribute.AbstractAttribute;
import richTea.core.execution.ExecutionContext;
import richTea.core.node.TreeNode;

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