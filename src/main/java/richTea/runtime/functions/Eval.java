package richTea.runtime.functions;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTree;

import richTea.compiler.RichTeaLexer;
import richTea.compiler.RichTeaParser;
import richTea.compiler.antlr.RichTeaTreeAdaptor;
import richTea.compiler.antlr.tree.AttributeData;
import richTea.compiler.bootstrap.BindingSet;
import richTea.compiler.bootstrap.BootstrapBindingSet;
import richTea.compiler.factory.RichTeaAttributeFactory;
import richTea.compiler.factory.RichTeaNodeFactory;
import richTea.runtime.attribute.Attribute;
import richTea.runtime.execution.AbstractFunction;

public class Eval extends AbstractFunction {

	@Override
	protected void run() throws Exception {
		Attribute attribute = evaluateSource(getSource());
		
		Object result = attribute.getValue(context);
		
		context.setLastReturnValue(result);
	}
	
	protected String getSource() {
		return context.getString("source");
	}
	
	protected Attribute evaluateSource(String source) throws RecognitionException {
		ANTLRStringStream sourceStream = new ANTLRStringStream(source);
		
		RichTeaLexer lexer = new RichTeaLexer(sourceStream);
		RichTeaParser parser = new RichTeaParser(new CommonTokenStream(lexer));
		parser.setTreeAdaptor(new RichTeaTreeAdaptor());
		
		CommonTree attributeData = (CommonTree) parser.implicit_attribute().getTree();

		RichTeaNodeFactory nodeFactory = new RichTeaNodeFactory(new BindingSet[] { new BootstrapBindingSet() });
		RichTeaAttributeFactory attributeFactory = new RichTeaAttributeFactory(nodeFactory);
		
		Attribute attribute = attributeFactory.create(new AttributeData(attributeData));

		return attribute;
	}
}