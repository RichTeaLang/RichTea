package richTea.impl;

import java.util.List;

import richTea.core.execution.AbstractFunction;

public class GetArrayData extends AbstractFunction {

	@Override
	protected void run() {
		List<?> array = getArray();
		
		if(array != null) {
			context.setLastReturnValue(array.get(getIndex()));
		}
	}
	
	protected List<?> getArray() {
		return (List<?>) context.getValue("array");
	}
	
	protected int getIndex() {
		return (int) context.getNumber("index");
	}
}