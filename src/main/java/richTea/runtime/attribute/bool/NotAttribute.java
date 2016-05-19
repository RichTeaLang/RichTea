package richTea.runtime.attribute.bool;

import richTea.runtime.attribute.AbstractAttribute;
import richTea.runtime.attribute.Attribute;
import richTea.runtime.execution.ExecutionContext;

public class NotAttribute extends AbstractAttribute {

	private Attribute initalValue;
	
	public NotAttribute(String name, Attribute initalValue) {
		super(name);
		
		this.initalValue = initalValue;
	}
	
	protected Attribute getInitialValue() {
		return initalValue;
	}
	
	@Override
	public Boolean getValue(ExecutionContext context) {
		Object value = getInitialValue().getValue(context);
		
		return !Boolean.parseBoolean(value.toString());
	}
}