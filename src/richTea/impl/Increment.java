package richTea.impl;

import richTea.core.attribute.Attribute;
import richTea.core.attribute.modifier.IncrementModifier;
import richTea.core.execution.AbstractFunction;

public class Increment extends AbstractFunction {

	@Override
	protected void run() {
		Attribute attribute = getAttribute();
		
		if(attribute != null) {
			Object newValue = attribute.modify(new IncrementModifier(getBy().doubleValue()));
			
			context.returnValue(newValue);
		}
	}
	
	protected Attribute getAttribute() {
		return context.getCurrentNode().getAttribute("attribute");
	}
	
	protected Number getBy() {
		return context.getNumber("by");
	}
}