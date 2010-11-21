package richTea.impl;

import java.util.List;

import richTea.core.execution.AbstractFunction;

public class GetArrayData extends AbstractFunction {

	@Override
	protected void run() {
		List<Object> array = getArray();
		
		if(array != null) {
			context.doReturn(array.get(getIndex()));
		}
	}
	
	@SuppressWarnings("unchecked")
	protected List<Object> getArray() {
		return (List<Object>) context.getValue("array");
	}
	
	protected int getIndex() {
		return (int) context.getNumber("index");
	}
}