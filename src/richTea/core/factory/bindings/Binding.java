package richTea.core.factory.bindings;

import richTea.core.attribute.Attribute;
import richTea.core.attribute.AttributeSet;
import richTea.core.node.TreeNode;

public class Binding extends TreeNode {
	
	private AttributeSet defaultAttributes;

	public Binding() {
		defaultAttributes = new AttributeSet();
	}
	
	public Binding(String name, String fullyQualifiedClassName) {
		this();
		
		setValue("name", name);
		setValue("class", fullyQualifiedClassName);
	}

	public String getBindingName() {
		return (String) getValue("name");
	}
	
	public String getFullyQualifiedClassName() {
		return (String) getValue("class");
	}
	
	public Object getDefaultAttributeValue(String attributeName) {
		Attribute attribute = getDefaultAttributes().getAttribute(attributeName);
		
		return attribute != null ? attribute.getValue() : null;
	}
	
	public AttributeSet getDefaultAttributes() { 
		return defaultAttributes;
	}
	
	public String getImplicitAttributeName() {
		return (String) getValue("implicitAttributeName");
	}
	
	@Override
	public boolean addChild(TreeNode child) {
		if((child instanceof Attribute) && super.addChild(child)) {
			getDefaultAttributes().setAttribute((Attribute) child);
		}
		
		return containsChild(child);
	}
	
	@Override 
	public String toString() {
		return String.format("Binding [name:%s, class:%s]", getBindingName(), getFullyQualifiedClassName());
	}
}