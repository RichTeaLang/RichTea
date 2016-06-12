package richTea.runtime.attribute;

import richTea.runtime.attribute.expression.ExpressionAttribute;
import richTea.runtime.attribute.modifier.SetModifier;
import richTea.runtime.execution.ExecutionContext;

public class AssignmentExpression extends AbstractAttribute {
	
	private Attribute target;
	private Attribute value;
	
	public AssignmentExpression(String name, ExpressionAttribute expression) {
		this(name, expression.getLeftOperand(), expression);
	}
	
	public AssignmentExpression(String name, Attribute target, Attribute value) {
		super(name);
		
		this.target = target;
		this.value = value;
	}
	
	public Attribute getTargetAttribute() {
		return target;
	}
	
	public Attribute getValueAttribute() {
		return value;
	}
	
	@Override 
	public Object getValue(ExecutionContext context) {
		Attribute target = getTargetAttribute();
		Object value = getValueAttribute().getValue(context);
		
		target.modify(context, new SetModifier(value));
		
		return value;
	}
}