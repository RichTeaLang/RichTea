package richTea.core.execution;

public abstract class AbstractFunction implements RichTeaFunction {

	protected ExecutionContext context;
	
	abstract protected void run();
	
	public void execute(ExecutionContext context) {
		this.context = context;
		
		if(shouldExecute()) run();
		
		context = null;
	}
	
	public boolean shouldExecute() {
		return context.getBooleanOrDefault("if", true);
	}
}