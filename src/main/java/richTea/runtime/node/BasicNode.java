package richTea.runtime.node;

import richTea.compiler.bootstrap.BindingNode;
import richTea.runtime.attribute.AttributeSet;

public class BasicNode extends AttributeSet {
	
	private BindingNode binding;
	
	public BindingNode getBinding() {
		return binding;
	}
	
	public void setBinding(BindingNode binding) {
		this.binding = binding;
	}
}