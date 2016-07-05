package richTea.runtime.functions;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.RecognitionException;

import richTea.compiler.Compiler;
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
		Compiler compiler = new Compiler(sourceStream);
		Attribute compilationResult = compiler.compileAttribute();
		
		return compilationResult;
	}
}