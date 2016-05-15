package richTea.core.attribute.variable;

import java.util.Arrays;
import java.util.Collections;
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
	
	abstract protected Object performLookup(ExecutionContext content, Object lookupContext);

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
		return Collections.unmodifiableList(Arrays.asList(array));
	}
}