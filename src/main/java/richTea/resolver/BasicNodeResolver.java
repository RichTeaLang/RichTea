package richTea.resolver;

import richTea.impl.Binding;
import richTea.node.BasicNode;

public class BasicNodeResolver<T extends BasicNode> extends AttributeResolver<T> {
		
	@Override
	public Object getValue(String attributeName) {
		Object value = super.getValue(attributeName);
		
		if(value == null) {
			Binding binding = getContext().getBinding();
			
			if(binding != null) {				
				value = binding.getDefaultAttributeValue(attributeName);
			}
		}
		
		return value;
	}
}