package richTea.attribute.variable;

import richTea.attribute.AbstractAttribute;
import richTea.attribute.modifier.AttributeModifier;
import richTea.execution.ExecutionContext;

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