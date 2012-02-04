package richTea.core.resolver;

import richTea.core.execution.ExecutionContext;
import richTea.core.node.BasicNode;

public class ExecutionContextResolver<T extends BasicNode> extends BasicNodeResolver<T> {
	
	private ExecutionContext context;
	
	public ExecutionContextResolver(ExecutionContext context) {
		this.context = context;
	}
	
	@Override
	public Object getValue(String attributeName) {
		Object value = context.attributes.get(attributeName);
		
		if(value == null) value = super.getValue(attributeName);
		
		return value;
	}

}
