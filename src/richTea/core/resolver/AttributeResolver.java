package richTea.core.resolver;

import richTea.core.attribute.Attribute;
import richTea.core.attribute.AttributeSet;

public class AttributeResolver<T extends AttributeSet> extends AbstractResolver {
	
	private T context;
	
	public T getContext() {
		return context;
	}
	
	public void setContext(T context) {
		this.context = context;
	}

	public Object getValue(String attributeName) {
		Attribute attribute = getContext().getAttribute(attributeName);
		
		return attribute != null ? attribute.getValue(null) : null;
	}
}