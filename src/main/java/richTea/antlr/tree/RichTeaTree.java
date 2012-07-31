package richTea.antlr.tree;

import org.antlr.runtime.Token;
import org.antlr.runtime.tree.CommonTree;

public class RichTeaTree extends CommonTree {
	
	protected static final int NAME_CHILD_INDEX = 0;

	public RichTeaTree(Token token) {
		super(token);
	}
	
	public String getName() {
		return getChild(NAME_CHILD_INDEX).getChild(0).getText();
	}
}
