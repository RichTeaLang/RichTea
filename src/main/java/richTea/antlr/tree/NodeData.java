package richTea.antlr.tree;

import java.util.List;

import org.antlr.runtime.Token;

public class NodeData extends RichTeaTree {
	
	protected static final int ATTRIBUTES_CHILD_INDEX = 1;
	protected static final int BRANCHES_CHILD_INDEX = 2;
	
	public NodeData(Token token) {
		super(token);
	}
	
	public List<AttributeData> getAttributes() {
		return getChildrenOfChild(ATTRIBUTES_CHILD_INDEX);
	}
	
	public List<BranchData> getBranches() {
		return getChildrenOfChild(BRANCHES_CHILD_INDEX);
	}
}