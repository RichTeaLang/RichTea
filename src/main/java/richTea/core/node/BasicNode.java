package richTea.core.node;

import richTea.core.attribute.AttributeSet;
import richTea.core.factory.bindings.Binding;

public class BasicNode extends AttributeSet {
		
	private Binding binding;
		
	public Binding getBinding() {
		return binding;
	}
	
	public void setBinding(Binding binding) {
		this.binding = binding;
	}
}