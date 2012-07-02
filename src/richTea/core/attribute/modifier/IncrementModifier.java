package richTea.core.attribute.modifier;

import richTea.core.attribute.Attribute;

public class IncrementModifier implements AttributeModifier {
	
	private double byAmount;
	
	public IncrementModifier(double byAmount) {
		this.byAmount = byAmount;
	}
	
	public Object modify(Attribute attribute) {
		double value = Double.parseDouble(attribute.getValue(null).toString());
		
		return value + byAmount;
	}
}
