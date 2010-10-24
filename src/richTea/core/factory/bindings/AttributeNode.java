package richTea.core.factory.bindings;

import richTea.core.attribute.Attribute;
import richTea.core.attribute.AttributeSet;
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
	
	public Resolver getContext() {
		return getResolver();
	}
	
	public void setContext(Resolver context) {
		setResolver(context);
	}
	
	@Override 
	public Attribute clone() {
		AttributeNode clone = new AttributeNode();
		AttributeSet cloneAttributes = clone.getAttributes();
	
		for(Attribute attribute : getAttributes().clone().getAttributes()) {
			cloneAttributes.setAttribute(attribute);
		}
		
		return clone;
	}
}