package richTea.core.attribute.modifier;

import richTea.core.attribute.Attribute;

public class SetModifier implements AttributeModifier {
	
	private Object value;
	
	public SetModifier(Object value) {
		this.value = value;
	}
	
	@Override
	public Object modify(Attribute attribute) {
		return value;
	}
}