package richTea.core.attribute;

import java.util.ArrayList;
import java.util.List;

import richTea.core.resolver.Resolver;

public class ArrayAttribute extends PrimativeAttribute {
	
	public ArrayAttribute(String name, List<Attribute> elements) {
		super(name, elements);
	}
	
	@Override
	public void setContext(Resolver context) {
		super.setContext(context);
		
		for(Attribute arrayElement : getInitialValue()) {
			arrayElement.setContext(context);
		}
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Attribute> getInitialValue() {
		return (List<Attribute>) super.getInitialValue();
	}
	
	@Override
	public List<Object> getValue() {	
		List<Attribute> arrayAttributes = getInitialValue();
		
		List<Object> values = new ArrayList<Object>(arrayAttributes.size());
		
		for(Attribute attribute : arrayAttributes) {
			values.add(attribute.getValue());
		}
		
		return values;
	}
}