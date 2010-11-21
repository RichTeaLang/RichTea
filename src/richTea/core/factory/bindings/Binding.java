package richTea.core.factory.bindings;

import richTea.core.attribute.Attribute;
import richTea.core.attribute.AttributeSet;
import richTea.core.attribute.StringAttribute;
import richTea.core.node.Branch;
import richTea.core.node.DataNode;
import richTea.core.node.TreeNode;

public class Binding extends DataNode {
	
	private AttributeSet defaultAttributes;
	
	private Class<? extends TreeNode> nodeClass;

	public Binding() {
		defaultAttributes = new AttributeSet();
		defaultAttributes.setAttribute(new StringAttribute("nodeClass", TreeNode.class.getName()));
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public void initialize() {
		ClassLoader classLoader = ClassLoader.getSystemClassLoader();
		
		String nodeClassName = getNodeClassName();
		
		try {
			nodeClass = (Class<? extends TreeNode>) classLoader.loadClass(nodeClassName);
		} catch (ClassNotFoundException e) {
			log.error(String.format("Could not find class %s for binding %s", nodeClassName, getBindingName()), e);
		}
	}
	
	public String getBindingName() {
		return resolver.getString("name");
	}
	
	protected void setBindingName(String name) {
		setValue("name", name);
	}
	
	public String getNodeClassName() {
		return resolver.getString("nodeClass");
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
		return resolver.getString("implicitAttributeName");
	}
	
	public String getImplicitBranchName() {
		return resolver.getString("implicitBranchName");
	}
	
	@Override
	public boolean addBranch(Branch branch) {
		boolean added = super.addBranch(branch);
		
		if(added && branch.getName().equalsIgnoreCase("attributes")) {
			for(TreeNode child : branch.getChildren()) {
				if(child instanceof Attribute) {
					getDefaultAttributes().setAttribute((Attribute) child);
				}
			}
		}
		
		return added;
	}
	
	@Override 
	public String toString() {
		return String.format("Binding [name:%s, class:%s]", getBindingName(), getNodeClass());
	}
}