package richTea.runtime.execution;

import org.apache.log4j.Logger;

import richTea.runtime.attribute.PrimativeAttribute;

public abstract class AbstractFunction implements RichTeaFunction {
	
	protected String exceptionBranchName = "onError";
	protected Logger log = Logger.getLogger(getClass());
	protected ExecutionContext context;
	
	abstract protected void run() throws Exception;
	
	public void execute(ExecutionContext context) {
		this.context = context;
		
		if(shouldExecute()) {
			try {
				run();
				
				String id = context.getString("id");
				
				if(id != null) {
					VariableScope scope = context.getCurrentScope().getRoot();
					
					if(scope != null) {
						scope.setAttribute(new PrimativeAttribute(id, context.getLastReturnValue()));
					} else {
						throw new IllegalArgumentException("No scope to create variable");
					}
				}
			} catch(RuntimeException runtimeException) {
				throw runtimeException;
			} catch(Exception checkedExceception) {
				if (context.getCurrentNode().hasBranch(exceptionBranchName)) {
					context.executeBranch(exceptionBranchName, new PrimativeAttribute("error", checkedExceception));
				} else {
					throw new RuntimeException(checkedExceception);
				}
			}
			
		}
		
		context = null;
	}
	
	protected boolean shouldExecute() {
		return context.getBooleanOrDefault("if", true);
	}
}