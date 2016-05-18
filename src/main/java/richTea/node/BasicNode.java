package richTea.node;

import richTea.attribute.AttributeSet;
import richTea.impl.Binding;

public class BasicNode extends AttributeSet {
		
	private Binding binding;
		
	public Binding getBinding() {
		return binding;
	}
	
	public void setBinding(Binding binding) {
		this.binding = binding;
	}
}