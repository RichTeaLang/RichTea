package richTea.runtime.attribute;

import java.util.ArrayList;
import java.util.List;

import richTea.runtime.attribute.modifier.AttributeModifier;
import richTea.runtime.execution.ExecutionContext;

public class ArrayAttribute extends AbstractAttribute {
	
	private Attribute[] elements;
	
	public ArrayAttribute(String name, Attribute[] elements) {
		super(name);
		
		this.elements = elements;
	}
	
	protected Attribute[] getElements() {
		return elements;
	}
	
	@Override
	public List<Object> getValue(ExecutionContext context) {
		Attribute[] elements = getElements();
		List<Object> values = new ArrayList<Object>(elements.length);
		
		for(Attribute element : elements) {
			values.add(element.getValue(context));
		}
		
		return values;
	}
	
	@Override	
	public Object modify(ExecutionContext context, AttributeModifier modifier) {
		for(Attribute element : getElements()) {
			element.modify(context, modifier);
		}
		
		return getValue(context);
	}
}