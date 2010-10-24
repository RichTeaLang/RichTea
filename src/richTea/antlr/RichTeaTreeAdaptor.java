package richTea.antlr;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

import org.antlr.runtime.Token;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeAdaptor;
import org.antlr.runtime.tree.Tree;
import org.apache.log4j.Logger;

import richTea.antlr.tree.AttributeData;
import richTea.antlr.tree.NodeData;

public class RichTeaTreeAdaptor extends CommonTreeAdaptor {
	
	protected Logger log;
	
	private Map<Integer, Class<? extends Tree>> treeTypes;
	
	public RichTeaTreeAdaptor() {
		log = Logger.getLogger(getClass());
		
		treeTypes = new HashMap<Integer, Class<? extends Tree>>();
		treeTypes.put(RichTeaParser.FUNCTION, NodeData.class);
		treeTypes.put(RichTeaParser.ATTRIBUTE, AttributeData.class);
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
					
				}catch(NoSuchMethodException exception) {
					log.error("Unable to find constructor for given class type" , exception);
				}catch(SecurityException exception) {
					log.error("Security exception invoking constructor for tree class" , exception);
				}catch(InvocationTargetException exception) {
					log.error("Unable to invoke constructor for tree class" , exception);
				}catch(IllegalAccessException exception) {
					log.error("Unable to access constructor for tree class" , exception);
				}catch(InstantiationException exception) {
					log.error("Error instantiating tree class", exception);
				}
			}
		}
		
		// Return CommonTree as fail-safe
		return new CommonTree(token);
	}
}