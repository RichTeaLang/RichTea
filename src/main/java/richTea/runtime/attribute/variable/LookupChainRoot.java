package richTea.runtime.attribute.variable;

import richTea.runtime.attribute.AbstractAttribute;
import richTea.runtime.execution.ExecutionContext;

public class LookupChainRoot extends AbstractAttribute {

	public LookupChainRoot(String name) {
		super(name);
	}

	@Override
	public Object getValue(ExecutionContext context) {
		return context.getCurrentScope();
	}
}