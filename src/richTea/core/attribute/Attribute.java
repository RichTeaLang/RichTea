package richTea.core.attribute;

import richTea.core.attribute.modifier.AttributeModifier;
import richTea.core.execution.ExecutionContext;

public interface Attribute {
	
	public String getName();
	public void setName(String name);
		
	public Object getValue();
	public Object getValue(ExecutionContext context);
	public Object modify(ExecutionContext context, AttributeModifier modifier);
}