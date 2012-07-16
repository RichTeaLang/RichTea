package richTea.core.attribute.variable;

import java.lang.reflect.Method;

import richTea.core.attribute.Attribute;
import richTea.core.attribute.modifier.AttributeModifier;
import richTea.core.execution.ExecutionContext;

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
	public Object getValue(ExecutionContext context) {
		Object object = getLookupChain().getValue(context);
		
		Attribute[] arguments = getMethodArguments();
		
		Object[] argumentValues = new Object[arguments.length];
		Class<?>[] argumentTypes = new Class<?>[arguments.length];
		
		for(int i = 0; i < arguments.length; i++) {
			Object value = arguments[i].getValue(context);
			
			argumentValues[i] = value;
			argumentTypes[i] = value.getClass();
		}

		try {
			Method method = object.getClass().getMethod(getMethodName(), argumentTypes);
			
			return method.invoke(object, argumentValues);
		} catch (Exception e) {
			throw new IllegalArgumentException(String.format("Cannot invoke method %s: %s", getMethodName(), e.getMessage()), e);
		}
	}

	@Override
	public Object modify(ExecutionContext context, AttributeModifier modifier) {
		return null; // Cannot modify a method call.
	}
}
