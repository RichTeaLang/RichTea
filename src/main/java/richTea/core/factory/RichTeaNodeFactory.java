package richTea.core.factory;

import java.util.List;

import org.apache.log4j.Logger;

import richTea.antlr.tree.AttributeData;
import richTea.antlr.tree.BranchData;
import richTea.antlr.tree.NodeData;
import richTea.core.attribute.Attribute;
import richTea.core.factory.bindings.Binding;
import richTea.core.factory.bindings.BindingSet;
import richTea.core.factory.bindings.BootstrapBinding;
import richTea.core.node.Branch;
import richTea.core.node.TreeNode;
import richTea.impl.functional.FunctionCall;

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
		
		if(binding == null) binding = createFunctionCallBinding(nodeData);

		try {
			Class<? extends TreeNode> nodeClass = getNodeClass(binding);

			node = instanciateNodeFromClass(nodeClass);
			
			setBindingOnNode(node, binding);
			
			buildAttributes(node, nodeData);
			
			buildBranches(node, nodeData);

			setFunctionOnNode(node, binding);
			
			node.initialize();
		}catch(InstantiationException exception) {
			log.error(String.format("Unable to create instance of %s", binding.getNodeClassName()), exception);
		}catch(IllegalAccessException exception) {
			log.error(String.format("Unable to access constructor for %s", binding.getNodeClassName()), exception);
		}
		
		return node;
	}
	
	protected Binding getNodeBinding(NodeData nodeData) {
		return getBindings().getBinding(nodeData.getName());
	}
	
	protected Binding createFunctionCallBinding(NodeData nodeData) {
		return new BootstrapBinding(nodeData.getName(), TreeNode.class, FunctionCall.class);
	}
	
	protected Class<? extends TreeNode> getNodeClass(Binding binding) {
		return binding.getNodeClass();
	}
	
	protected TreeNode instanciateNodeFromClass(Class<? extends TreeNode> nodeClass) throws InstantiationException, IllegalAccessException {
		return nodeClass.newInstance();
	}
	
	protected void setBindingOnNode(TreeNode node, Binding binding) {
		node.setBinding(binding);
	}
	
	protected void buildAttributes(TreeNode node, NodeData functionData) {
		List<AttributeData> attributes = functionData.getAttributes();
		
		if(attributes != null) {
			for(AttributeData attributeData : attributes) {
				
				Attribute attribute = attributeFactory.create(attributeData);
						
				if(attribute != null) 
				{
					boolean isImplicitAttribute = attribute.getName().equalsIgnoreCase("implicitAttribute");
					
					if(isImplicitAttribute) {
						// Try rename the implictAttribute only if we haven't already set an attribute with the explicit name
						String implicitAttributeName = node.getBinding().getImplicitAttributeName();
						
						if(implicitAttributeName != null && !node.hasAttribute(implicitAttributeName)) {
							attribute.setName(implicitAttributeName); // Rename implicitAttribute to it's explicit name
							
							isImplicitAttribute = false;
						}
					}
					
					if(!isImplicitAttribute) {
						node.setAttribute(attribute);
					}
				}
			}
		}
	}
	
	protected void buildBranches(TreeNode node, NodeData nodeData) {
		List<BranchData> branches = nodeData.getBranches();
		
		if(branches != null) {
			for(BranchData branch : branches) {
				buildBranch(node, branch);
			}
		}
	}
	
	protected void buildBranch(TreeNode node, BranchData branchData) {	
		Branch branch = new Branch(branchData.getName());
		
		boolean isImplicitBranch = branch.getName().equalsIgnoreCase("implicitBranch");
		
		if(isImplicitBranch) {
			// Try rename the implictBranch only if we haven't already set an branch with the explicit name
			String implicitBranchName = node.getBinding().getImplicitBranchName();
			
			if(implicitBranchName != null && !node.hasBranch(implicitBranchName)) {
				branch.setName(implicitBranchName); // Rename implicitBranch to it's explicit name
				
				isImplicitBranch = false;
			}
		}
				
		if(!isImplicitBranch) {
			List<NodeData> children = branchData.getChildren();
			
			if(children != null) {
				for(NodeData child : branchData.getChildren()) {
					TreeNode branchChild = create(child);
					
					if(branchChild != null) {
						branch.addChild(branchChild);
					}
				}
			}
			
			node.setBranch(branch);
		}
	}
	
	protected void setFunctionOnNode(TreeNode node, Binding binding) {
		node.setFunction(binding.createFunctionImplementation());
	}
}