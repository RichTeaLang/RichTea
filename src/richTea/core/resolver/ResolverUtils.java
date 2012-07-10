package richTea.core.resolver;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import richTea.core.attribute.Attribute;
import richTea.core.execution.ExecutionContext;
import richTea.core.execution.VariableScope;

public class ResolverUtils {
	
	private ResolverUtils() {}
	
	public static Object resolveValue(ExecutionContext context, Object lookupContext, String key) {
		Object value = null;
		
		if(lookupContext instanceof VariableScope) {
			Attribute attribute = resolveAttribute((VariableScope) lookupContext, key);
			
			value = attribute != null ? attribute.getValue(context) : null;
		}
		
		if(value == null) {
			value = resolveByMethod(lookupContext, key);
			
			if(value == null) {
				value = resolveByField(lookupContext, key);
			}
		}
		
		return value;
	}
	
	public static Attribute resolveAttribute(VariableScope scope, String key) {
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
	
	public static Object resolveByMethod(Object context, String methodName) {
		Object value = null;
		
		Method[] availableMethods = context.getClass().getMethods();
		
		for(Method method : availableMethods) {
			if(method.getName().equalsIgnoreCase(methodName)) {
				try {
					value = method.invoke(context);
					break;
				}catch (Exception e) {}
			}
		}
		
		return value;
	}
	
	public static Object resolveByField(Object context, String fieldName) {
		Object value = null;
		
		Field[] availableFields = context.getClass().getFields();
		
		for(Field field : availableFields) {
			if(field.getName().equalsIgnoreCase(fieldName)) {
				try {
					value = field.get(context);
					break;
				}catch(Exception e) {}
			}
		}
		
		return value;
	}
}
