package richTea.core.attribute.variable;

import richTea.core.attribute.Attribute;
import richTea.core.execution.ExecutionContext;

public class LastReturnedValueAttribute extends LookupChainElement {

	public LastReturnedValueAttribute(Attribute lookupChain) {
		super(lookupChain);
	}

	@Override
	protected Object performLookup(ExecutionContext context, Object lookupChainValue) {
		return context.getLastReturnValue();
	}
}