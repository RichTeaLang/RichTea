package richTea.runtime.attribute.modifier;

public class SetModifier implements AttributeModifier {
	
	private Object value;
	
	public SetModifier(Object value) {
		this.value = value;
	}
	
	@Override
	public Object modify(Object attributeValue) {
		return value;
	}
}