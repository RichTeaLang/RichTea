package richTea.compiler.factory;

import java.net.URLClassLoader;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import richTea.compiler.antlr.tree.AttributeData;
import richTea.compiler.antlr.tree.BranchData;
import richTea.compiler.antlr.tree.NodeData;
import richTea.compiler.bootstrap.Binding;
import richTea.compiler.bootstrap.BindingDefinition;
import richTea.compiler.bootstrap.BootstrapImportNode;
import richTea.compiler.bootstrap.ImportNode;
import richTea.runtime.attribute.Attribute;
import richTea.runtime.execution.RichTeaFunction;
import richTea.runtime.functions.CallFunctionReference;
import richTea.runtime.node.Branch;
import richTea.runtime.node.TreeNode;

public class RichTeaNodeFactory {
	private BootstrapImportNode bootstrapBindings;
	private Map<String, ImportNode> bindings; // Map of binding to ImportNode containing the binding
	private RichTeaAttributeFactory attributeFactory;

	public RichTeaNodeFactory() {
		bootstrapBindings = new BootstrapImportNode();
		bindings = new HashMap<>();
		attributeFactory = new RichTeaAttributeFactory(this);
	}
	
	public List<ImportNode> getImports() {
		List<ImportNode> imports = new ArrayList<>();
		
		for(ImportNode node : bindings.values()) {
			if (!imports.contains(node)) {
				imports.add(node);
			}
		}
		
		return imports;
	}
	
	public void registerImportNode(ImportNode node) {
		for(Binding binding : node.getImportedBindings().values()) {
			String bindingName = binding.getName();
			ImportNode existing = bindings.put(bindingName.toLowerCase(), node);
			
			if (existing == null) {
				continue;
			}
			
			Path existingPath = existing.getModulePath();
			Path newPath = node.getModulePath();
			String errorFormat = "Import conflict. \"%s\" is imported by %s and %s. Use \"importPrefix\" to avoid conflicts";
			
			throw new IllegalArgumentException(String.format(errorFormat, bindingName, existingPath, newPath));
		}
	}
	
	public RichTeaAttributeFactory getAttributeFactory() {
		return attributeFactory;
	}
	
	public TreeNode create(NodeData nodeData) {
		TreeNode node = null;
		Binding binding = getNodeBinding(nodeData);
		
		try {
			if(binding == null) {
				binding = createFunctionReferenceBinding(nodeData);
			}
			
			Class<? extends TreeNode> nodeClass = getNodeClass(binding);
			
			node = instanciateNodeFromClass(nodeClass);
			
			setBindingOnNode(node, binding);
			buildAttributes(node, nodeData);
			buildBranches(node, nodeData);
			setFunctionOnNode(node, binding);
			
			node.initialize();
			
			if (node instanceof ImportNode) {
				registerImportNode((ImportNode) node);
			}
		} catch (Exception e) {
			String message = String.format("Unable to create node %s", binding.getNodeClass().getName());
			
			throw new RuntimeException(message, e);
		}
		
		return node;
	}
	
	protected Binding getNodeBinding(NodeData nodeData) {
		String bindingName = nodeData.getName().toLowerCase();
		ImportNode node = bindings.get(bindingName);
		
		return node != null ? node.getImportedBinding(bindingName) : bootstrapBindings.getImportedBinding(bindingName);
	}
	
	protected Binding createFunctionReferenceBinding(NodeData nodeData) throws ClassNotFoundException {
		String name = nodeData.getName();
		BindingDefinition definition = new BindingDefinition(name, TreeNode.class, CallFunctionReference.class);
		
		return new Binding(name, (URLClassLoader) getClass().getClassLoader(), definition);
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
						
				if(attribute != null) {
					boolean isImplicitAttribute = attribute.getName().equalsIgnoreCase("implicitAttribute");
					
					if(isImplicitAttribute) {
						// Try rename the implictAttribute only if we haven't already set an attribute with the explicit name
						String implicitAttributeName = node.getBinding().getDefinition().getImplicitAttributeName();
						
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
			String implicitBranchName = node.getBinding().getDefinition().getImplicitBranchName();
			
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
	
	protected void setFunctionOnNode(TreeNode node, Binding binding) throws InstantiationException, IllegalAccessException {
		RichTeaFunction function = binding.getFunctionClass().newInstance();
		
		node.setFunction(function);
	}
}
