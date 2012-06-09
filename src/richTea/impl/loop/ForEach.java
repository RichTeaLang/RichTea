package richTea.impl.loop;

import richTea.core.execution.AbstractFunction;

public class ForEach extends AbstractFunction {
	
	@Override
	protected void run() {
		Iterable<?> inList = inList();
		String as = as();
		
		for(Object element : inList) {
			context.setValue(as, element);			
			context.executeBranch("do");
		}
	}
	
	protected Iterable<?> inList() {
		return (Iterable<?>) context.getValue("in");
	}
	
	protected String as() {
		return context.getString("as");
	}	
}