package richTea.attribute.function;

import richTea.attribute.AbstractAttribute;
import richTea.execution.ExecutionContext;
import richTea.node.TreeNode;

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