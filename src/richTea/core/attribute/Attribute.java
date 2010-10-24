package richTea.core.attribute;

import richTea.core.resolver.Resolver;

public interface Attribute {
	
	public String getName();
	public void setName(String name);
	
	public Object getValue();
	
	public Resolver getContext();
	public void setContext(Resolver context);
	
	public Attribute clone();
}