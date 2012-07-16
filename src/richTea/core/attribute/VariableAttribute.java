package richTea.core.attribute;

import richTea.core.attribute.modifier.AttributeModifier;
import richTea.core.attribute.variable.LookupChainRoot;
import richTea.core.attribute.variable.PropertyLookup;
import richTea.core.execution.ExecutionContext;

public class VariableAttribute extends AbstractAttribute {
	
	private Attribute lookupChain;
	
	public VariableAttribute(String property) {
		this(property, new PropertyLookup(new StringAttribute("property", property), new LookupChainRoot("root")));
	}
	
	public VariableAttribute(String name, Attribute lookupChain) {
		super(name);
		
		this.lookupChain = lookupChain;
	}
	
	public Attribute getLookupChain() {
		return lookupChain;
	}
		
	@Override
	public Object getValue(ExecutionContext context) {
		Object value = getLookupChain().getValue(context);
		
		return value;
	}
	
	@Override
	public Object modify(ExecutionContext context, AttributeModifier modifier) {
		return getLookupChain().modify(context, modifier);
	}
}