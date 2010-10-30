package richTea.core.factory.bindings;

import richTea.core.attribute.Attribute;
import richTea.core.attribute.AttributeSet;
import richTea.core.attribute.StringAttribute;
import richTea.core.node.TreeNode;

public class Binding extends TreeNode {
	
	private AttributeSet defaultAttributes;
	
	private Class<? extends TreeNode> nodeClass;

	public Binding() {
		defaultAttributes = new AttributeSet();
		defaultAttributes.setAttribute(new StringAttribute("nodeClass", TreeNode.class.getName()));
	}
	
	@Override
	public void initialize() {
		ClassLoader classLoader = ClassLoader.getSystemClassLoader();
		
		String nodeClassName = getNodeClassName();
		
		try {
			nodeClass = classLoader.loadClass(nodeClassName).asSubclass(TreeNode.class);
		} catch (ClassNotFoundException e) {
			log.error(String.format("Could not find class %s for binding %s", nodeClassName, getBindingName()), e);
		}
	}
	
	public String getBindingName() {
		return getString("name");
	}
	
	protected void setBindingName(String name) {
		setValue("name", name);
	}
	
	public String getNodeClassName() {
		return getString("nodeClass");
	}
	
	protected void setNodeClassName(String nodeClassName) {
		setValue("nodeClass", nodeClassName);
	}
	
	public Class<? extends TreeNode> getNodeClass() {
		return nodeClass;
	}
	
	public Object getDefaultAttributeValue(String attributeName) {
		Attribute attribute = getDefaultAttributes().getAttribute(attributeName);
		
		return attribute != null ? attribute.getValue() : null;
	}
	
	public AttributeSet getDefaultAttributes() { 
		return defaultAttributes;
	}
	
	public String getImplicitAttributeName() {
		return getString("implicitAttributeName");
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
		return String.format("Binding [name:%s, class:%s]", getBindingName(), getNodeClass());
	}
}