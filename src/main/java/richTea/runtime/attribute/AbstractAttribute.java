package richTea.runtime.attribute;

import richTea.runtime.attribute.modifier.AttributeModifier;
import richTea.runtime.execution.ExecutionContext;

public abstract class AbstractAttribute implements Attribute {
	
	private String name;
	
	public AbstractAttribute(String name) {
		setName(name);
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public Object modify(ExecutionContext context, AttributeModifier modifier) {
		return modifier.modify(getValue(context));
	}
	
	@Override
	public String toString() {
		return String.format("%s(%s)", getClass().getSimpleName(), getName());
	}
}