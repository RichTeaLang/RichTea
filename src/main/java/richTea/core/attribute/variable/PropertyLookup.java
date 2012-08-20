package richTea.core.attribute.variable;

import richTea.core.attribute.Attribute;
import richTea.core.attribute.AttributeSet;
import richTea.core.attribute.modifier.AttributeModifier;
import richTea.core.execution.ExecutionContext;
import richTea.core.execution.VariableScope;

public class PropertyLookup extends LookupChainElement {

	private Attribute property;
	
	public PropertyLookup(Attribute property, Attribute lookupChain) {
		super(lookupChain);
		
		this.property = property;
	}
	
	public String getPropertyName(ExecutionContext context) {
		return property.getValue(context).toString();
	}
	
	public Object getPropertyHolder(ExecutionContext context) {
		return getLookupChain().getValue(context);
	}

	@Override
	protected Object performLookup(ExecutionContext context, Object lookupChainValue) {
		return resolveAttribute(context).getValue(context);
	}
	
	@Override
	public Object modify(ExecutionContext context, AttributeModifier modifier) {
		return resolveAttribute(context).modify(context, modifier);
	}
	
	private Attribute resolveAttribute(ExecutionContext context) {
		Attribute attribute = null;
		
		String attributeName = getPropertyName(context);
		Object attributeSource = getPropertyHolder(context);
		
		if(attributeSource instanceof AttributeSet) {
			AttributeSet attributeSet = (AttributeSet) attributeSource;
			
			if(attributeSet instanceof VariableScope) attribute = ((VariableScope) attributeSet).resolveAttribute(attributeName);
			else attribute =  attributeSet.getAttribute(attributeName);
		}
		
		if(attribute == null) attribute = new BeanLookup(attributeName, attributeSource);
		
		return attribute;
	}
}