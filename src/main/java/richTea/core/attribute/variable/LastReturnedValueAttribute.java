package richTea.core.attribute.variable;

import richTea.core.attribute.AbstractAttribute;
import richTea.core.attribute.modifier.AttributeModifier;
import richTea.core.execution.ExecutionContext;

public class LastReturnedValueAttribute extends AbstractAttribute {

	public LastReturnedValueAttribute(String name) {
		super(name);
	}

	@Override
	public Object getValue(ExecutionContext context) {
		return context.getLastReturnValue();
	}
	
	@Override
	public Object modify(ExecutionContext context, AttributeModifier modifier) {
		Object value = modifier.modify(getValue(context));
		
		context.setLastReturnValue(value);
		
		return getValue(context);
	}
}