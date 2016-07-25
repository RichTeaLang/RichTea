package richTea.runtime.attribute.variable;

import richTea.runtime.attribute.AbstractAttribute;
import richTea.runtime.attribute.modifier.AttributeModifier;
import richTea.runtime.execution.ExecutionContext;
import richTea.runtime.execution.VariableScope;

public class LookupChainRoot extends AbstractAttribute {
	private boolean isThis;
	
	public LookupChainRoot(String name, boolean isThis) {
		super(name);
		
		this.isThis = isThis;
	}
	
	@Override
	public Object modify(ExecutionContext context, AttributeModifier modifier) {
		throw new UnsupportedOperationException("Cannot modify variable root");
	}

	@Override
	public Object getValue(ExecutionContext context) {
		VariableScope scope = context.getCurrentScope();
		
		return isThis ? scope : scope.getParent();
	}
}