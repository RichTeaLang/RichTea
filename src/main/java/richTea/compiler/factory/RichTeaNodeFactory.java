package richTea.compiler.factory;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

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
		
		return new Binding(name, getClass().getClassLoader(), definition);
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
		Set<String> attributeNames = new HashSet<>();
		
		for(AttributeData attributeData : attributes) {
			String attributeName = attributeData.getName();
			boolean isImplicitAttribute = attributeName.equalsIgnoreCase("implicitAttribute");
			
			if (isImplicitAttribute) {
				// Set the name of the implicit attribute
				attributeName = node.getBinding().getDefinition().getImplicitAttributeName();
			}
			
			if (attributeName == null || attributeName.length() == 0) {
				throw new IllegalArgumentException("Attribute name cannot be null or 0 length: " + attributeName);
			} else if (attributeNames.contains(attributeName)) {
				throw new IllegalArgumentException("Duplicate attribute name: " + attributeName);
			} else {
				Attribute attribute = attributeFactory.create(attributeName, attributeData.getValue());
				
				node.setAttribute(attribute);
				attributeNames.add(attribute.getName());
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
		String branchName = branchData.getName();
		Attribute guard = attributeFactory.create("guard", branchData.getGuard());
		List<Attribute> attributes = branchData.getAttributes().stream().map(attributeFactory::create).collect(Collectors.toList());
		boolean isImplicitBranch = branchName.equalsIgnoreCase("implicitBranch");
		
		if(isImplicitBranch) {
			// Rename implicitBranch to it's explicit name
			branchName = node.getBinding().getDefinition().getImplicitBranchName();
		}
		
		if (branchName == null || branchName.length() == 0) {
			throw new IllegalArgumentException("Branch name cannot be null or 0 length: " + branchName);
		}
		
		Branch branch = new Branch(branchName, guard, attributes);
		
		for(NodeData child : branchData.getChildren()) {
			TreeNode branchChild = create(child);
			
			if(branchChild != null) {
				branch.addChild(branchChild);
			}
		}
		
		node.setBranch(branch);
	}
	
	protected void setFunctionOnNode(TreeNode node, Binding binding) throws InstantiationException, IllegalAccessException {
		RichTeaFunction function = binding.getFunctionClass().newInstance();
		
		node.setFunction(function);
	}
}
