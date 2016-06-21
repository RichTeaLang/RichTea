package richTea.runtime.attribute;

import richTea.runtime.attribute.modifier.AttributeModifier;
import richTea.runtime.attribute.variable.LookupChainElement;
import richTea.runtime.attribute.variable.LookupChainRoot;
import richTea.runtime.attribute.variable.PropertyLookup;
import richTea.runtime.execution.ExecutionContext;

public class VariableAttribute extends LookupChainElement {
	
	public VariableAttribute(String property) {
		this(property, property);
	}
	
	public VariableAttribute(String name, String property) {
		this(name, new PropertyLookup(new PrimativeAttribute("property", property), new LookupChainRoot("root", false)));
	}
	
	public VariableAttribute(String name, Attribute lookupChain) {
		super(lookupChain);
		
		setName(name);
	}
	
	@Override
	protected Object performLookup(ExecutionContext content, Object lookupChainValue) {
		return lookupChainValue;
	}
	
	@Override
	public Object modify(ExecutionContext context, AttributeModifier modifier) {
		return getLookupChain().modify(context, modifier);
	}
}