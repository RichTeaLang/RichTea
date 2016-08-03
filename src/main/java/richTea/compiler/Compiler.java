package richTea.compiler;

import java.lang.reflect.Method;
import java.util.List;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.ParserRuleReturnScope;
import org.antlr.runtime.tree.CommonTree;

import richTea.compiler.antlr.RichTeaTreeAdaptor;
import richTea.compiler.antlr.tree.AttributeData;
import richTea.compiler.antlr.tree.NodeData;
import richTea.compiler.bootstrap.ImportNode;
import richTea.compiler.factory.RichTeaNodeFactory;
import richTea.runtime.attribute.Attribute;
import richTea.runtime.node.TreeNode;

public class Compiler {
	private CharStream source;
	private RichTeaParser parser;
	private RichTeaNodeFactory nodeFactory;
	
	public Compiler(String source) {
		this(new ANTLRStringStream(source));
	}
	
	public Compiler(CharStream source) {
		this.source = source;
		this.parser = new RichTeaParser(new CommonTokenStream(new RichTeaLexer(source)));
		this.parser.setTreeAdaptor(new RichTeaTreeAdaptor());
		this.nodeFactory = new RichTeaNodeFactory();
	}

	public CharStream getSource() {
		return source;
	}
	
	public RichTeaParser getParser() {
		return parser;
	}
	
	public RichTeaNodeFactory getNodeFactory() {
		return nodeFactory;
	}
	
	public CompilationResult compile() {
		NodeData programData = (NodeData) getParseResult("program");
		RichTeaNodeFactory nodeFactory = getNodeFactory();
		String source = getSource().toString().trim();
		TreeNode program = nodeFactory.create(programData);
		List<ImportNode> imports = nodeFactory.getImports();
		
		return new CompilationResult(source, program, imports);
	}
	
	public Attribute compileAttribute() {
		AttributeData attributeData = new AttributeData(((CommonTree) getParseResult("attribute_list")).getChild(0));
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
