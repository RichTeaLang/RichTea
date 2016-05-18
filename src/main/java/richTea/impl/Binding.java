package richTea.impl;

import richTea.attribute.Attribute;
import richTea.attribute.AttributeSet;
import richTea.execution.EmptyFunction;
import richTea.execution.RichTeaFunction;
import richTea.node.Branch;
import richTea.node.DataNode;
import richTea.node.TreeNode;

public class Binding extends DataNode {
	
	private static final String NODE_CLASS_ATTRIBUTE = "nodeClass";
	private static final String FUNCTION_CLASS_ATTRIBUTE = "functionClass";
	private static final String IMPLICIT_ATTRIBUTE_NAME_ATTRIBUTE = "implicitAttributeName";
	private static final String IMPLICIT_BRANCH_NAME_ATTRIBUTE = "implicitBranchName";
	
	private AttributeSet defaultAttributes;
	private Class<? extends TreeNode> nodeClass;
	private Class<? extends RichTeaFunction> functionClass;

	public Binding() {
		defaultAttributes = new AttributeSet();
		
		setNodeClassName(TreeNode.class.getName());
		setFunctionClassName(EmptyFunction.class.getName());
	}
	
	@Override
	public void initialize() throws ClassNotFoundException {
		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
		
		String nodeClassName = getNodeClassName();
		
		try {
			nodeClass = classLoader.loadClass(nodeClassName).asSubclass(TreeNode.class);
		} catch (ClassNotFoundException e) {
			String message = String.format("Could not find class %s for binding %s", nodeClassName, getName());
			throw new ClassNotFoundException(message, e);
		}
		
		String functionClassName = getFunctionClassName();
		
		try {
			functionClass = classLoader.loadClass(functionClassName).asSubclass(RichTeaFunction.class);
		} catch(ClassNotFoundException e) {
			String message = String.format("Cannot find class %s for binding %s", functionClassName, getName());
			throw new ClassNotFoundException(message, e);
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
	
	public RichTeaFunction createFunctionImplementation() throws InstantiationException, IllegalAccessException {
		try {
			return functionClass.newInstance();
		} catch (InstantiationException e) {
			String message = String.format("Unable in instantiate class %s for binding %s", getFunctionClassName(), getName());
			throw new InstantiationException(message);
		} catch (IllegalAccessException e) {
			String message = String.format("Unable in access constructor for class %s for binding %s", getFunctionClassName(), getName());
			throw new IllegalAccessException(message);
		}
	}
	
	public Object getDefaultAttributeValue(String attributeName) {
		Attribute attribute = getDefaultAttributes().getAttribute(attributeName);
		
		return attribute != null ? attribute.getValue(null) : null;
	}
	
	public AttributeSet getDefaultAttributes() { 
		return defaultAttributes;
	}
	
	public String getImplicitAttributeName() {
		return resolver.getString(IMPLICIT_ATTRIBUTE_NAME_ATTRIBUTE);
	}
	
	protected void setImplicitAttributeName(String name) {
		this.setValue(IMPLICIT_ATTRIBUTE_NAME_ATTRIBUTE, name);
	}
	
	public String getImplicitBranchName() {
		return resolver.getString(IMPLICIT_BRANCH_NAME_ATTRIBUTE);
	}
	
	protected void setImplicitBranchName(String name) {
		this.setValue(IMPLICIT_BRANCH_NAME_ATTRIBUTE, name);
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