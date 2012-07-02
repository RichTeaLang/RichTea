package richTea.core.resolver;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import richTea.core.attribute.Attribute;
import richTea.core.node.TreeNode;

public class ResolverUtils {
	
	private ResolverUtils() {}
	
	public static Object resolveValue(Object context, String key) {
		Object value = null;
		
		if(context instanceof TreeNode) {
			Attribute attribute = resolveAttribute((TreeNode) context, key);
			
			value = attribute != null ? attribute.getValue(null) : null;
		}
		
		if(value == null) {
			value = resolveByMethod(context, key);
			
			if(value == null) {
				value = resolveByField(context, key);
			}
		}
		
		return value;
	}
	
	public static Attribute resolveAttribute(TreeNode context, String key) {
		Attribute value = null;
		
		while(context != null) {
			value = context.getAttribute(key);
			
			if(value == null) {
				context = context.getParent();
			}else {
				break;
			}
		}
		
		return value;
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
