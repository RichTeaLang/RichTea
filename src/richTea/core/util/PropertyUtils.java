package richTea.core.util;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import richTea.core.resolver.Resolver;

public class PropertyUtils {
	
	private PropertyUtils() {}
	
	public static Object getProperty(Object target, String property) {
		Object value = null;
		
		if(target instanceof Resolver) {
			value = getProperty((Resolver) target, property);
		}
		
		if(value == null) {
			try {
				
			}catch (Exception e) {
				// Swallow all exceptions.
			}
			Method[] methods = target.getClass().getMethods();
			Field[] fields = target.getClass().getFields();
		}
		
		return null;
	}
	
	public static Object getProperty(Resolver target, String property) {
		return target.getValue(property);
	}

}