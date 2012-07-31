package richTea.impl.debug;

import richTea.core.execution.AbstractFunction;
import richTea.core.execution.VariableScope;

public class PrintStack extends AbstractFunction {

	@Override
	protected void run() throws Exception {
		
		VariableScope scope = context.getCurrentScope();
		String indent = "";
		
		while(scope != null) {
			println(scope.getOwner().getFunction().getClass().getSimpleName(), indent);
			
			indent += " ";
			
			println(scope.getAttributes(), indent);
			println(scope.getOwner().getAttributes(), indent);
			
			scope = scope.getParent();
		}
	}
	
	private void println(Object message, String indent) {
		System.out.println(indent + message);
	}

}
