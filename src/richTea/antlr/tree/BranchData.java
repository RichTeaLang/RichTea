package richTea.antlr.tree;

import java.util.List;

import org.antlr.runtime.Token;
import org.antlr.runtime.tree.CommonTree;

public class BranchData extends RichTeaTree {

	protected static final int CHILDREN_CHILD_INDEX = 1;
	
	public BranchData(Token token) {
		super(token);
	}
	
	public List<NodeData> getChildren() {	
		@SuppressWarnings("unchecked")
		List<NodeData> children = ((CommonTree) getChild(CHILDREN_CHILD_INDEX)).getChildren();
						
		return children;
	}
}