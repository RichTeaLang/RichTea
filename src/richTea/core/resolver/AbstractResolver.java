package richTea.core.resolver;

import org.apache.log4j.Logger;

public abstract class AbstractResolver implements Resolver {
	
	protected Logger log;
	
	private Object context;
	
	public AbstractResolver(Object context) {
		log = Logger.getLogger(getClass());
		
		setContext(context);
	}
	
	public Object getContext() {
		return context;
	}
	
	protected void setContext(Object context) {
		this.context = context;
	}
	
	public abstract Object getValue(String key);
}
