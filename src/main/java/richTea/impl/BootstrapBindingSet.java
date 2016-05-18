package richTea.impl;

import richTea.node.Branch;
import richTea.node.TreeNode;

public class BootstrapBindingSet extends BindingSet {
	
	public BootstrapBindingSet() {
		Branch bindings = new Branch("bindings");
		
		bindings.addChild(createAttributeBinding());
		bindings.addChild(createBindingsBinding());
		bindings.addChild(createBranchBinding());
		bindings.addChild(createEvalBinding());
		bindings.addChild(createFunctionBinding());
		bindings.addChild(createImportBinding());
		bindings.addChild(createReturnBinding());
		bindings.addChild(createScopeBinding());
		
		setBranch(bindings);
	}
	
	protected Binding createAttributeBinding() {
		Binding binding = new BootstrapBinding("Attribute", AttributeNode.class);
		
		binding.setImplicitAttributeName("name");
		
		return binding;
	}
	
	protected Binding createBindingsBinding() {
		Binding binding = new BootstrapBinding("Bindings", BindingSet.class);
		
		binding.setImplicitBranchName("bindings");
		
		return binding;
	}
	
	protected Binding createBranchBinding() {
		Binding binding = new BootstrapBinding("Branch");
		
		binding.setImplicitAttributeName("name");
		
		return binding;
	}
	
	protected Binding createEvalBinding() {
		Binding binding = new BootstrapBinding("Eval", TreeNode.class, EvalFunction.class);
		
		binding.setImplicitAttributeName("source");
		
		return binding;
	}
	
	protected Binding createFunctionBinding() {
		Binding binding = new BootstrapBinding("Function", Binding.class);
		
		binding.setImplicitAttributeName("name");
		binding.setImplicitBranchName("attributes");
		
		return binding;
	}
	
	protected Binding createImportBinding() {
		Binding binding = new BootstrapBinding("Import", ImportNode.class, ImportFunction.class);
		
		binding.setImplicitAttributeName(ImportNode.FUNCTIONS_ATTRIBUTE_NAME);
		binding.setImplicitBranchName(ImportNode.REBINDING_BRANCH_NAME);
		
		return binding;
	}
	
	protected Binding createReturnBinding() {
		Binding binding = new BootstrapBinding("Return", TreeNode.class, ReturnFunction.class);
		
		binding.setImplicitAttributeName("value");
		
		return binding;
	}
	
	protected Binding createScopeBinding() {
		Binding binding = new BootstrapBinding("Scope", TreeNode.class, ScopeFunction.class);
		
		binding.setImplicitAttributeName("if");
		binding.setImplicitBranchName("do");
		
		return binding;
	}
}
