package richTea.core.attribute;

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
	public void setOwner(TreeNode owner) {
		super.setOwner(owner);
		
		getFunctionNode().setParent(owner);
	}
	
	@Override
	public Object getValue() {		
		return getFunctionNode();
	}
}