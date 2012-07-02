package richTea.core.attribute.function;

import richTea.core.attribute.AbstractAttribute;
import richTea.core.execution.ExecutionContext;

public class ExecutableFunctionAttribute extends AbstractAttribute {

	private FunctionAttribute functionAttribute;
	
	public ExecutableFunctionAttribute(String name, FunctionAttribute functionAttribute) {
		super(name);
		
		this.functionAttribute = functionAttribute;
	}
	
	public FunctionAttribute getFunctionAttribute() {
		return functionAttribute;
	}
	
	@Override
	public Object getValue(ExecutionContext context) {		
		return context.execute(getFunctionAttribute().getFunctionNode());
	}
}