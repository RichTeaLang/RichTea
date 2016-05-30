package richTea.compiler.antlr.tree;

import org.antlr.runtime.Token;
import org.antlr.runtime.tree.Tree;

public class AttributeData extends RichTeaTree {
	
	protected static final int VALUE_CHILD_INDEX = 1;
	
	public AttributeData(Token token) {
		super(token);
	}
	
	public AttributeData(Tree data) {
		super(null);
		
		addChild(data.getChild(0));
		addChild(data.getChild(1));
	}
	
	public Tree getValue() {
		return getChild(VALUE_CHILD_INDEX).getChild(0);
	}
}