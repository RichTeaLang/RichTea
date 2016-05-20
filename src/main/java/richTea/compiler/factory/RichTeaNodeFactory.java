package richTea.compiler.factory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import richTea.compiler.antlr.tree.AttributeData;
import richTea.compiler.antlr.tree.BranchData;
import richTea.compiler.antlr.tree.NodeData;
import richTea.compiler.bootstrap.BindingNode;
import richTea.compiler.bootstrap.BindingSet;
import richTea.compiler.bootstrap.BootstrapBinding;
import richTea.compiler.bootstrap.ImportNode;
import richTea.runtime.attribute.Attribute;
import richTea.runtime.functions.CallFunctionReference;
import richTea.runtime.node.Branch;
import richTea.runtime.node.TreeNode;

public class RichTeaNodeFactory {
	private List<BindingSet> bindingSets;
	
	private RichTeaAttributeFactory attributeFactory;

	public RichTeaNodeFactory(BindingSet[] bindingSets) {
		this.bindingSets = new ArrayList<BindingSet>(Arrays.asList(bindingSets));
		this.attributeFactory = new RichTeaAttributeFactory(this);
	}
	
	public BindingSet[] getBindingSets() {
		return bindingSets.toArray(new BindingSet[bindingSets.size()]);
	}
	
	public RichTeaAttributeFactory getAttributeFactory() {
		return attributeFactory;
	}
	
	public TreeNode create(NodeData nodeData) {
		TreeNode node = null;
		
		BindingNode binding = getNodeBinding(nodeData);
		
		if(binding == null) binding = createFunctionReferenceBinding(nodeData);

		try {
			Class<? extends TreeNode> nodeClass = getNodeClass(binding);

			node = instanciateNodeFromClass(nodeClass);
			
			setBindingOnNode(node, binding);
			buildAttributes(node, nodeData);
			buildBranches(node, nodeData);
			setFunctionOnNode(node, binding);
			
			node.initialize();
			
			if (node instanceof ImportNode) {
				bindingSets.add(((ImportNode) node).getImportedBindings());
			}
		} catch (Exception e) {
			String message = String.format("Unable to create node %s", binding.getNodeClassName());
			
			throw new RuntimeException(message, e);
		}
		
		return node;
	}
	
	protected BindingNode getNodeBinding(NodeData nodeData) {
		BindingNode binding = null;
		
		for(BindingSet bindingSet : bindingSets) {
			binding = bindingSet.getBinding(nodeData.getName());
			
			if (binding != null) {
				break;
			}
		}
		
		return binding;
	}
	
	protected BindingNode createFunctionReferenceBinding(NodeData nodeData) {
		return new BootstrapBinding(nodeData.getName(), TreeNode.class, CallFunctionReference.class);
	}
	
	protected Class<? extends TreeNode> getNodeClass(BindingNode binding) {
		return binding.getNodeClass();
	}
	
	protected TreeNode instanciateNodeFromClass(Class<? extends TreeNode> nodeClass) throws InstantiationException, IllegalAccessException {
		return nodeClass.newInstance();
	}
	
	protected void setBindingOnNode(TreeNode node, BindingNode binding) {
		node.setBinding(binding);
	}
	
	protected void buildAttributes(TreeNode node, NodeData functionData) {
		List<AttributeData> attributes = functionData.getAttributes();
		
		if(attributes != null) {
			for(AttributeData attributeData : attributes) {
				
				Attribute attribute = attributeFactory.create(attributeData);
						
				if(attribute != null) {
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
	
	protected void setFunctionOnNode(TreeNode node, BindingNode binding) throws InstantiationException, IllegalAccessException {
		node.setFunction(binding.createFunctionImplementation());
	}
}