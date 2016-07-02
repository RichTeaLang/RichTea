package richTea.runtime.attribute;

import java.util.HashMap;
import java.util.Map;

public class AttributeSet {
	
	private Map<String, Attribute> attributes;
	
	public AttributeSet() {
		attributes = new HashMap<String, Attribute>();
	}
	
	public AttributeSet(Attribute... attributes) {
		this();
		
		for(Attribute attribute : attributes) {
			if (!hasAttribute(attribute.getName())) {
				setAttribute(attribute);
			} else {
				throw new IllegalArgumentException("Duplicate attribute name: " + attribute.getName());
			}
		}
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