package richTea.impl;

import richTea.execution.AbstractFunction;

public class ImportFunction extends AbstractFunction {

	@Override
	protected void run() throws Exception {
		ImportNode node = (ImportNode) context.getCurrentNode();
		
		context.setLastReturnValue(node.getImportedBindings().getBindings());
	}
}
