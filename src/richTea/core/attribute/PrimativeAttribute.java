package richTea.core.attribute;

import richTea.core.attribute.modifier.AttributeModifier;

public class PrimativeAttribute extends AbstractAttribute {
	
	private Object value;

	public PrimativeAttribute(String name, Object value) {
		super(name);
		
		this.value = value;
	}
	
	public Object getValue() {
		return value;
	}
	
	@Override
	public Object modify(AttributeModifier modifier) {
		this.value = modifier.modify(this);
		
		return getValue();
	}
}