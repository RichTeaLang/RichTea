package richTea.core.resolver;

import richTea.core.attribute.Attribute;
import richTea.core.attribute.JavaBeanAttribute;
import richTea.core.execution.VariableScope;

public class ResolverUtils {
	
	private ResolverUtils() {}
	
	public static Attribute resolve(Object context, String key) {
		Attribute attribute = null;
		
		if(context instanceof VariableScope) {
			attribute = resolveAttributeFromScope((VariableScope) context, key);
		} else {
			attribute = new JavaBeanAttribute(key, context);
		}
		
		return attribute;
	}

	public static Attribute resolveAttributeFromScope(VariableScope scope, String key) {
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
