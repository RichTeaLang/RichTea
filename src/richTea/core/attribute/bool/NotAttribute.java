package richTea.core.attribute.bool;

import richTea.core.attribute.AbstractAttribute;
import richTea.core.attribute.Attribute;
import richTea.core.resolver.Resolver;

public class NotAttribute extends AbstractAttribute {

	private Attribute initalValue;
	
	public NotAttribute(String name, Attribute initalValue) {
		super(name);
		
		this.initalValue = initalValue;
	}
	
	protected Attribute getInitialValue() {
		return initalValue;
	}
	
	@Override
	public void setContext(Resolver context) {
		super.setContext(context);
		
		getInitialValue().setContext(context);
	}
	
	@Override
	public Boolean getValue() {
		Object value = getInitialValue().getValue();
		
		return !Boolean.parseBoolean(value.toString());
	}
}