package richTea.core.attribute;

import java.lang.reflect.Method;
import java.util.List;

import richTea.core.resolver.Resolver;

public class LookupAttribute extends PrimativeAttribute {

	public LookupAttribute(String name, List<String> lookupPath) {
		super(name, lookupPath);
	}
	
	@Override
	public Object getValue() {
		@SuppressWarnings("unchecked")
		List<String> lookupPath = (List<String>) super.getValue();
		
		int lookupPathLength = lookupPath.size();
	
		Object value = null;
		
		if(lookupPathLength > 0) {
			value = getContext().getValue(lookupPath.get(0));
			
			for(int i = 1; i < lookupPathLength; i++) {
				String nextElement = lookupPath.get(i);
				
				if(value == null) {
					return null; // We couldn't resolve all the way to the end of the lookup path
				} else if (value instanceof Resolver) {					
					value = ((Resolver) value).getValue(nextElement);
				} else {
					Method[] methods = value.getClass().getMethods();
					Method methodToInvoke = null;
					
					for(Method method : methods) {
						if(method.getName().equalsIgnoreCase(nextElement)) {
							methodToInvoke = method;
							break;
						}
					}
					
					if(methodToInvoke != null) {
						try {
							value = methodToInvoke.invoke(value);
						}catch (Exception e) {
							// This is a 'fall back and hope' method of resolving an attribute.  Swallow any errors
						}
					} else {
						return null; // We couldn't resolve all the way to the end of the lookup path
					}
				}
			}	
		}
		
		return value;
	}
}