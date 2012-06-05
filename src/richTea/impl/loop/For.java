package richTea.impl.loop;

import richTea.core.execution.AbstractFunction;

public class For extends AbstractFunction {

	@Override
	protected void run() {
		int count = getCount();
		String as = as();
		
		for(int i = 0; i < count; i++) {
			context.setValue(as, i);	
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