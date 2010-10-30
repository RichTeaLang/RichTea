package richTea.core.factory;

import java.util.ArrayList;
import java.util.List;

import org.antlr.runtime.tree.Tree;

import richTea.antlr.RichTeaParser;
import richTea.antlr.tree.AttributeData;
import richTea.antlr.tree.NodeData;
import richTea.core.attribute.ArrayAttribute;
import richTea.core.attribute.Attribute;
import richTea.core.attribute.BooleanAttribute;
import richTea.core.attribute.FunctionAttribute;
import richTea.core.attribute.LookupAttribute;
import richTea.core.attribute.NumberAttribute;
import richTea.core.attribute.PrimativeAttribute;
import richTea.core.attribute.StringAttribute;
import richTea.core.node.TreeNode;

public class RichTeaAttributeFactory {
	
	private RichTeaNodeFactory nodeFactory;
	
	public RichTeaAttributeFactory(RichTeaNodeFactory nodeFactory) {
		
		this.nodeFactory = nodeFactory;
	}
	
	public Attribute create(AttributeData attributeData) {
		return create(attributeData.getName(), attributeData.getValue());
	}
	
	protected Attribute create(String name, Tree value) {
		Attribute attribute = null;
		
		switch(value.getType()) {
			case RichTeaParser.STRING :	
				attribute = createStringAttribute(name, value);
				break;
			case RichTeaParser.NUMBER : 
				attribute = createNumberAttribute(name, value);
				break;
			case RichTeaParser.BOOLEAN : 
				attribute = createBooleanAttribute(name, value);
				break;
			case RichTeaParser.ARRAY :
				attribute = createArrayAttribute(name, value);
				break;
			case RichTeaParser.LOOKUP :
				attribute = createLookupAttribute(name, value);
				break;
			case RichTeaParser.FUNCTION :
				attribute = createFunctionAttribute(name, (NodeData) value);
				break;
			default :
				attribute = new PrimativeAttribute(name, value.getText());
		}
		
		return attribute;
	}
	
	protected Attribute createStringAttribute(String name, Tree value) {
		String stringValue = value.getText().substring(1); // Remove the leading "
		stringValue = stringValue.substring(0, stringValue.length() - 1); // Remove the trailing "

		return new StringAttribute(name, stringValue);
	}
	
	protected Attribute createNumberAttribute(String name, Tree value) {
		return new NumberAttribute(name, Double.parseDouble(value.getText()));
	}
	
	protected Attribute createBooleanAttribute(String name, Tree value) {
		return new BooleanAttribute(name, Boolean.parseBoolean(value.getText()));
	}
	
	protected Attribute createLookupAttribute(String name, Tree value) {		
		List<String> lookupPath = new ArrayList<String>();
		
		for(int i = 0; i < value.getChildCount(); i++) {
			lookupPath.add(value.getChild(i).getText());
		}
		
		return new LookupAttribute(name, lookupPath);
	}
	
	protected Attribute createArrayAttribute(String name, Tree value) {
		Attribute[] arrayElements = new Attribute[value.getChildCount()];
		
		for(int i = 0; i < arrayElements.length; i++) {
			arrayElements[i] = create(String.format("name[%s]", i), value.getChild(i));
		}
		
		return new ArrayAttribute(name, arrayElements);
	}
		
	protected Attribute createFunctionAttribute(String name, NodeData nodeData) {
		TreeNode function = nodeFactory.create(nodeData);
		
		return new FunctionAttribute(name, function);
	}
}