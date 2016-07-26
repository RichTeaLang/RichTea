package richTea.runtime.attribute.variable;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import richTea.runtime.attribute.Attribute;
import richTea.runtime.attribute.modifier.AttributeModifier;
import richTea.runtime.execution.ExecutionContext;

public abstract class LookupChainElement implements Attribute {

	private Attribute lookupChain;
	private boolean resolveAttributeValue;
	
	public LookupChainElement(Attribute lookupChain, boolean resolveAttributeValue) {
		this.lookupChain = lookupChain;
		this.resolveAttributeValue = resolveAttributeValue;
	}
	
	public String getName() {
		return getLookupChain().getName();
	}
	
	public void setName(String name) {
		getLookupChain().setName(name);
	}
	
	public Attribute getLookupChain() {
		return lookupChain;
	}
	
	public boolean willResolveAttributeValue() {
		return resolveAttributeValue;
	}
	
	@Override
	public Object getValue(ExecutionContext context) {
		Object lookupContext = getLookupChain().getValue(context);
		Object value = performLookup(context, lookupContext);
		
		value = ensureValidDataType(value, context);
		
		return value;
	}
	
	abstract protected Object performLookup(ExecutionContext content, Object lookupContext);

	@Override
	public Object modify(ExecutionContext context, AttributeModifier modifier) {
		getLookupChain().modify(context, modifier);
		
		return getValue(context);
	}
	
	protected Object ensureValidDataType(Object value, ExecutionContext context) {
		if (value instanceof Attribute) {
			Attribute attribute = resolveAttributeReference((Attribute) value, context);
			
			if (willResolveAttributeValue()) {
				value = attribute.getValue(context);
			} else {
				value = attribute;
			}
		}
		
		if(value != null && value.getClass().isArray()) {
			value = convertArray(value);
		}
		
		return value;
	}
	
	protected List<Object> convertArray(Object array) {
		int length = Array.getLength(array);
		List<Object> list = new ArrayList<>(length);
		
		for (int i = 0; i < length; i++) {
			list.add(i, Array.get(array, i));
		}
		
		return Collections.unmodifiableList(list);
	}
	
	protected Attribute resolveAttributeReference(Attribute attribute, ExecutionContext context) {
		Object value = attribute.getValue(context);
		
		while(value instanceof Attribute) {
			attribute = (Attribute) value;
			value = attribute.getValue(context);
		}
		
		return attribute;
	}
}