package richTea.core.factory.bindings;

import richTea.core.node.Branch;
import richTea.core.node.TreeNode;
import richTea.impl.Eval;
import richTea.impl.Import;
import richTea.impl.Scope;

public class BootstrapBindingSet extends BindingSet {
	
	public BootstrapBindingSet() {
		Branch bindings = new Branch("bindings");
		
		bindings.addChild(createAttributeBinding());
		bindings.addChild(createBindingsBinding());
		bindings.addChild(createBranchBinding());
		bindings.addChild(createEvalBinding());
		bindings.addChild(createFunctionBinding());
		bindings.addChild(createImportBinding());
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
		Binding binding = new BootstrapBinding("Eval", TreeNode.class, Eval.class);
		
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
		Binding binding = new BootstrapBinding("Import", ImportNode.class, Import.class);
		
		binding.setImplicitAttributeName(ImportNode.FUNCTIONS_ATTRIBUTE_NAME);
		binding.setImplicitBranchName(ImportNode.REBINDING_BRANCH_NAME);
		
		return binding;
	}
	
	protected Binding createScopeBinding() {
		Binding binding = new BootstrapBinding("Scope", TreeNode.class, Scope.class);
		
		binding.setImplicitAttributeName("if");
		binding.setImplicitBranchName("do");
		
		return binding;
	}
}
