package richTea.compiler.factory;

import org.antlr.runtime.tree.Tree;

import richTea.compiler.RichTeaParser;
import richTea.compiler.antlr.tree.AttributeData;
import richTea.compiler.antlr.tree.NodeData;
import richTea.runtime.attribute.ArrayAttribute;
import richTea.runtime.attribute.AssignmentExpression;
import richTea.runtime.attribute.Attribute;
import richTea.runtime.attribute.InterpolatedStringAttribute;
import richTea.runtime.attribute.PrimativeAttribute;
import richTea.runtime.attribute.TernaryExpressionAttribute;
import richTea.runtime.attribute.bool.AndAttribute;
import richTea.runtime.attribute.bool.EqualsAttribute;
import richTea.runtime.attribute.bool.GreaterThanAttribute;
import richTea.runtime.attribute.bool.GreaterThanOrEqualToAttribute;
import richTea.runtime.attribute.bool.LessThanAttribute;
import richTea.runtime.attribute.bool.LessThanOrEqualToAttribute;
import richTea.runtime.attribute.bool.NotAttribute;
import richTea.runtime.attribute.bool.NotEqualsAttribute;
import richTea.runtime.attribute.bool.OrAttribute;
import richTea.runtime.attribute.expression.ExpressionAttribute;
import richTea.runtime.attribute.function.FunctionAttribute;
import richTea.runtime.attribute.function.NodeReferenceAttribute;
import richTea.runtime.attribute.math.DivideAttribute;
import richTea.runtime.attribute.math.MinusAttribute;
import richTea.runtime.attribute.math.ModulusAttribute;
import richTea.runtime.attribute.math.MultiplyAttribute;
import richTea.runtime.attribute.math.PlusAttribute;
import richTea.runtime.attribute.variable.LastReturnedValueAttribute;
import richTea.runtime.attribute.variable.LookupChainRoot;
import richTea.runtime.attribute.variable.NativeMethodCall;
import richTea.runtime.attribute.variable.PropertyLookup;
import richTea.runtime.node.TreeNode;

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
			case RichTeaParser.STRING_CHARACTERS :
				attribute = createStringCharactersAttribute(name, value);
				break;
			case RichTeaParser.INTEGER :
				attribute = createIntegerAttribute(name, value);
				break;
			case RichTeaParser.DOUBLE :
				attribute = createDoubleAttribute(name, value);
				break;
			case RichTeaParser.BOOLEAN : 
				attribute = createBooleanAttribute(name, value);
				break;
			case RichTeaParser.NULL :
				attribute = createNullAttribute(name, value);
				break;
			case RichTeaParser.ARRAY :
				attribute = createArrayAttribute(name, value);
				break;
			case RichTeaParser.VARIABLE :
				attribute = createVariableAttribute(name, value);
				break;
			case RichTeaParser.FUNCTION :
				attribute = createFunctionAttribute(name, (NodeData) value);
				break;
			case RichTeaParser.REFERENCE :
				attribute = createNodeReferenceAttribute(name, value);
				break;
			case RichTeaParser.ASSIGN :
				attribute = createAssignmentAttribute(name, value);
				break;
			case RichTeaParser.PLUS :
				attribute = createPlusAttribute(name, value);
				break;
			case RichTeaParser.PLUS_EQUALS :
				attribute = createAssignmentAttribute(name, createPlusAttribute(name, value));
				break;
			case RichTeaParser.MINUS_EQUALS :
				attribute = createAssignmentAttribute(name, createMinusAttribute(name, value));
				break;
			case RichTeaParser.MULTIPLY_EQUALS :
				attribute = createAssignmentAttribute(name, createMultiplyAttribute(name, value));
				break;
			case RichTeaParser.DIVIDE_EQUALS :
				attribute = createAssignmentAttribute(name, createDivideAttribute(name, value));
				break;
			case RichTeaParser.MINUS :
				attribute = createMinusAttribute(name, value);
				break;
			case RichTeaParser.MULTIPLY :
				attribute = createMultiplyAttribute(name, value);
				break;
			case RichTeaParser.DIVIDE :
				attribute = createDivideAttribute(name, value);
				break;
			case RichTeaParser.MODULUS :
				attribute = createModulusAttribute(name, value);
				break;
			case RichTeaParser.EQ :
				attribute = createEqualsAttribute(name, value);
				break;
			case RichTeaParser.NEQ :
				attribute = createNotEqualsAttribute(name, value);
				break;
			case RichTeaParser.AND : 
				attribute = createAndAttribute(name, value);
				break;
			case RichTeaParser.OR : 
				attribute = createOrAttribute(name, value);
				break;
			case RichTeaParser.NOT :
				attribute = createNotAttribute(name, value);
				break;
			case RichTeaParser.LT : 
				attribute = createLessThanAttribute(name, value);
				break;
			case RichTeaParser.LTEQ :
				attribute = createLessThanOrEqualToAttribute(name, value);
				break;
			case RichTeaParser.GT :
				attribute = createGreaterThanAttribute(name, value);
				break;
			case RichTeaParser.GTEQ :
				attribute = createGreaterThanOrEqualToAttribute(name, value);
				break;
			case RichTeaParser.TERNARY_OPERATOR :
				attribute = createTernaryExpressionAttribute(name, value);
				break;
			default :
				throw new IllegalArgumentException("Unknown attribute type: " + value.getText());
		}
		
		return attribute;
	}
	
	protected Attribute createStringAttribute(String name, Tree value) {
		if (value.getChildCount() == 1 && value.getChild(0).getType() == RichTeaParser.STRING_CHARACTERS) {
			return create(name, value.getChild(0));
		} else {
			Attribute[] components = getAttributeOperands(name, value);
			
			return new InterpolatedStringAttribute(name, components);
		}
	}
	
	protected Attribute createStringCharactersAttribute(String name, Tree value) {
		return new PrimativeAttribute(name, value.getText());
	}
	
	protected Attribute createIntegerAttribute(String name, Tree value) {
		return new PrimativeAttribute(name, new Integer(value.getText()));
	}
	
	protected Attribute createDoubleAttribute(String name, Tree value) {
		return new PrimativeAttribute(name, new Double(value.getText()));
	}
	
	protected Attribute createBooleanAttribute(String name, Tree value) {
		return new PrimativeAttribute(name, Boolean.parseBoolean(value.getText()));
	}
	
	protected Attribute createNullAttribute(String name, Tree value) {
		return new PrimativeAttribute(name, null);
	}
	
	protected Attribute createVariableAttribute(String name, Tree value) {
		Attribute lookupChain = new LookupChainRoot(name, false);
		
		for(int i = 0; i < value.getChildCount(); i++) {
			Tree root = value.getChild(i);
			Tree element = root.getChild(0);
			boolean resolveAttributeValue = true;
			
			switch(root.getType()) {
				case RichTeaParser.REFERENCE :
					resolveAttributeValue = false;
					break;
				case RichTeaParser.VALUE :
					resolveAttributeValue = true;
					break;
				default:
					throw new IllegalArgumentException("Invalid variable type");
			}
			
			switch(element.getType()) {
				case RichTeaParser.THIS :
					lookupChain = new LookupChainRoot(name, true);
					break;
				case RichTeaParser.VARIABLE :
					lookupChain = create(name, element);
					break;
				case RichTeaParser.PROPERTY_LOOKUP :
					lookupChain = createPropertyLookupAttribute(name, element, lookupChain, resolveAttributeValue);
					break;
				case RichTeaParser.NATIVE_METHOD_CALL :
					lookupChain = createNativeMethodCallAttribute(element, lookupChain, resolveAttributeValue);
					break;
				case RichTeaParser.LAST_RETURNED_VALUE :
					lookupChain = createLastReturnedValueAttribute(name);
					break;
				default :
					throw new IllegalArgumentException("Invalid variable element attribute type");
			}
		}
		
		return lookupChain;
	}
	
	protected Attribute createPropertyLookupAttribute(String name, Tree value, Attribute lookupChain, boolean resolveAttributeValue) {
		return new PropertyLookup(create(name, value.getChild(0)), lookupChain, resolveAttributeValue);
	}
	
	protected Attribute createNativeMethodCallAttribute(Tree value, Attribute lookupChain, boolean resolveAttributeValue) {
		String methodName = value.getChild(0).getChild(0).getText();
		Attribute[] methodArguments = getAttributeOperands("", value.getChild(1));
	
		return new NativeMethodCall(methodName, methodArguments, lookupChain, resolveAttributeValue);
	}
	
	protected Attribute createArrayAttribute(String name, Tree value) {
		Attribute[] operands = getAttributeOperands(name, value);
		
		return new ArrayAttribute(name, operands);
	}
	
	protected Attribute createFunctionAttribute(String name, NodeData value) {
		TreeNode node = nodeFactory.create(value);
		
		return new FunctionAttribute(name, node);
	}
	
	protected Attribute createNodeReferenceAttribute(String name, Tree value) {
		TreeNode node = nodeFactory.create((NodeData) value.getChild(0));
		
		return new NodeReferenceAttribute(name, node);
	}
	
	protected ExpressionAttribute createPlusAttribute(String name, Tree value) {
		Attribute[] operands = getAttributeOperands(name, value);
		
		return new PlusAttribute(name, operands[0], operands[1]);
	}
		
	protected ExpressionAttribute createMinusAttribute(String name, Tree value) {
		Attribute[] operands = getAttributeOperands(name, value);
		
		return new MinusAttribute(name, operands[0], operands[1]);
	}
	
	protected ExpressionAttribute createMultiplyAttribute(String name, Tree value) {
		Attribute[] operands = getAttributeOperands(name, value);
		
		return new MultiplyAttribute(name, operands[0], operands[1]);
	}
	
	protected ExpressionAttribute createDivideAttribute(String name, Tree value) {
		Attribute[] operands = getAttributeOperands(name, value);
		
		return new DivideAttribute(name, operands[0], operands[1]);
	}
	
	protected ExpressionAttribute createModulusAttribute(String name, Tree value) {
		Attribute[] operands = getAttributeOperands(name, value);
		
		return new ModulusAttribute(name, operands[0], operands[1]);
	}
	
	protected Attribute createAssignmentAttribute(String name, Tree value) {
		Attribute[] operands = getAttributeOperands(name, value);
		
		return new AssignmentExpression(name, operands[0], operands[1]);
	}
	
	protected Attribute createAssignmentAttribute(String name, ExpressionAttribute value) {
		return new AssignmentExpression(name, value);
	}
	
	protected Attribute createAndAttribute(String name, Tree value) {
		Attribute[] operands = getAttributeOperands(name, value);
		
		return new AndAttribute(name, operands[0], operands[1]);
	}
	
	protected Attribute createOrAttribute(String name, Tree value) {
		Attribute[] operands = getAttributeOperands(name, value);
		
		return new OrAttribute(name, operands[0], operands[1]);
	}
	
	protected Attribute createNotAttribute(String name, Tree value) {
		Attribute attribute = create(name, value.getChild(0));
		
		return new NotAttribute(name, attribute);
	}
	
	protected Attribute createEqualsAttribute(String name, Tree value) {
		Attribute[] operands = getAttributeOperands(name, value);
		
		return new EqualsAttribute(name, operands[0], operands[1]);
	}
	
	protected Attribute createNotEqualsAttribute(String name, Tree value) {
		Attribute[] operands = getAttributeOperands(name, value);
		
		return new NotEqualsAttribute(name, operands[0], operands[1]);
	}
	
	protected Attribute createLessThanAttribute(String name, Tree value) {
		Attribute[] operands = getAttributeOperands(name, value);
		
		return new LessThanAttribute(name, operands[0], operands[1]);
	}
	
	protected Attribute createLessThanOrEqualToAttribute(String name, Tree value) {
		Attribute[] operands = getAttributeOperands(name, value);
		
		return new LessThanOrEqualToAttribute(name, operands[0], operands[1]);
	}
	
	protected Attribute createGreaterThanAttribute(String name, Tree value) {	
		Attribute[] operands = getAttributeOperands(name, value);
		
		return new GreaterThanAttribute(name, operands[0], operands[1]);
	}
	
	protected Attribute createGreaterThanOrEqualToAttribute(String name, Tree value) {
		Attribute[] operands = getAttributeOperands(name, value);
		
		return new GreaterThanOrEqualToAttribute(name, operands[0], operands[1]);
	}
	
	protected Attribute createTernaryExpressionAttribute(String name, Tree value) {
		Attribute[] operands = getAttributeOperands(name, value);
		
		return new TernaryExpressionAttribute(name, operands[0], operands[1], operands[2]);
	}
	
	protected Attribute createLastReturnedValueAttribute(String name) {
		return new LastReturnedValueAttribute(name);
	}
	
	protected Attribute[] getAttributeOperands(String elementPrefix, Tree elements) {
		Attribute[] elementAttributes = new Attribute[elements.getChildCount()];
		
		for(int i = 0; i < elementAttributes.length; i++) {
			elementAttributes[i] = create(String.format("%s[operand][%s]", elementPrefix, i), elements.getChild(i));
		}
		
		return elementAttributes;
	}
}