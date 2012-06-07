package richTea.core.factory.bindings;

import richTea.core.execution.RichTeaFunction;

public class FunctionBinding extends Binding {
	
	private Class<? extends RichTeaFunction> functionClass;
	
	@Override
	public void initialize() {
		super.initialize();
		
		ClassLoader classLoader = ClassLoader.getSystemClassLoader();
		
		String functionClassName = getFunctionClassName();
		
		try {			
			functionClass = classLoader.loadClass(functionClassName).asSubclass(RichTeaFunction.class);
		} catch(ClassNotFoundException e) {
			log.error(String.format("Cannot find class %s for binding %s", functionClassName, getBindingName()), e);
		}
	}
	
	public String getFunctionClassName() {
		return resolver.getString("functionClass");
	}
	
	public RichTeaFunction createFunctionImplementation() {
		try {
			return functionClass.newInstance();
		} catch (InstantiationException e) {
			log.error(String.format("Unable in instantiate class %s for binding %s", getFunctionClassName(), getBindingName()), e);
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			log.error(String.format("Unable in access constructor for class %s for binding %s", getFunctionClassName(), getBindingName()), e);
		}
		
		return null;
	}
}