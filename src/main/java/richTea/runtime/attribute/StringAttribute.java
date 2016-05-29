package richTea.runtime.attribute;

import java.util.List;

import richTea.runtime.execution.ExecutionContext;

public class StringAttribute extends AbstractAttribute {

	private List<Attribute> components;
	
	public StringAttribute(String name, List<Attribute> components) {
		super(name);
		

		this.components = components;
	}

	@Override
	public Object getValue(ExecutionContext context) {
		StringBuilder string = new StringBuilder();
		
		for(Attribute attribute : this.components) {
			string.append(String.valueOf(attribute.getValue(context)));
		}
		
		return string.toString();
	}

}
