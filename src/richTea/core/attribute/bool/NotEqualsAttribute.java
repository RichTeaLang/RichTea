package richTea.core.attribute.bool;

import java.util.List;

import richTea.core.attribute.Attribute;

public class NotEqualsAttribute extends EqualsAttribute {

	public NotEqualsAttribute(String name, List<Attribute> operands) {
		super(name, operands);
	}
	
	@Override 
	protected Boolean getValue(Object value1, Object value2) {
		return !super.getValue(value1, value2);
	}
}