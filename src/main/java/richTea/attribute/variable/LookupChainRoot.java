package richTea.attribute.variable;

import richTea.attribute.AbstractAttribute;
import richTea.execution.ExecutionContext;

public class LookupChainRoot extends AbstractAttribute {

	public LookupChainRoot(String name) {
		super(name);
	}

	@Override
	public Object getValue(ExecutionContext context) {
		return context.getCurrentScope();
	}
}