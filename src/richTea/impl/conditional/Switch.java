package richTea.impl.conditional;

import richTea.core.execution.AbstractFunction;

public class Switch extends AbstractFunction {

	@Override
	protected void run() {
		String switchValue = getSwitchValue();
		
		if(!context.executeBranch(switchValue)) {
			context.executeBranch("default");
		}
	}
	
	protected String getSwitchValue() {
		return context.getString("value");
	}

}
