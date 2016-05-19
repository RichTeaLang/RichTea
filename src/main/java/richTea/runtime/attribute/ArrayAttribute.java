package richTea.runtime.attribute;

import java.util.ArrayList;
import java.util.List;

import richTea.runtime.attribute.modifier.AttributeModifier;
import richTea.runtime.execution.ExecutionContext;

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
	public List<Object> getValue(ExecutionContext context) {	
		List<Attribute> attributes = getAttributes();
		
		List<Object> values = new ArrayList<Object>(attributes.size());
		
		for(Attribute attribute : attributes) {
			values.add(attribute.getValue(context));
		}
		
		return values;
	}
	
	@Override	
	public Object modify(ExecutionContext context, AttributeModifier modifier) {
		for(Attribute attribute : getAttributes()) {
			attribute.modify(context, modifier);
		}
		
		return getValue(context);
	}
}