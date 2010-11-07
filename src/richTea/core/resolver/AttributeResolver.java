package richTea.core.resolver;

import richTea.core.attribute.Attribute;
import richTea.core.node.AttributeContainerNode;

public class AttributeResolver extends AbstractResolver {
			
	public AttributeResolver(AttributeContainerNode owner) {
		super(owner);
	}
	
	@Override
	public AttributeContainerNode getContext() {
		return (AttributeContainerNode) super.getContext();
	}

	public Object getValue(String attributeName) {
		Attribute attribute = getContext().getAttributes().getAttribute(attributeName);
		
		return attribute != null ? attribute.getValue() : null;
	}

	@Override
	public Attribute getAttribute(String key) {
		return getContext().getAttribute(key);
	}
}