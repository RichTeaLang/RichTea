package richTea.core.attribute;

import richTea.core.attribute.modifier.AttributeModifier;
import richTea.core.resolver.Resolver;

public class PrimativeAttribute implements Attribute {
	
	private String name;
	private Object initialValue;
	private Resolver context;
	
	public PrimativeAttribute(String name, Object initialValue) {
		setName(name);
		setInitialValue(initialValue);
	}
	
	 public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public Object getInitialValue() {
		return initialValue;
	}
	
	protected void setInitialValue(Object initialValue) {
		this.initialValue = initialValue;
	}
	
	public Object getValue() {
		return getInitialValue();
	}
	
	public Object modify(AttributeModifier modifier) {
		this.initialValue = modifier.modify(this);
		
		return getValue();
	}
	
	public Resolver getContext() {
		return context;
	}

	public void setContext(Resolver context) {
		this.context = context;
	}
	
	public PrimativeAttribute clone() {
		PrimativeAttribute clone = new PrimativeAttribute(getName(), getInitialValue());
		
		clone.setContext(getContext());
		
		return clone;
		
	}
	
	@Override
	public String toString() {
		return String.format("%s -> %s", getName(), getValue());
	}
}