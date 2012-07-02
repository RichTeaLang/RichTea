package richTea.core.attribute;

import richTea.core.execution.ExecutionContext;

public class BooleanAttribute extends PrimativeAttribute {

	public BooleanAttribute(String name, Boolean value) {
		super(name, value);
	}
	
	@Override 
	public Boolean getValue(ExecutionContext context) {
		return (Boolean) super.getValue(context);
	}
}