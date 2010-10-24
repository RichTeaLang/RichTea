package richTea.core.node;

import org.apache.log4j.Logger;

import richTea.core.attribute.AttributeSet;
import richTea.core.attribute.PrimativeAttribute;
import richTea.core.resolver.AttributeResolver;
import richTea.core.resolver.Resolver;

public class AttributeContainerNode implements Resolver {

	private AttributeSet attributes;
	
	private Resolver resolver;
	
	protected Logger log;
	
	public AttributeContainerNode() {
		attributes = new AttributeSet();
		log = Logger.getLogger(getClass());
		
		setResolver(createResolver());
	}
	
	public Resolver getResolver() {
		return resolver;
	}
	
	protected void setResolver(Resolver resolver) {
		this.resolver = resolver;
	}
	
	protected Resolver createResolver() {
		return new AttributeResolver(this);
	}
	
	public Object getValue(String attributeName) {
		return getResolver().getValue(attributeName);
	}
	
	public Object getValueOrDefault(String attributeName, Object defaultValue) {
		Object value = getValue(attributeName);
		
		return value != null ? value : defaultValue;
	}
	
	public String getString(String attributeName) {
		return getValue(attributeName).toString();
	}
	
	public Boolean getBoolean(String attributeName) {
		return Boolean.parseBoolean(getString(attributeName));
	}
	
	public Number getNumber(String attributeName) {
		return Double.parseDouble(getString(attributeName));
	}
	
	public void setValue(String attributeName, Object value) {
		getAttributes().setAttribute(new PrimativeAttribute(attributeName, value));
	}

	public AttributeSet getAttributes() {
		return attributes;
	}
}