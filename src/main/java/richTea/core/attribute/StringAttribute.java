package richTea.core.attribute;

import richTea.core.execution.ExecutionContext;

public class StringAttribute extends PrimativeAttribute {

	public StringAttribute(String name, String value) {
		super(name, value);
	}
	
	@Override
	public String getValue(ExecutionContext context) {
		return (String) super.getValue(context);
	}
}