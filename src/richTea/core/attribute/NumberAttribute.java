package richTea.core.attribute;

public class NumberAttribute extends PrimativeAttribute {

	public NumberAttribute(String name, Number value) {
		super(name, value);
	}
	
	@Override
	public Number getValue() {
		return (Number) super.getValue();
	}
}
