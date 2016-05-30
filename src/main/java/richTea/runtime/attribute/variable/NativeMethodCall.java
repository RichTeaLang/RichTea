package richTea.runtime.attribute.variable;

import java.lang.reflect.Method;

import org.apache.commons.beanutils.MethodUtils;

import richTea.runtime.attribute.Attribute;
import richTea.runtime.attribute.modifier.AttributeModifier;
import richTea.runtime.execution.ExecutionContext;

public class NativeMethodCall extends LookupChainElement {

	private String methodName;
	private Attribute[] methodArguments;
	
	public NativeMethodCall(String methodName, Attribute[] methodArguments, Attribute lookupChain) {
		super(lookupChain);
		
		this.methodName = methodName;
		this.methodArguments = methodArguments;
	}
	
	public String getMethodName() {
		return methodName;
	}
	
	public Attribute[] getMethodArguments() {
		return methodArguments;
	}

	@Override
	protected Object performLookup(ExecutionContext context, Object lookupContext) {
		String methodName = getMethodName();
		Attribute[] arguments = getMethodArguments();
		
		Object[] argumentValues = new Object[arguments.length];
		Class<?>[] argumentTypes = new Class<?>[arguments.length];
		
		for(int i = 0; i < arguments.length; i++) {
			Object value = arguments[i].getValue(context);
			
			argumentValues[i] = value;
			argumentTypes[i] = value != null ? value.getClass() : Null.class;
		}
		
		Method method = MethodUtils.getMatchingAccessibleMethod(lookupContext.getClass(), methodName, argumentTypes);
		
		if(method == null) {
			/* If we haven't found a method it could be because we're trying to pass null as one of the params which
			 * the above code doesn't account for. */
			method = findBestMatchMethod(lookupContext.getClass(), methodName, argumentTypes);
		}
		
		if(method != null) {
			try {
				return method.invoke(lookupContext, argumentValues);
			} catch (Exception e) {
				throw new IllegalArgumentException(String.format("Cannot invoke method %s: %s", methodName, e.getMessage()), e);
			}
		} else {
			throw new IllegalArgumentException("Unable to find method to invoke");
		}		
	}
	
	protected Method findBestMatchMethod(Class<?> clazz, String methodName, Class<?>[] argumentTypes) {
		methodFinder:
		for(Method method : clazz.getMethods()) {
			
			if(!method.getName().equals(methodName)) continue methodFinder;
			
			Class<?>[] params = method.getParameterTypes();
			
			if(params.length != argumentTypes.length) continue methodFinder;
			
			for(int i = 0; i < params.length; i++) {
				
				if(!(argumentTypes[i] == Null.class || MethodUtils.isAssignmentCompatible(params[i], argumentTypes[i]))) {
					continue methodFinder;
				}
			}
			
			return method;
		}
	
		return null;
	}

	@Override
	public Object modify(ExecutionContext context, AttributeModifier modifier) {
		return null; // Cannot modify a method call.
	}
	
	// Class which represents a null value.
	private class Null {}
}