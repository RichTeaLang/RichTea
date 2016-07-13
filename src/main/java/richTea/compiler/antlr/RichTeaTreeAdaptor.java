package richTea.compiler.antlr;

import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;

import org.antlr.runtime.Token;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeAdaptor;
import org.antlr.runtime.tree.Tree;
import org.apache.log4j.Logger;

import richTea.compiler.RichTeaParser;
import richTea.compiler.antlr.tree.AttributeData;
import richTea.compiler.antlr.tree.BranchData;
import richTea.compiler.antlr.tree.NodeData;

public class RichTeaTreeAdaptor extends CommonTreeAdaptor {
	
	protected Logger log;
	
	private Map<Integer, Class<? extends Tree>> treeTypes;
	
	public RichTeaTreeAdaptor() {
		log = Logger.getLogger(getClass());
		
		treeTypes = new HashMap<Integer, Class<? extends Tree>>();
		treeTypes.put(RichTeaParser.FUNCTION, NodeData.class);
		treeTypes.put(RichTeaParser.ATTRIBUTE, AttributeData.class);
		treeTypes.put(RichTeaParser.BRANCH, BranchData.class);
	}
	
	@Override 
	public Tree create(Token token) {
		if(token != null) {
			Class<? extends Tree> treeClass = treeTypes.get(token.getType());
			
			if(treeClass != null) {	
				try {
					Constructor<? extends Tree> constructor = treeClass.getConstructor(Token.class);
					
					Tree tree = constructor.newInstance(token);
					
					return tree;
					
				} catch (Exception exception) {
					throw new RuntimeException("Unable to create node: " + token.toString(), exception);
				}
			}
		}
		
		// Return CommonTree as fail-safe
		return new CommonTree(token);
	}
}