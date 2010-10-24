package richTea.core.attribute;

public class BooleanAttribute extends PrimativeAttribute {

	public BooleanAttribute(String name, Boolean value) {
		super(name, value);
	}
	
	@Override 
	public Boolean getValue() {
		return (Boolean) super.getValue();
	}
}