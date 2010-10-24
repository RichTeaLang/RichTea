package richTea.antlr.tree;

import java.util.List;

import org.antlr.runtime.Token;
import org.antlr.runtime.tree.CommonTree;

public class NodeData extends RichTeaTree {
	
	protected static final int ATTRIBUTES_CHILD_INDEX = 1;
	protected static final int CHILDREN_CHILD_INDEX = 2;
	
	public NodeData(Token token) {
		super(token);
	}
	
	public List<AttributeData> getAttributes() {
		@SuppressWarnings("unchecked")
		List<AttributeData> attributes = ((CommonTree) getChild(ATTRIBUTES_CHILD_INDEX)).getChildren();
		
		return attributes;
	}
	
	public List<NodeData> getChildNodes() {	
		@SuppressWarnings("unchecked")
		List<NodeData> childFunctions = ((CommonTree) getChild(CHILDREN_CHILD_INDEX)).getChildren();
						
		return childFunctions;
	}
}