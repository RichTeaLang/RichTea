package richTea.runtime.attribute;

import richTea.runtime.attribute.modifier.AttributeModifier;
import richTea.runtime.execution.ExecutionContext;

public interface Attribute {
	
	public String getName();
	public void setName(String name);
		
	public Object getValue(ExecutionContext context);
	public Object modify(ExecutionContext context, AttributeModifier modifier);
}