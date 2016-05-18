package richTea.impl;

import richTea.attribute.Attribute;
import richTea.attribute.PrimativeAttribute;
import richTea.attribute.modifier.AttributeModifier;
import richTea.execution.ExecutionContext;
import richTea.node.DataNode;

public class AttributeNode extends DataNode implements Attribute {
	
	public String getName() {
		return resolver.getString("name");
	}
	
	public void setName(String name) {
		setAttribute(new PrimativeAttribute("name", name));
	}
		
	public Object getValue(ExecutionContext context) {
		return resolver.getValue("defaultValue");
	}
	
	@Override
	public Object modify(ExecutionContext context, AttributeModifier modifier) {
		Attribute attribute = getAttribute("defaultValue");
		
		return attribute != null ? attribute.modify(context, modifier) : null;
	}
}