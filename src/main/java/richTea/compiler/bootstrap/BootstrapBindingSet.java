package richTea.compiler.bootstrap;

import richTea.runtime.functions.Eval;
import richTea.runtime.functions.Import;
import richTea.runtime.functions.Return;
import richTea.runtime.functions.Scope;
import richTea.runtime.node.Branch;
import richTea.runtime.node.TreeNode;

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
	
	protected BindingNode createAttributeBinding() {
		BootstrapBinding binding = new BootstrapBinding("Attribute", AttributeNode.class);
		
		binding.setImplicitAttributeName("name");
		
		return binding;
	}
	
	protected BindingNode createBindingsBinding() {
		BindingNode binding = new BootstrapBinding("Bindings", BindingSet.class);
		
		binding.setImplicitBranchName("bindings");
		
		return binding;
	}
	
	protected BindingNode createBranchBinding() {
		BindingNode binding = new BootstrapBinding("Branch");
		
		binding.setImplicitAttributeName("name");
		
		return binding;
	}
	
	protected BindingNode createEvalBinding() {
		BindingNode binding = new BootstrapBinding("Eval", TreeNode.class, Eval.class);
		
		binding.setImplicitAttributeName("source");
		
		return binding;
	}
	
	protected BindingNode createFunctionBinding() {
		BindingNode binding = new BootstrapBinding("Function", BindingNode.class);
		
		binding.setImplicitAttributeName("name");
		binding.setImplicitBranchName("attributes");
		
		return binding;
	}
	
	protected BindingNode createImportBinding() {
		BindingNode binding = new BootstrapBinding("Import", ImportNode.class, Import.class);
		
		binding.setImplicitAttributeName(ImportNode.FUNCTIONS_ATTRIBUTE_NAME);
		binding.setImplicitBranchName(ImportNode.REBINDING_BRANCH_NAME);
		
		return binding;
	}
	
	protected BindingNode createReturnBinding() {
		BindingNode binding = new BootstrapBinding("Return", TreeNode.class, Return.class);
		
		binding.setImplicitAttributeName("value");
		
		return binding;
	}
	
	protected BindingNode createScopeBinding() {
		BindingNode binding = new BootstrapBinding("Scope", TreeNode.class, Scope.class);
		
		binding.setImplicitAttributeName("if");
		binding.setImplicitBranchName("do");
		
		return binding;
	}
}
