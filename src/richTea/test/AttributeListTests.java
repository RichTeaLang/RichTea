package richTea.test;

import static org.junit.Assert.*;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.apache.log4j.BasicConfigurator;
import org.junit.Test;

import richTea.antlr.RichTeaLexer;
import richTea.antlr.RichTeaParser;
import richTea.antlr.RichTeaTreeAdaptor;
import richTea.antlr.tree.NodeData;
import richTea.core.factory.RichTeaNodeFactory;
import richTea.core.factory.bindings.BootstrapBindingSet;
import richTea.core.node.TreeNode;

public class AttributeListTests {
	
	private RichTeaNodeFactory nodeFactory;
	
	public AttributeListTests() {
		BasicConfigurator.configure();
		nodeFactory = new RichTeaNodeFactory(new BootstrapBindingSet());
	}
	
	@Test
	public void testAttributeList() throws RecognitionException {
		TreeNode node = buildNode("(x:1 y:2 z:3){}");
		
		assertTrue(node.getAttributes().length == 3);
		
	}
	
	protected TreeNode buildNode(String input) throws RecognitionException {
	   	ANTLRStringStream source = new ANTLRStringStream(input);
		
		RichTeaLexer lexer = new RichTeaLexer(source);
		RichTeaParser parser = new RichTeaParser(new CommonTokenStream(lexer));
		parser.setTreeAdaptor(new RichTeaTreeAdaptor());
		
		NodeData nodeData = (NodeData) parser.program().getTree();
		
		return nodeFactory.create(nodeData);
	}
}
