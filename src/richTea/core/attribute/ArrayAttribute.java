package richTea.core.attribute;

import richTea.core.resolver.Resolver;

public class ArrayAttribute extends PrimativeAttribute {
	
	public ArrayAttribute(String name, Attribute[] elements) {
		super(name, elements);
	}
	
	@Override
	public void setContext(Resolver context) {
		super.setContext(context);
		
		for(Attribute arrayElement : getInitialValue()) {
			arrayElement.setContext(context);
		}
	}
	
	@Override
	public Attribute[] getInitialValue() {
		return (Attribute[]) super.getInitialValue();
	}
	
	@Override
	public Object[] getValue() {	
		Attribute[] arrayAttributes = getInitialValue();
		
		Object[] value = new Object[arrayAttributes.length];
		
		for(int i = 0; i < value.length; i++) {
			value[i] = arrayAttributes[i].getValue();
		}
		
		return value;
	}
}