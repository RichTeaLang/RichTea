package richTea.core.execution;

import org.apache.log4j.Logger;

public abstract class AbstractFunction implements RichTeaFunction {

	protected Logger log = Logger.getLogger(getClass());
	
	protected ExecutionContext context;
	
	abstract protected void run() throws Exception;
	
	public void execute(ExecutionContext context) {
		this.context = context;
		
		
		if(shouldExecute()) {
			try {
				run();
			}catch(RuntimeException runtimeException) {
				throw runtimeException;
			}catch(Exception checkedExceception) {
				log.error("Error executing function", checkedExceception);
			}
			
		}
		
		context = null;
	}
	
	protected boolean shouldExecute() {
		return context.getBooleanOrDefault("if", true);
	}
}