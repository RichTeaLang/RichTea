package richTea.core.attribute.bool;

import richTea.core.attribute.Attribute;
import richTea.core.attribute.PrimativeAttribute;
import richTea.core.resolver.Resolver;

public class NotAttribute extends PrimativeAttribute {

	public NotAttribute(String name, Attribute initialValue) {
		super(name, initialValue);
	}
	
	@Override
	public void setContext(Resolver context) {
		super.setContext(context);
		
		getInitialValue().setContext(context);
	}
	
	@Override
	public Attribute getInitialValue() {
		return (Attribute) super.getInitialValue();
	}
	
	@Override
	public Boolean getValue() {
		Object value = getInitialValue().getValue();
		
		return !Boolean.parseBoolean(value.toString());
	}
}