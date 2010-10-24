package richTea.core.resolver;

import java.lang.reflect.Method;

import richTea.core.factory.bindings.Binding;
import richTea.core.node.BasicNode;

public class BasicNodeResolver extends AttributeResolver {
	
	public BasicNodeResolver(BasicNode owner) {
		super(owner);
	}
	
	@Override
	public BasicNode getOwner() {
		return (BasicNode) super.getOwner();
	}

	@Override
	public Object getValue(String attributeName) {
		Object value = super.getValue(attributeName);
		
		if(value == null) {
			BasicNode owner = getOwner();
			Binding binding = owner.getBinding();
			
			if(binding != null) {				
				value = binding.getDefaultAttributeValue(attributeName);
				
				if(value == null) {
					
					String methodName = "get" + attributeName;
					
					Method[] methods = owner.getClass().getMethods();
					
					for(Method method : methods) {
						if(method.getName().equalsIgnoreCase(methodName)) {
							try {
								value = method.invoke(owner);
								break;
							}catch (Exception e) {
								// This is a 'fall back and hope' method of resolving an attribute.  Swallow any errors
							}
						}
					}
				}
			}
		}
		
		return value;
	}
}