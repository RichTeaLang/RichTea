package richTea.core.attribute;

import java.util.List;

import richTea.core.attribute.modifier.AttributeModifier;
import richTea.core.execution.ExecutionContext;
import richTea.core.resolver.ResolverUtils;

public class VariableAttribute extends PrimativeAttribute {
	
	public VariableAttribute(String name, List<String> lookupPath) {
		super(name, lookupPath);
	}
		
	@Override
	public Object getValue(ExecutionContext context) {
		Object value = getAttribute(context).getValue(context);
		
		return value;
	}
	
	protected Attribute getAttribute(ExecutionContext context) {
		@SuppressWarnings("unchecked")
		List<String> lookupPath = (List<String>) super.getValue(context);
		
		Attribute attribute = ResolverUtils.resolveAttributeFromScope(context.getCurrentScope(), lookupPath.get(0));
		
		for(int i = 1; i < lookupPath.size(); i++) {
			attribute = ResolverUtils.resolve(attribute.getValue(context), lookupPath.get(i));
		}
		
		return attribute;
	}
	
	@Override
	public Object modify(ExecutionContext context, AttributeModifier modifier) {
		Attribute attribute = getAttribute(context);
		
		return attribute.modify(context, modifier);
	}
}