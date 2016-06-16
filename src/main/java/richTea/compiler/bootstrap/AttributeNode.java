package richTea.compiler.bootstrap;

import richTea.runtime.attribute.Attribute;
import richTea.runtime.attribute.PrimativeAttribute;
import richTea.runtime.attribute.modifier.AttributeModifier;
import richTea.runtime.execution.ExecutionContext;
import richTea.runtime.node.DataNode;

public class AttributeNode extends DataNode implements Attribute {
	
	public String getName() {
		return resolver.getString("name");
	}
	
	public void setName(String name) {
		setAttribute(new PrimativeAttribute("name", name));
	}
		
	public Object getValue(ExecutionContext context) {
		Attribute attribute = getAttribute("defaultValue");
		
		return attribute != null ? attribute.getValue(context) : null;
	}
	
	@Override
	public Object modify(ExecutionContext context, AttributeModifier modifier) {
		Attribute attribute = getAttribute("defaultValue");
		
		return attribute != null ? attribute.modify(context, modifier) : null;
	}
}