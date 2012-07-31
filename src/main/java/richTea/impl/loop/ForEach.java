package richTea.impl.loop;

import richTea.core.attribute.PrimativeAttribute;
import richTea.core.execution.AbstractFunction;

public class ForEach extends AbstractFunction {
	
	@Override
	protected void run() {
		Iterable<?> inList = inList();
		String as = as();
		
		PrimativeAttribute currentElement = new PrimativeAttribute(as, null);
		
		context.pushScope(context.createScope(currentElement));
		
		for(Object element : inList) {
			currentElement.setValue(element);			
			context.executeBranch("do");
		}
		
		context.popScope();
	}
	
	protected Iterable<?> inList() {
		return (Iterable<?>) context.getValue("in");
	}
	
	protected String as() {
		return context.getString("as");
	}	
}