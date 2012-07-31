package richTea.core.attribute;

import richTea.core.execution.ExecutionContext;

public class NumberAttribute extends PrimativeAttribute {

	public NumberAttribute(String name, Number value) {
		super(name, value);
	}
	
	@Override
	public Number getValue(ExecutionContext context) {
		return (Number) super.getValue(context);
	}
}
