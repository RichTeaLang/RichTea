package richTea.core.execution;

import richTea.core.attribute.Attribute;
import richTea.core.attribute.AttributeSet;
import richTea.core.resolver.Resolver;

public class Scope implements Resolver {
	
	private Scope parent;
	
	private AttributeSet attributes;
	
	private Object returnValue;
	
	public Scope(AttributeSet attributes) {
		this(attributes, null);
	}
	
	public Scope(AttributeSet attributes, Scope parent) {
		this.parent = parent;
		this.attributes = attributes;
	}

	public Object getValue(String key) {
		Attribute attribute = attributes.getAttribute(key);
		
		Object value = attribute != null ? attribute.getValue() : null;;
		
		if(value == null && parent != null) {
			value = parent.getValue(key);
		}
		
		return value;
	}
	
	public Object getReturnValue() {
		return returnValue;
	}
	
	public void setReturnValue(Object returnValue) {
		this.returnValue = returnValue;
	}
}