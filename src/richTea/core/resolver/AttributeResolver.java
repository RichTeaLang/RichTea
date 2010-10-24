package richTea.core.resolver;

import richTea.core.attribute.Attribute;
import richTea.core.node.AttributeContainerNode;

public class AttributeResolver implements Resolver {
		
	private AttributeContainerNode owner;
	
	public AttributeResolver(AttributeContainerNode owner) {
		this.owner = owner;
	}
	
	public AttributeContainerNode getOwner() {
		return owner;
	}

	public Object getValue(String attributeName) {
		Attribute attribute = getOwner().getAttributes().getAttribute(attributeName);
		
		return attribute != null ? attribute.getValue() : null;
	}
}