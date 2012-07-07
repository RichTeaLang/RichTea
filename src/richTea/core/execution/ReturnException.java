package richTea.core.execution;

public class ReturnException extends RuntimeException {

	private static final long serialVersionUID = 8628072971422883351L;
	
	private Scope scope;
	
	public ReturnException(Scope scope) {
		this.scope = scope;
	}
	
	public Scope getScope() {
		return scope;
	}
}