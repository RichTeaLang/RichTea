package richTea.runtime.attribute;

import richTea.runtime.execution.ExecutionContext;

public class StringAttribute extends AbstractAttribute {

	private Attribute[] components;
	
	public StringAttribute(String name, Attribute[] components) {
		super(name);
		
		this.components = components;
	}
	
	protected Attribute[] getComponents() {
		return this.components;
	}

	@Override
	public Object getValue(ExecutionContext context) {
		StringBuilder string = new StringBuilder();
		
		for(Attribute attribute : getComponents()) {
			string.append(String.valueOf(attribute.getValue(context)));
		}
		
		return string.toString();
	}

}
