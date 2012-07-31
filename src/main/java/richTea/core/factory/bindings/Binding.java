package richTea.core.factory.bindings;

import richTea.core.attribute.Attribute;
import richTea.core.attribute.AttributeSet;
import richTea.core.execution.EmptyFunction;
import richTea.core.execution.RichTeaFunction;
import richTea.core.node.Branch;
import richTea.core.node.DataNode;
import richTea.core.node.TreeNode;

public class Binding extends DataNode {
	
	private static final String NODE_CLASS_ATTRIBUTE = "nodeClass";
	private static final String FUNCTION_CLASS_ATTRIBUTE = "functionClass";
	
	private AttributeSet defaultAttributes;

	private Class<? extends TreeNode> nodeClass;
	private Class<? extends RichTeaFunction> functionClass;

	public Binding() {
		defaultAttributes = new AttributeSet();
		
		setNodeClassName(TreeNode.class.getName());
		setFunctionClassName(EmptyFunction.class.getName());
	}
	
	@Override
	public void initialize() {
		ClassLoader classLoader = ClassLoader.getSystemClassLoader();
		
		String nodeClassName = getNodeClassName();
		
		try {
			nodeClass = classLoader.loadClass(nodeClassName).asSubclass(TreeNode.class);
		} catch (ClassNotFoundException e) {
			log.error(String.format("Could not find class %s for binding %s", nodeClassName, getName()), e);
		}
		
		String functionClassName = getFunctionClassName();
		
		try {			
			functionClass = classLoader.loadClass(functionClassName).asSubclass(RichTeaFunction.class);
		} catch(ClassNotFoundException e) {
			log.error(String.format("Cannot find class %s for binding %s", functionClassName, getName()), e);
		}
	}
	
	public String getName() {
		return resolver.getString("name");
	}
	
	protected void setName(String name) {
		setValue("name", name);
	}
	
	public String getNodeClassName() {
		return resolver.getString(NODE_CLASS_ATTRIBUTE);
	}
	
	protected void setNodeClassName(String nodeClassName) {
		setValue(NODE_CLASS_ATTRIBUTE, nodeClassName);
	}
	
	public Class<? extends TreeNode> getNodeClass() {
		return nodeClass;
	}
	
	public String getFunctionClassName() {
		return resolver.getString(FUNCTION_CLASS_ATTRIBUTE);
	}
	
	protected void setFunctionClassName(String functionClassName) {
		setValue(FUNCTION_CLASS_ATTRIBUTE, functionClassName);
	}
	
	public RichTeaFunction createFunctionImplementation() {
		try {
			return functionClass.newInstance();
		} catch (InstantiationException e) {
			log.error(String.format("Unable in instantiate class %s for binding %s", getFunctionClassName(), getName()), e);
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			log.error(String.format("Unable in access constructor for class %s for binding %s", getFunctionClassName(), getName()), e);
		}
		
		return null;
	}
	
	public Object getDefaultAttributeValue(String attributeName) {
		Attribute attribute = getDefaultAttributes().getAttribute(attributeName);
		
		return attribute != null ? attribute.getValue(null) : null;
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
	public void setBranch(Branch branch) {
		super.setBranch(branch);
		
		if(branch.getName().equalsIgnoreCase("attributes")) {
			for(TreeNode child : branch.getChildren()) {
				if(child instanceof Attribute) {
					getDefaultAttributes().setAttribute((Attribute) child);
				}
			}
		}
	}
	
	@Override 
	public String toString() {
		return String.format("Binding [name:%s, class:%s]", getName(), getNodeClass());
	}
}