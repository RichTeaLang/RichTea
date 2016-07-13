package richTea.runtime.attribute.function;

import richTea.runtime.attribute.AbstractAttribute;
import richTea.runtime.execution.ExecutionContext;
import richTea.runtime.node.TreeNode;

public class NodeReferenceAttribute extends AbstractAttribute {
	private TreeNode node;
	
	public NodeReferenceAttribute(String name, TreeNode node) {
		super(name);
		
		this.node = node;
	}
	
	public TreeNode getNode() {
		return node;
	}
		
	@Override
	public Object getValue(ExecutionContext context) {
		return getNode();
	}
}