package richTea.impl.loop;

import richTea.core.attribute.NumberAttribute;
import richTea.core.execution.AbstractFunction;

public class For extends AbstractFunction {

	@Override
	protected void run() {
		int count = getCount();
		String as = as();
		
		for(int i = 0; i < count; i++) {
			context.getCurrentNode().setAttribute(new NumberAttribute(as, i));		
			context.executeBranch("do");
		}
	}
	
	protected int getCount() {
		return (int) context.getNumber("count");
	}
	
	protected String as() {
		return context.getString("as");
	}
}