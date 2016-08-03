package richTea.compiler.antlr.tree;

import java.util.List;

import org.antlr.runtime.Token;
import org.antlr.runtime.tree.Tree;

public class BranchData extends RichTeaTree {

	protected static final int GUARD_CHILD_INDEX = 1;
	protected static final int ATTRIBUTES_CHILD_INDEX = 2;
	protected static final int CHILDREN_CHILD_INDEX = 3;
	
	public BranchData(Token token) {
		super(token);
	}
	
	public Tree getGuard() {
		return getChild(GUARD_CHILD_INDEX).getChild(0);
	}
	
	public List<AttributeData> getAttributes() {
		return getChildrenOfChild(ATTRIBUTES_CHILD_INDEX);
	}
	
	public List<NodeData> getChildren() {
		return getChildrenOfChild(CHILDREN_CHILD_INDEX);
	}
}