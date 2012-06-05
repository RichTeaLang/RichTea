package richTea.impl.loop;

import richTea.core.execution.AbstractFunction;

public class ForEach extends AbstractFunction {
	
	@Override
	protected void run() {
		Iterable<Object> inList = inList();
		String as = as();
		
		for(Object element : inList) {
			context.setValue(as, element);			
			context.executeBranch("do");
		}
	}
	
	@SuppressWarnings("unchecked")
	protected Iterable<Object> inList() {
		return (Iterable<Object>) context.getValue("in");
	}
	
	protected String as() {
		return context.getString("as");
	}	
}