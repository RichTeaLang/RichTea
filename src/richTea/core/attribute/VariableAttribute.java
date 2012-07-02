package richTea.core.attribute;

import java.util.List;

import richTea.core.attribute.modifier.AttributeModifier;
import richTea.core.execution.ExecutionContext;
import richTea.core.resolver.ResolverUtils;

public class VariableAttribute extends PrimativeAttribute {
	
	public VariableAttribute(String name, List<String> lookupPath) {
		super(name, lookupPath);
	}
		
	@Override
	public Object getValue(ExecutionContext context) {
		@SuppressWarnings("unchecked")
		List<String> lookupPath = (List<String>) super.getValue(context);
		
		int lookupPathLength = lookupPath.size();
	
		Object value = null;
		
		if(lookupPathLength > 0) {
			String nextElement = null;
			
			value = context.getCurrentNode(); // "this" (implicit starting point)
			
			for(int i = 0; i < lookupPathLength; i++) {
				nextElement = lookupPath.get(i);
				
				if(value != null) {
					value = ResolverUtils.resolveValue(value, nextElement);
				}else {
					value = null; // Couldn't resolve the entire path so value == null
					break;
				}
			}
		}
		
		return value;
	}
	
	protected Attribute getAttribute() {
		@SuppressWarnings("unchecked")
		List<String> lookupPath = (List<String>) super.getValue(null);
		
		int lookupPathLength = lookupPath.size();
	
		Attribute value = this;;
		
		if(lookupPathLength > 0) {
			String nextElement = null;
			
			for(int i = 0; i < lookupPathLength; i++) {
				nextElement = lookupPath.get(i);
				
				if(value != null) {
					//value = ResolverUtils.resolveAttribute((TreeNode) value.getOwner(), nextElement);
				}else {
					value = null; // Couldn't resolve the entire path so value == null
					break;
				}
			}
		}
		
		return value;
	}
	
	@Override
	public Object modify(AttributeModifier modifier) {
	//	Attribute attribute = getAttribute();
		
	//	return attribute.modify(modifier);
		
		return null;
	}
}