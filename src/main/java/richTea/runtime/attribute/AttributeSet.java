package richTea.runtime.attribute;

import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;

public class AttributeSet {
		
	protected Logger log = Logger.getLogger(getClass());
	
	private Map<String, Attribute> attributes;
	
	public AttributeSet() {
		attributes = new HashMap<String, Attribute>();
	}

	public Attribute getAttribute(String attributeName) {
		return attributes.get(attributeName.toLowerCase());
	}
	
	public Attribute setAttribute(Attribute attribute) {
		return attributes.put(attribute.getName().toLowerCase(), attribute);
	}
	
	public boolean hasAttribute(String attributeName) {
		return attributes.containsKey(attributeName.toLowerCase());
	}
	
	public Attribute[] getAttributes() {
		return attributes.values().toArray(new Attribute[attributes.size()]);
	}
}