package richTea.core.attribute;

import java.util.List;

import richTea.core.resolver.ResolverUtils;

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
			String nextElement = null;
			
			value = getContext(); // "this" (implicit starting point)
			
			for(int i = 0; i < lookupPathLength; i++) {
				nextElement = lookupPath.get(i);
				
				if(value != null) {
					value = ResolverUtils.resolve(value, nextElement);
				}else {
					value = null; // Couldn't resolve the entire path so value == null
					break;
				}
			}
		}
		
		return value;
	}
}