package richTea.core.attribute.modifier;

public class IncrementModifier implements AttributeModifier {
	
	private double byAmount;
	
	public IncrementModifier(double byAmount) {
		this.byAmount = byAmount;
	}
	
	public Object modify(Object attributeValue) {
		double value = Double.parseDouble(attributeValue.toString());
		
		return value + byAmount;
	}
}
