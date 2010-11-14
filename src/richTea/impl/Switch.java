package richTea.impl;

import richTea.core.execution.AbstractFunction;

public class Switch extends AbstractFunction {

	@Override
	protected void run() {
		String switchValue = getSwitchValue();
		
		getValue(switchValue);
	}
	
	protected String getSwitchValue() {
		return getString("value");
	}

}
