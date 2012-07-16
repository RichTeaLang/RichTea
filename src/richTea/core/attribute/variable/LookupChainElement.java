package richTea.core.attribute.variable;

import richTea.core.attribute.Attribute;

public abstract class LookupChainElement implements Attribute {

	private Attribute lookupChain;
	
	public LookupChainElement(Attribute lookupChain) {
		this.lookupChain = lookupChain;
	}
	
	public String getName() {
		return getLookupChain().getName();
	}
	
	public void setName(String name) {
		getLookupChain().setName(name);
	}
	
	public Attribute getLookupChain() {
		return lookupChain;
	}
}