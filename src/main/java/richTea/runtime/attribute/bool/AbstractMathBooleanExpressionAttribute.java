package richTea.runtime.attribute.bool;

import richTea.runtime.attribute.Attribute;
import richTea.runtime.attribute.math.AbstractMathExpressionAttribute;
import richTea.runtime.execution.ExecutionContext;

public abstract class AbstractMathBooleanExpressionAttribute extends AbstractMathExpressionAttribute {

	public AbstractMathBooleanExpressionAttribute(String name, Attribute leftOperand, Attribute rightOperand) {
		super(name, leftOperand, rightOperand);
	}

	@Override
	public Object getValue(ExecutionContext context) {
		Object value = super.getValue(context);
		
		if(value == null) {
			// We couldn't convert the input to numbers so we return false.
			value = false;
		}
		
		return value;
	}
}