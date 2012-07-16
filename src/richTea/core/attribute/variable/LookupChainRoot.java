package richTea.core.attribute.variable;

import richTea.core.attribute.AbstractAttribute;
import richTea.core.execution.ExecutionContext;

public class LookupChainRoot extends AbstractAttribute {

	public LookupChainRoot(String name) {
		super(name);
	}

	@Override
	public Object getValue(ExecutionContext context) {
		return context.getCurrentScope();
	}
}