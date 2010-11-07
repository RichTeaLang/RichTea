package richTea.core.attribute.bool;

import java.util.List;

import richTea.core.attribute.Attribute;
import richTea.core.attribute.math.AbstractMathExpressionAttribute;

public abstract class AbstractMathBooleanExpressionAttribute extends AbstractMathExpressionAttribute {

	public AbstractMathBooleanExpressionAttribute(String name, List<Attribute> operands) {
		super(name, operands);
	}

	@Override
	public Object getValue() {
		Object value = super.getValue();
		
		if(value == null) {
			// We couldn't convert the input to numbers so we return false.
			value = false;
		}
		
		return value;
	}
}