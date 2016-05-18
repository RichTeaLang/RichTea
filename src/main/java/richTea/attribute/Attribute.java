package richTea.attribute;

import richTea.attribute.modifier.AttributeModifier;
import richTea.execution.ExecutionContext;

public interface Attribute {
	
	public String getName();
	public void setName(String name);
		
	public Object getValue(ExecutionContext context);
	public Object modify(ExecutionContext context, AttributeModifier modifier);
}