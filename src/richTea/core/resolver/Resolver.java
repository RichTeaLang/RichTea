package richTea.core.resolver;

import richTea.core.attribute.Attribute;

public interface Resolver {
	
	public Object getValue(String key);
	
	public Attribute getAttribute(String key);
}
