package richTea.core.factory;

import java.util.List;

import org.apache.log4j.Logger;

import richTea.antlr.tree.AttributeData;
import richTea.antlr.tree.NodeData;
import richTea.core.attribute.Attribute;
import richTea.core.attribute.AttributeSet;
import richTea.core.factory.bindings.Binding;
import richTea.core.factory.bindings.BindingSet;
import richTea.core.node.TreeNode;

public class RichTeaNodeFactory {
	
	private Logger log;
	
	private BindingSet bindings;
	
	private RichTeaAttributeFactory attributeFactory;

	public RichTeaNodeFactory(BindingSet bindings) {
		this.log = Logger.getLogger(getClass());
		this.bindings = bindings;
		this.attributeFactory = new RichTeaAttributeFactory(this);
	}
	
	public BindingSet getBindings() {
		return bindings;
	}
	
	public TreeNode create(NodeData nodeData) {
		TreeNode node = null;
		
		Binding binding = getNodeBinding(nodeData);
		
		if(binding != null) {
			try {
				Class<? extends TreeNode> nodeClass = getNodeClass(binding);

				node = instanciateNodeFromClass(nodeClass);
				
				setBindingOnNode(node, binding);
				
				buildAttributes(node, nodeData);
				
				buildChildren(node, nodeData);
				
			} catch(ClassNotFoundException exception) {
				log.error(String.format("Unable to find specified node class %s", binding.getFullyQualifiedClassName()));
			}catch(ClassCastException exception) {
				log.error(String.format("Specified class for '%s' does not implement %s", binding.getBindingName(), TreeNode.class.getName()), exception);
			}catch(InstantiationException exception) {
				log.error(String.format("Unable to create instance of %s", binding.getFullyQualifiedClassName(), exception));
			}catch(IllegalAccessException exception) {
				log.error(String.format("Unable to access constructor for %s", binding.getFullyQualifiedClassName()), exception);
			}
		}
		
		return node;
	}
	
	protected Binding getNodeBinding(NodeData nodeData) {
		return getBindings().getBinding(nodeData.getName().toLowerCase());
	}
	
	protected Class<? extends TreeNode> getNodeClass(Binding binding) throws ClassNotFoundException, ClassCastException {
		String fullyQualifiedClassName = binding.getFullyQualifiedClassName();
		
		Class<?> nodeClass = ClassLoader.getSystemClassLoader().loadClass(fullyQualifiedClassName);
		
		return nodeClass.asSubclass(TreeNode.class);
	}
	
	protected TreeNode instanciateNodeFromClass(Class<? extends TreeNode> nodeClass) throws InstantiationException, IllegalAccessException {
		return nodeClass.newInstance();
	}
	
	protected void setBindingOnNode(TreeNode node, Binding binding) {
		node.setBinding(binding);
	}
	
	protected void buildAttributes(TreeNode node, NodeData functionData) {
		List<AttributeData> attributes = functionData.getAttributes();
		
		AttributeSet nodeAttributes = node.getAttributes();
		
		if(attributes != null) {
			for(AttributeData attributeData : attributes) {
				
				Attribute attribute = attributeFactory.create(attributeData);
						
				if(attribute != null) 
				{
					attribute.setContext(node);

					boolean isImplicitAttribute = attribute.getName().equalsIgnoreCase("implicitAttribute");
					
					if(isImplicitAttribute) {
						// Try rename the implictAttribute only if we haven't already set an attribute with the explicit name
						String implicitAttributeName = node.getBinding().getImplicitAttributeName();
						
						if(implicitAttributeName != null && !nodeAttributes.hasAttribute(implicitAttributeName)) {
							attribute.setName(implicitAttributeName); // Rename implicitAttribute to it's explicit name
							
							isImplicitAttribute = false;
						}
					}
					
					if(!isImplicitAttribute) {
						nodeAttributes.setAttribute(attribute);
					}
				}
			}
		}
	}
	
	protected void buildChildren(TreeNode node, NodeData nodeData) {
		List<NodeData> children = nodeData.getChildNodes();
		
		if(children != null) {
			for(NodeData child : children) {
				TreeNode childNode = create(child);
				
				if(childNode != null) node.addChild(childNode);
			}
		}
	}
}