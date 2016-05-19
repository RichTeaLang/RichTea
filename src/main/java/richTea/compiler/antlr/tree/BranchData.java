package richTea.compiler.antlr.tree;

import java.util.List;

import org.antlr.runtime.Token;

public class BranchData extends RichTeaTree {

	protected static final int CHILDREN_CHILD_INDEX = 1;
	
	public BranchData(Token token) {
		super(token);
	}
	
	public List<NodeData> getChildren() {
		return getChildrenOfChild(CHILDREN_CHILD_INDEX);
	}
}