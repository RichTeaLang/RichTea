package richTea.impl;

import richTea.core.attribute.Attribute;
import richTea.core.attribute.modifier.SetModifier;
import richTea.core.execution.AbstractFunction;

public class Set extends AbstractFunction {
	
	@Override
	protected void run() {
		Attribute attribute = getAttribute();
		
		if(attribute != null) {
			Object value = getAttributeValue();
			
			attribute.modify(new SetModifier(value));
			
			context.doReturn(value);
		}
	}
	
	protected Attribute getAttribute() {
		return context.getAttribute("attribute");
	}

	protected Object getAttributeValue() {
		return getValue("to");
	}
}