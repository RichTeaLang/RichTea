package richTea.core.resolver;

import richTea.core.attribute.Attribute;
import richTea.core.execution.ExecutionContext;
import richTea.core.node.BasicNode;

public class ExecutionContextResolver<T extends BasicNode> extends BasicNodeResolver<T> {
	
	private ExecutionContext context;
	
	public ExecutionContextResolver(ExecutionContext context) {
		this.context = context;
	}
	
	@Override
	public Object getValue(String key) {
		Attribute attribute = getContext().getAttribute(key);
		
		return attribute != null ? attribute.getValue(context) : null;
	}

}
