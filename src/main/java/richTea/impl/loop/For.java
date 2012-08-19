package richTea.impl.loop;

import richTea.core.attribute.PrimativeAttribute;
import richTea.core.execution.AbstractFunction;

public class For extends AbstractFunction {

	@Override
	protected void run() {
		int count = getCount();
		String as = as();

		PrimativeAttribute index = new PrimativeAttribute(as, 0);
		
		context.pushScope(context.createScope(index));

		for(int i = 0; i < count; i++) {
			index.setValue(i);
			
			context.executeBranch("do");
		}
		
		context.popScope();
	}
	
	protected int getCount() {
		return (int) context.getNumber("count");
	}
	
	protected String as() {
		return context.getString("as");
	}
}