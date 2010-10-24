package richTea.core.attribute;

public class StringAttribute extends PrimativeAttribute {

	public StringAttribute(String name, String value) {
		super(name, value);
	}
	
	@Override
	public String getValue() {
		return (String) super.getValue();
	}
}