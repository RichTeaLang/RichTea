package richTea.core.attribute;

import richTea.core.attribute.modifier.AttributeModifier;
import richTea.core.resolver.Resolver;

public interface Attribute {
	
	public String getName();
	public void setName(String name);
	
	public Resolver getContext();
	public void setContext(Resolver context);
	
	public Object getValue();
	public Object modify(AttributeModifier modifier);
}