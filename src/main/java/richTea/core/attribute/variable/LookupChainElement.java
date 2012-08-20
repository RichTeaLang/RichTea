package richTea.core.attribute.variable;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import richTea.core.attribute.Attribute;
import richTea.core.attribute.modifier.AttributeModifier;
import richTea.core.execution.ExecutionContext;

public abstract class LookupChainElement implements Attribute {

	private Attribute lookupChain;
	
	public LookupChainElement(Attribute lookupChain) {
		this.lookupChain = lookupChain;
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
	
	@Override
	public Object getValue(ExecutionContext context) {
		Object value = performLookup(context, getLookupChain().getValue(context));
		
		value = ensureValidDataType(value);
		
		return value;		
	}
	
	abstract protected Object performLookup(ExecutionContext content, Object lookupChainValue);

	@Override
	public Object modify(ExecutionContext context, AttributeModifier modifier) {
		getLookupChain().modify(context, modifier);
		
		return getValue(context);
	}
	
	protected Object ensureValidDataType(Object value) {
		if(value != null && value.getClass().isArray()) {
			value = convertArray(value);
		}
		
		return value;
	}
	
	protected List<Object> convertArray(Object array) {
		int arrayLength = Array.getLength(array);
		List<Object> list = new ArrayList<Object>(arrayLength);
		
		for(int i = 0; i < arrayLength; i++) {
			list.add(Array.get(array, i));
		}
		
		return list;
	}
}