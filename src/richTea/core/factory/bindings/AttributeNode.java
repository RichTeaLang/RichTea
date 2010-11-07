package richTea.core.factory.bindings;

import richTea.core.attribute.Attribute;
import richTea.core.attribute.modifier.AttributeModifier;
import richTea.core.node.TreeNode;
import richTea.core.resolver.Resolver;

public class AttributeNode extends TreeNode implements Attribute {
	
	public String getName() {
		return (String) getValue("name");
	}
	
	public void setName(String name) {
		setValue("name", name);
	}
	
	public Object getValue() {
		return getValue("defaultValue");
	}
	
	@Override
	public Object modify(AttributeModifier modifier) {
		Attribute attribute = getAttributes().getAttribute("defaultValue");
		
		return attribute != null ? attribute.modify(modifier) : null;
	}
	
	public Resolver getContext() {
		return getResolver();
	}
	
	public void setContext(Resolver context) {
		setResolver(context);
	}
}