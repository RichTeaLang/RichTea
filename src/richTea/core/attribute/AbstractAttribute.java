package richTea.core.attribute;

import richTea.core.attribute.modifier.AttributeModifier;
import richTea.core.execution.ExecutionContext;

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
		return modifier.modify(this);
	}
	
	@Override
	public String toString() {
		return String.format("[%s(%s)] -> %s", getClass().getSimpleName(), getName(), getValue(null));
	}
}