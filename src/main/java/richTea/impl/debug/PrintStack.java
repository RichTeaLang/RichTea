package richTea.impl.debug;

import richTea.core.attribute.Attribute;
import richTea.core.execution.AbstractFunction;
import richTea.core.execution.VariableScope;

public class PrintStack extends AbstractFunction {

	@Override
	protected void run() throws Exception {
		
		VariableScope scope = context.getCurrentScope();
		String indent = "";
		
		while(scope != null) {
			println("[F] " + scope.getOwner().getFunction().getClass().getSimpleName(), indent);
			
			indent += " ";
			
			printAttributeList(scope, indent);
			
			scope = scope.getParent();
		}
	}
	
	protected void printAttributeList(VariableScope scope, String indent) {
		
		for(Attribute attribute : scope.getAttributes()) {
			println("[A] " + attribute.getName(), indent);
		}
		
		for(Attribute attribute : scope.getOwner().getAttributes()) {
			println("[A] " + attribute.getName(), indent);
		}
	}
	
	private void println(Object message, String indent) {
		System.out.println(indent + message);
	}
}