package richTea.core.attribute;

import richTea.core.attribute.modifier.AttributeModifier;
import richTea.core.execution.ExecutionContext;

public class PrimativeAttribute extends AbstractAttribute {
	
	private Object value;

	public PrimativeAttribute(String name, Object value) {
		super(name);
		
		this.value = value;
	}
	
	public Object getValue(ExecutionContext context) {
		return value;
	}
	
	@Override
	public Object modify(ExecutionContext context, AttributeModifier modifier) {
		this.value = super.modify(context, modifier);
		
		return getValue(context);
	}
}