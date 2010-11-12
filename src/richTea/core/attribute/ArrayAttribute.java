package richTea.core.attribute;

import java.util.ArrayList;
import java.util.List;

import richTea.core.attribute.modifier.AttributeModifier;
import richTea.core.resolver.Resolver;

public class ArrayAttribute extends AbstractAttribute {
	
	private List<Attribute> attributes;
	
	public ArrayAttribute(String name, List<Attribute> attributes) {
		super(name);
		
		this.attributes = attributes;
	}
	
	protected List<Attribute> getAttributes() {
		return attributes;
	}
	
	@Override
	public void setContext(Resolver context) {
		super.setContext(context);
		
		for(Attribute attribute : getAttributes()) {
			attribute.setContext(context);
		}
	}
	
	@Override
	public List<Object> getValue() {	
		List<Attribute> attributes = getAttributes();
		
		List<Object> values = new ArrayList<Object>(attributes.size());
		
		for(Attribute attribute : attributes) {
			values.add(attribute.getValue());
		}
		
		return values;
	}
	
	@Override	
	public Object modify(AttributeModifier modifier) {
		for(Attribute attribute : getAttributes()) {
			attribute.modify(modifier);
		}
		
		return getValue();
	}
}