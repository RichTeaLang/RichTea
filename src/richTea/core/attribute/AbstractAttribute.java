package richTea.core.attribute;

import richTea.core.attribute.modifier.AttributeModifier;
import richTea.core.resolver.Resolver;

public abstract class AbstractAttribute implements Attribute {
	
	private String name;
	
	private Resolver context;
	
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
	public Resolver getContext() {
		return context;
	}

	@Override
	public void setContext(Resolver context) {
		this.context = context;
	}
	
	@Override
	public abstract Object getValue();

	@Override
	public Object modify(AttributeModifier modifier) {
		return null;
	}
}