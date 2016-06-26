package richTea.runtime.execution;

import java.util.List;

import richTea.runtime.attribute.Attribute;
import richTea.runtime.attribute.AttributeSet;
import richTea.runtime.node.TreeNode;

public class ExecutionException extends RuntimeException {
	private static final long serialVersionUID = -3297448029717984351L;
	
	private ExecutionContext context;
	
	public ExecutionException(ExecutionContext context, Throwable throwable) {
		super(new StackTraceBuilder(context, throwable).toString(), throwable);
		
		this.context = context;
	}
	
	public ExecutionContext getContext() {
		return context;
	}
}

class StackTraceBuilder {
	private static final String TAB = "\t";
	private static final String NEW_LINE = System.getProperty("line.separator");
	
	private StringBuilder stackTrace;
	private int indent;
	private boolean isNewLine;
	
	public StackTraceBuilder(ExecutionContext context, Throwable throwable) {
		stackTrace = new StringBuilder();
		indent = 0;
		isNewLine = true;
		
		write("Exeception executing RichTea program:");
		indent++;
		writeHeader(throwable);
		writeContext(context);
		write("");
	}
	
	private void writeHeader(Throwable throwable) {
		write("Message:");
		indent++;
		write(throwable.getMessage());
		indent--;
	}
	
	private void writeContext(ExecutionContext context) {
		write("Execution Context:");
		
		indent++;
		
		VariableScope scope = context.getCurrentScope();
		
		while(scope != null) {
			TreeNode owner = scope.getOwner();
			String functionName = "";
			String functionClass = "";
			
			if (owner != null) {
				functionName = owner.getBinding().getName();
				functionClass = owner.getBinding().getFunctionClassName();
			}
			
			write(functionName + ":" + functionClass);
			
			Attribute[] attributes = scope.getAttributes();
			
			if (attributes.length > 0) {
				indent++;
				
				for(Attribute attribute : attributes) {
					writeAttribute(attribute, context);
				}
				
				indent--;
			}
			
			scope = scope.getParent();
		}
		
		indent--;
	}
		
	private void writeAttribute(Attribute attribute, ExecutionContext context) {
		write(attribute.getName() + ":", false);
		
		try {
			Object object = attribute.getValue(context);
			
			write(object.getClass().getName(), false);
			
			if (object instanceof String || object instanceof Boolean || object instanceof Number) {
				write(" = " + String.valueOf(object));
			} else {
				if (object instanceof List<?>) {
					write("[" + ((List<?>) object).size() + "]");
				} else if (object instanceof AttributeSet) {
					write("");
					
					indent++;
					
					for(Attribute childAttribute : ((AttributeSet) object).getAttributes()) {
						writeAttribute(childAttribute, context);
					}
					
					indent--;
				} else {
					write("");
				}
			}
		} catch (Exception e) {
			write(attribute.getClass().getSimpleName() + " <ERROR> = " + e.getMessage());
		}
	}
	
	private void write(String line) {
		write(line, true);
	}
	
	private void write(String line, boolean appendNewLine) {
		if (isNewLine) {
			for(int i = 0; i < indent; i++) {
				stackTrace.append(TAB);
			}
			
			isNewLine = false;
		}
		
		line = line.replaceAll(NEW_LINE, "");
		
		stackTrace.append(line);
		
		if (appendNewLine) {
			stackTrace.append(NEW_LINE);
			isNewLine = true;
		}
	}
	
	@Override
	public String toString() {
		return stackTrace.toString();
	}
}