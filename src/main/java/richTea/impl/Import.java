package richTea.impl;

import richTea.core.execution.AbstractFunction;
import richTea.core.factory.bindings.ImportNode;

public class Import extends AbstractFunction {

	@Override
	protected void run() throws Exception {
		ImportNode node = (ImportNode) context.getCurrentNode();
		
		context.setLastReturnValue(node.getImportedBindings().getBindings());
	}
}
