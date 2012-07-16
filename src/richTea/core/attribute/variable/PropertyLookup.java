package richTea.core.attribute.variable;

import org.apache.commons.beanutils.PropertyUtils;

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
	public Object getValue(ExecutionContext context) {
		Object value = null;
		
		String propertyName = getPropertyName(context);
		Object propertyHolder = getPropertyHolder(context);
		
		if(propertyHolder instanceof VariableScope) {
			Attribute attribute = resolveAttributeFromScope((VariableScope) propertyHolder, propertyName);
			
			value = attribute != null ? attribute.getValue(context) : null;
		}
		
		if(value == null && propertyHolder instanceof AttributeSet) {
			Attribute attribute = ((AttributeSet) propertyHolder).getAttribute(propertyName);
			
			value = attribute != null ? attribute.getValue(context) : null;
		}
		
		if(value == null) {
			try {
				value = PropertyUtils.getSimpleProperty(propertyHolder, propertyName);
			} catch (Exception e) {
				throw new IllegalArgumentException("Unable to get value: " + e.getMessage(), e);
			}
		}
		
		return value;
	}
	
	@Override
	public Object modify(ExecutionContext context, AttributeModifier modifier) {
		String propertyName = getPropertyName(context);
		Object propertyHolder = getPropertyHolder(context);
		
		if(propertyHolder instanceof VariableScope) {
			Attribute attribute = resolveAttributeFromScope((VariableScope) propertyHolder, propertyName);
			
			if(attribute != null) {
				return attribute.modify(context, modifier);
			}
		}
		
		Object value = modifier.modify(getValue(context));
		
		try {
			PropertyUtils.setSimpleProperty(propertyHolder, propertyName, value);
			
			return value;
		} catch (Exception e) {
			throw new IllegalArgumentException("Unable to get value", e);
		}
	}
	
	public Attribute resolveAttributeFromScope(VariableScope scope, String key) {
		Attribute attribute = null;
		
		while(scope != null) {
			attribute = scope.getAttribute(key);
			
			if(attribute == null) {
				scope = scope.getParent();
			} else {
				break;
			}
		}
		
		return attribute;
	}
}
