package richTea.impl;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTree;

import richTea.antlr.RichTeaLexer;
import richTea.antlr.RichTeaParser;
import richTea.antlr.RichTeaTreeAdaptor;
import richTea.antlr.tree.AttributeData;
import richTea.attribute.Attribute;
import richTea.execution.AbstractFunction;
import richTea.factory.RichTeaAttributeFactory;
import richTea.factory.RichTeaNodeFactory;

public class EvalFunction extends AbstractFunction {

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