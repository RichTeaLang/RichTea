package richTea.core.node;

import richTea.core.factory.bindings.Binding;
import richTea.core.resolver.BasicNodeResolver;
import richTea.core.resolver.Resolver;

public class BasicNode extends AttributeContainerNode {
		
	private Binding binding;
	
	@Override
	protected Resolver createResolver() {
		return new BasicNodeResolver(this);
	}
	
	public Binding getBinding() {
		return binding;
	}
	
	public void setBinding(Binding binding) {
		this.binding = binding;
	}
}