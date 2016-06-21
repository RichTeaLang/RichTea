package richTea.test;

import static org.junit.Assert.assertTrue;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTree;
import org.apache.log4j.BasicConfigurator;

import richTea.compiler.RichTeaLexer;
import richTea.compiler.RichTeaParser;
import richTea.compiler.antlr.RichTeaTreeAdaptor;
import richTea.compiler.antlr.tree.AttributeData;
import richTea.compiler.antlr.tree.NodeData;
import richTea.compiler.factory.RichTeaAttributeFactory;
import richTea.compiler.factory.RichTeaNodeFactory;
import richTea.runtime.attribute.Attribute;
import richTea.runtime.execution.ExecutionContext;
import richTea.runtime.execution.VariableScope;
import richTea.runtime.node.TreeNode;

public class RichTeaTestBase {
	
	private RichTeaNodeFactory nodeFactory;
	private RichTeaAttributeFactory attributeFactory;

	public RichTeaTestBase() {
		BasicConfigurator.configure();
		
		nodeFactory = new RichTeaNodeFactory();
		attributeFactory = new RichTeaAttributeFactory(nodeFactory);
	}
	
	protected Attribute buildAttribute(String input) {
		try {
			CommonTree parseTree = (CommonTree) configureParser(input).attribute_list().getTree();
			AttributeData attributeData = (AttributeData) parseTree.getChild(0);
			
			return attributeFactory.create(attributeData);
		} catch (RecognitionException e) {
			throw new RuntimeException(e);
		}
	}
	
	protected void testAttributeValue(String input, Object requiredValue) {
		Object value = buildAttribute(input).getValue(null);
		
		assertTrue(value != null ? value.equals(requiredValue) : value == requiredValue);
	}
	
	protected TreeNode buildNode(String input) {
		try {
			NodeData nodeData = (NodeData) configureParser(input).program().getTree();
			
			return nodeFactory.create(nodeData);
		} catch (RecognitionException e) {
			throw new RuntimeException(e);
		}
	}
	
	protected ExecutionContext buildExecutionContext(String input) {
		return new ExecutionContext(new VariableScope(buildNode(input)));
	}
	
	private RichTeaParser configureParser(String input) {
		ANTLRStringStream source = new ANTLRStringStream(input);
		
		RichTeaLexer lexer = new RichTeaLexer(source);
		RichTeaParser parser = new RichTeaParser(new CommonTokenStream(lexer));
		parser.setTreeAdaptor(new RichTeaTreeAdaptor());
		
		return parser;
	}
}