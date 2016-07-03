package richTea.runtime.functions;

import richTea.compiler.bootstrap.ImportNode;
import richTea.runtime.execution.AbstractFunction;

public class Import extends AbstractFunction {

	@Override
	protected void run() throws Exception {
		ImportNode node = (ImportNode) context.getCurrentNode();
		
		context.setLastReturnValue(node.getImportedBindings());
	}
}
