package richTea.core.factory.bindings;

import richTea.core.execution.RichTeaFunction;

public class FunctionBinding extends Binding {
	
	private RichTeaFunction functionImplementation;
	
	@Override
	public void initialize() {
		super.initialize();
		
		ClassLoader classLoader = ClassLoader.getSystemClassLoader();
		
		String functionClassName = getFunctionClassName();
		
		try {			
			Class<? extends RichTeaFunction> functionClass = 
				classLoader.loadClass(functionClassName).asSubclass(RichTeaFunction.class);
			
			functionImplementation = functionClass.newInstance();
			
		} catch(ClassNotFoundException e) {
			log.error(String.format("Cannot find class %s for binding %s", functionClassName, getBindingName()), e);
		} catch (InstantiationException e) {
			log.error(String.format("Unable in instantiate class %s for binding %s", functionClassName, getBindingName()), e);
		} catch (IllegalAccessException e) {
			log.error(String.format("Unable in access constructor for class %s for binding %s", functionClassName, getBindingName()), e);
			e.printStackTrace();
		}
	}
	
	public String getFunctionClassName() {
		return getString("functionClass");
	}
	
	public RichTeaFunction getFunctionImplementation() {
		return functionImplementation;
	}
}