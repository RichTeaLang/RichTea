package richTea.core.attribute;

import richTea.core.execution.ExecutionContext;

public class LastReturnedValueAttribute extends AbstractAttribute {

	public LastReturnedValueAttribute(String name) {
		super(name);
	}

	@Override
	public Object getValue(ExecutionContext context) {
		return context.getLastReturnValue();
	}
}
