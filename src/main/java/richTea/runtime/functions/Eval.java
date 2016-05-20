package richTea.runtime.functions;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.RecognitionException;

import richTea.compiler.RichTeaCompiler;
import richTea.compiler.bootstrap.BindingSet;
import richTea.compiler.bootstrap.BootstrapBindingSet;
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
		BindingSet[] bindings = { new BootstrapBindingSet() };
		RichTeaCompiler compiler = new RichTeaCompiler(sourceStream, bindings);
		Attribute compilationResult = compiler.compileAttribute();
		
		return compilationResult;
	}
}