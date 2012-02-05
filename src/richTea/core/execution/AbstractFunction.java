package richTea.core.execution;

import org.apache.log4j.Logger;

public abstract class AbstractFunction implements RichTeaFunction {

	protected ExecutionContext context;
	protected Logger log = Logger.getLogger(getClass());
	
	abstract protected void run() throws Exception;
	
	public void execute(ExecutionContext context) {
		this.context = context;
		
		if(shouldExecute()) {
			try {
				run();
			}catch(Exception exception) {
				log.error("Error executing function", exception);
			}
		}
		
		context = null;
	}
	
	protected boolean shouldExecute() {
		return context.getBooleanOrDefault("if", true);
	}
}