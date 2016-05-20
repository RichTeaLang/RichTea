package richTea.compiler;

import java.lang.reflect.Method;

import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.ParserRuleReturnScope;
import org.antlr.runtime.tree.CommonTree;

import richTea.compiler.antlr.RichTeaTreeAdaptor;
import richTea.compiler.antlr.tree.AttributeData;
import richTea.compiler.antlr.tree.NodeData;
import richTea.compiler.bootstrap.BindingSet;
import richTea.compiler.factory.RichTeaNodeFactory;
import richTea.runtime.attribute.Attribute;
import richTea.runtime.node.TreeNode;

public class RichTeaCompiler {
	private CharStream source;
	private BindingSet[] bindings;
	private RichTeaParser parser;
	private RichTeaNodeFactory nodeFactory;
	
	public RichTeaCompiler(CharStream source, BindingSet[] bindings) {
		this.source = source;
		this.bindings = bindings;
		this.parser = new RichTeaParser(new CommonTokenStream(new RichTeaLexer(source)));
		this.parser.setTreeAdaptor(new RichTeaTreeAdaptor());
		this.nodeFactory = new RichTeaNodeFactory(bindings);
	}

	public CharStream getSource() {
		return source;
	}

	public BindingSet[] getBindings() {
		return bindings;
	}
	
	public RichTeaParser getParser() {
		return parser;
	}
	
	public RichTeaNodeFactory getNodeFactory() {
		return nodeFactory;
	}
	
	public TreeNode compile() {
		NodeData programData = (NodeData) getParseResult("program");
		TreeNode program = getNodeFactory().create(programData);
		
		return program;
	}
	
	public Attribute compileAttribute() {
		AttributeData attributeData = new AttributeData((CommonTree) getParseResult("implicit_attribute"));
		Attribute attribute = getNodeFactory().getAttributeFactory().create(attributeData);
		
		return attribute;
	}
	
	protected Object getParseResult(String parserEntryPoint) {
		try {
			RichTeaParser parser = getParser();
			Method entryPoint = parser.getClass().getMethod(parserEntryPoint);
			ParserRuleReturnScope parseResult = (ParserRuleReturnScope) entryPoint.invoke(parser);
			
			return parseResult.getTree();
		} catch (Exception e) {
			throw new RuntimeException("Parse failed", e);
		}
		
	}
}
