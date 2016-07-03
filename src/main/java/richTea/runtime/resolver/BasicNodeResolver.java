package richTea.runtime.resolver;

import richTea.compiler.bootstrap.Binding;
import richTea.runtime.node.BasicNode;

public class BasicNodeResolver<T extends BasicNode> extends AttributeResolver<T> {
	
	@Override
	public Object getValue(String attributeName) {
		Object value = super.getValue(attributeName);
		
		if(value == null) {
			Binding binding = getContext().getBinding();
			
			if(binding != null) {
				value = binding.getDefinition().getDefaultAttributeValue(attributeName);
			}
		}
		
		return value;
	}
}