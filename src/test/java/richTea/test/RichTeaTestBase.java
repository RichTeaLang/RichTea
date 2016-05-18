package richTea.test;

import static org.junit.Assert.assertTrue;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTree;
import org.apache.log4j.BasicConfigurator;

import richTea.antlr.RichTeaLexer;
import richTea.antlr.RichTeaParser;
import richTea.antlr.RichTeaTreeAdaptor;
import richTea.antlr.tree.AttributeData;
import richTea.antlr.tree.NodeData;
import richTea.attribute.Attribute;
import richTea.factory.RichTeaAttributeFactory;
import richTea.factory.RichTeaNodeFactory;
import richTea.impl.BindingSet;
import richTea.impl.BootstrapBindingSet;
import richTea.node.TreeNode;

public class RichTeaTestBase {
	
	private RichTeaNodeFactory nodeFactory;
	private RichTeaAttributeFactory attributeFactory;

	public RichTeaTestBase() {
		BasicConfigurator.configure();
		
		nodeFactory = new RichTeaNodeFactory(new BindingSet[] { new BootstrapBindingSet() });
		attributeFactory = new RichTeaAttributeFactory(nodeFactory);
	}
	
	protected Attribute buildAttribute(String input) throws RecognitionException {
		CommonTree parseTree = (CommonTree) configureParser(input).attribute_list().getTree();
		AttributeData attributeData = (AttributeData) parseTree.getChild(0);
		
		return attributeFactory.create(attributeData);
	}
	
	protected void testAttributeValue(String input, Object requiredValue) throws RecognitionException {
		assertTrue(buildAttribute(input).getValue(null).equals(requiredValue));
	}
	
	protected TreeNode buildNode(String input) throws RecognitionException {		
		NodeData nodeData = (NodeData) configureParser(input).program().getTree();
		
		return nodeFactory.create(nodeData);
	}
	
	private RichTeaParser configureParser(String input) throws RecognitionException {
	   	ANTLRStringStream source = new ANTLRStringStream(input);
		
		RichTeaLexer lexer = new RichTeaLexer(source);
		RichTeaParser parser = new RichTeaParser(new CommonTokenStream(lexer));
		parser.setTreeAdaptor(new RichTeaTreeAdaptor());
		
		return parser;
	}
}