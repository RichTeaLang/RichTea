package richTea.runtime.attribute.variable;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import richTea.runtime.attribute.Attribute;
import richTea.runtime.attribute.modifier.AttributeModifier;
import richTea.runtime.execution.ExecutionContext;

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
		if(value != null && value.getClass().isArray()) {
			value = convertArray(value);
		} else if (value instanceof Attribute) {
			value = ((Attribute) value).getValue(context);
		}
		
		return value;
	}
	
	protected List<Object> convertArray(Object array) {
		return Collections.unmodifiableList(Arrays.asList(array));
	}
}