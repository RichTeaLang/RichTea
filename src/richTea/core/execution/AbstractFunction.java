package richTea.core.execution;

import richTea.core.attribute.Attribute;
import richTea.core.resolver.Resolver;

public abstract class AbstractFunction implements RichTeaFunction, Resolver {

	protected ExecutionContext context;
	
	abstract protected void run();
	
	public void execute(ExecutionContext context) {
		this.context = context;
		
		run();
		
		context = null;
	}
	
	public Object getValue(String attributeName) {
		return context.getValue(attributeName);
	}
	
	public Attribute getAttribute(String key) {
		return context.getAttribute(key);
	}
	
	public Object getValueOrDefault(String attributeName, Object defaultValue) {
		Object value = getValue(attributeName);
		
		return value != null ? value : defaultValue;
	}
	
	public String getString(String attributeName) {
		return getValue(attributeName).toString();
	}
	
	public Boolean getBoolean(String attributeName) {
		return Boolean.parseBoolean(getString(attributeName));
	}
	
	public Number getNumber(String attributeName) {
		return Double.parseDouble(getString(attributeName));
	}
}