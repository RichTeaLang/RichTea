package richTea.runtime.execution;

public class ReturnException extends RuntimeException {

	private static final long serialVersionUID = 8628072971422883351L;
	
	private VariableScope scope;
	
	public ReturnException(VariableScope scope) {
		this.scope = scope;
	}
	
	public VariableScope getScope() {
		return scope;
	}
}