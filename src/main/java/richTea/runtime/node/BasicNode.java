package richTea.runtime.node;

import richTea.compiler.bootstrap.Binding;
import richTea.runtime.attribute.AttributeSet;

public class BasicNode extends AttributeSet {
	
	private Binding binding;
	
	public Binding getBinding() {
		return binding;
	}
	
	public void setBinding(Binding binding) {
		this.binding = binding;
	}
}