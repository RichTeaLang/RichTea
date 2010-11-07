package richTea.core.attribute;

import richTea.core.attribute.modifier.AttributeModifier;
import richTea.core.resolver.Resolver;

public interface Attribute {
	
	public String getName();
	public void setName(String name);
	
	public Object getValue();
	public Object modify(AttributeModifier modifier);
	
	public Resolver getContext();
	public void setContext(Resolver context);
	
	
}