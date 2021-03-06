package richTea.compiler.antlr.tree;

import java.util.Collections;
import java.util.List;

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
	
	@SuppressWarnings("unchecked")
	protected <T> List<T> getChildrenOfChild(int index) {
		CommonTree child = (CommonTree) getChild(index);
		
		return child != null && child.getChildCount() > 0 ? (List<T>) child.getChildren() : Collections.EMPTY_LIST;
	}
}
