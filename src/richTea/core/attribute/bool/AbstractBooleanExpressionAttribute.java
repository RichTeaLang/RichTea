package richTea.core.attribute.bool;

import java.util.List;

import richTea.core.attribute.Attribute;
import richTea.core.attribute.ExpressionAttribute;

public abstract class AbstractBooleanExpressionAttribute extends ExpressionAttribute {

	public AbstractBooleanExpressionAttribute(String name, List<Attribute> operands) {
		super(name, operands);
	}

	@Override
	protected Boolean getValue(Object value1, Object value2) {		
		boolean booleanValue1 = Boolean.parseBoolean(value1.toString());
		boolean booleanValue2 = Boolean.parseBoolean(value2.toString());
					
		return getValue(booleanValue1, booleanValue2);
	}
	
	abstract protected boolean getValue(boolean value1, boolean value2);
}  