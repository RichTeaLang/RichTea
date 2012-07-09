package richTea.core.attribute;

import java.util.List;

import richTea.core.attribute.modifier.AttributeModifier;
import richTea.core.execution.ExecutionContext;
import richTea.core.execution.VariableScope;

public class VariableAttribute extends PrimativeAttribute {
	
	public VariableAttribute(String name, List<String> lookupPath) {
		super(name, lookupPath);
	}
		
	@Override
	public Object getValue(ExecutionContext context) {
		Attribute attribute = getAttribute(context);
		
		return attribute != null ? attribute.getValue(context) : null;
	}
	
	protected Attribute getAttribute(ExecutionContext context) {
		@SuppressWarnings("unchecked")
		List<String> lookupPath = (List<String>) super.getValue(context);
		
		VariableScope scope = context.getCurrentScope();
		Attribute attribute = null;
		
		while(scope != null) {
			attribute = scope.getAttribute(lookupPath.get(0));
			
			if(attribute != null && attribute != this) {
				break;
			}else {
				scope = scope.getParent();
			}
		}
		
		return attribute;
	}
	
	@Override
	public Object modify(ExecutionContext context, AttributeModifier modifier) {
		Attribute attribute = getAttribute(context);
		
		return attribute.modify(context, modifier);
	}
}