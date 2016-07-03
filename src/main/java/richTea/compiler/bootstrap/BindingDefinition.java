package richTea.compiler.bootstrap;

import richTea.runtime.attribute.Attribute;
import richTea.runtime.attribute.AttributeSet;
import richTea.runtime.execution.EmptyFunction;
import richTea.runtime.execution.RichTeaFunction;
import richTea.runtime.node.Branch;
import richTea.runtime.node.DataNode;
import richTea.runtime.node.TreeNode;

public class BindingDefinition extends DataNode {
	private static final String NAME_ATTRIBUTE = "name";
	private static final String NODE_CLASS_ATTRIBUTE = "nodeClass";
	private static final String FUNCTION_CLASS_ATTRIBUTE = "functionClass";
	private static final String IMPLICIT_ATTRIBUTE_NAME_ATTRIBUTE = "implicitAttributeName";
	private static final String IMPLICIT_BRANCH_NAME_ATTRIBUTE = "implicitBranchName";
	
	private AttributeSet defaultAttributes;
	
	public BindingDefinition(String name, BindingDefinition definition) {
		this();
		
		for(Attribute attribute : definition.getAttributes()) {
			setAttribute(attribute);
		}
		
		for(Branch branch : definition.getBranches()) {
			setBranch(branch);
		}
		
		setName(name);
	}
	
	public BindingDefinition(String name, Class<? extends TreeNode> nodeClass, Class<? extends RichTeaFunction> functionClass) {
		this(name, nodeClass.getName(), functionClass.getName());
	}
	
	public BindingDefinition(String name, String nodeClassName, String functionClassName) {
		this();
		
		setName(name);
		setNodeClassName(nodeClassName);
		setFunctionClassName(functionClassName);
	}
	
	public BindingDefinition() {
		defaultAttributes = new AttributeSet();
		
		setNodeClassName(TreeNode.class.getName());
		setFunctionClassName(EmptyFunction.class.getName());
	}
	
	public String getName() {
		return resolver.getString(NAME_ATTRIBUTE);
	}
	
	protected void setName(String name) {
		setValue(NAME_ATTRIBUTE, name);
	}
	
	public String getNodeClassName() {
		return resolver.getString(NODE_CLASS_ATTRIBUTE);
	}
	
	protected void setNodeClassName(String className) {
		setValue(NODE_CLASS_ATTRIBUTE, className);
	}

	public String getFunctionClassName() {
		return resolver.getString(FUNCTION_CLASS_ATTRIBUTE);
	}
	
	protected void setFunctionClassName(String className) {
		setValue(FUNCTION_CLASS_ATTRIBUTE, className);
	}
	
	public String getImplicitAttributeName() {
		return resolver.getString(IMPLICIT_ATTRIBUTE_NAME_ATTRIBUTE);
	}
	
	protected void setImplicitAttributeName(String name) {
		setValue(IMPLICIT_ATTRIBUTE_NAME_ATTRIBUTE, name);
	}
	
	public String getImplicitBranchName() {
		return resolver.getString(IMPLICIT_BRANCH_NAME_ATTRIBUTE);
	}
	
	protected void setImplicitBranchName(String name) {
		setValue(IMPLICIT_BRANCH_NAME_ATTRIBUTE, name);
	}
	
	public Object getDefaultAttributeValue(String attributeName) {
		Attribute attribute = getDefaultAttributes().getAttribute(attributeName);
		
		return attribute != null ? attribute.getValue(null) : null;
	}
	
	public AttributeSet getDefaultAttributes() { 
		return defaultAttributes;
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
		return String.format("Binding definition [name:%s, nodeClass:%s, functionClass:%s]", getName(), getNodeClassName(), getFunctionClassName());
	}
}