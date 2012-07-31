package richTea.impl.functional;

import java.util.ArrayList;
import java.util.List;

import richTea.core.execution.AbstractFunction;
import richTea.core.execution.ReturnException;

public class Map extends AbstractFunction {

	@Override
	protected void run() throws Exception {
		List<?> input = getInput();
		List<Object> mappedValues = new ArrayList<Object>();
		
		for(Object value : input) {
			context.setLastReturnValue(value);
			
			try {
				context.executeBranch("mapFunction");
			} catch(ReturnException e) {
				context.unRollScopeTo(this);
			}
			
			
			mappedValues.add(context.getLastReturnValue());
		}
		
		context.setLastReturnValue(mappedValues);	
	}
	
	protected List<?> getInput() {
		return (List<?>) context.getValue("input");
	}

}
