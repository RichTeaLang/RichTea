package richTea.runtime.execution;

import java.util.List;

import richTea.runtime.attribute.Attribute;
import richTea.runtime.attribute.AttributeSet;
import richTea.runtime.attribute.InterpolatedStringAttribute;
import richTea.runtime.attribute.TernaryExpressionAttribute;
import richTea.runtime.attribute.expression.ExpressionAttribute;
import richTea.runtime.attribute.function.FunctionAttribute;
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
		indent--;
	}
	
	private void writeHeader(Throwable throwable) {
		write("Message:");
		indent++;
		String message = throwable.getMessage();
		write(message != null ? throwable.getMessage() : throwable.getClass().getName());
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
				functionClass = owner.getBinding().getFunctionClass().getName();
			} else if (scope.getRoot() == scope) {
				functionName = "<Globals>";
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
		
		indent++;
		
		try {
			Object object = attribute.getValue(context);
			
			write(object.getClass().getName(), false);
			
			if (object instanceof List<?>) {
				List<?> list = (List<?>) object;
				int size = list.size();
				
				write("[" + size + "]");
				
				for(int i = 0; i < size; i++) {
					write("[" + i + "]: " + String.valueOf(list.get(i)));
				}
			} else if (object instanceof AttributeSet) {
				write("");
				
				for(Attribute childAttribute : ((AttributeSet) object).getAttributes()) {
					writeAttribute(childAttribute, context);
				}
			} else if (object instanceof String) {
				write(" = \"" + object.toString() + "\"");
			} else {
				String stringRepresentation = String.valueOf(object);
				
//				if (string.length() > 100) {
//					string = string.substring(0, 97) + "...";
//				}
				
				write(" = " + stringRepresentation);
			}
		} catch (Throwable e) {
			write(attribute.getClass().getSimpleName() + " <ERROR> = " + e.getMessage());
			
			if (attribute instanceof InterpolatedStringAttribute) {
				for(Attribute component : ((InterpolatedStringAttribute) attribute).getComponents()) {
					writeAttribute(component, context);
				}
			} else if (attribute instanceof TernaryExpressionAttribute) {
				TernaryExpressionAttribute expression = (TernaryExpressionAttribute) attribute;
				
				writeAttribute(expression.getExpression(), context);
				writeAttribute(expression.getTrueAttribute(), context);
				writeAttribute(expression.getFalseAttribute(), context);
			} else if (attribute instanceof FunctionAttribute) {
				FunctionAttribute functionRef = (FunctionAttribute) attribute;
				TreeNode functionNode = functionRef.getNode();
				
				write("Function: " + functionNode.getFunction().getClass().getName());
				
				indent++;
				
				for(Attribute a : functionNode.getAttributes()) {
					writeAttribute(a, context);
				}
				
				indent--;
			} else if (attribute instanceof ExpressionAttribute) {
				ExpressionAttribute expression = (ExpressionAttribute) attribute;
				
				writeAttribute(expression.getLeftOperand(), context);
				writeAttribute(expression.getRightOperand(), context);
			}
		}
		
		indent--;
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