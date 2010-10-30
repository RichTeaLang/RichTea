package richTea.core.resolver;

import richTea.core.factory.bindings.Binding;
import richTea.core.node.BasicNode;

public class BasicNodeResolver extends AttributeResolver {
	
	public BasicNodeResolver(BasicNode owner) {
		super(owner);
	}
	
	@Override
	public BasicNode getContext() {
		return (BasicNode) super.getContext();
	}

	@Override
	public Object getValue(String attributeName) {
		Object value = super.getValue(attributeName);
		
		if(value == null) {
			BasicNode owner = getContext();
			Binding binding = owner.getBinding();
			
			if(binding != null) {				
				value = binding.getDefaultAttributeValue(attributeName);
			}
		}
		
		return value;
	}
}