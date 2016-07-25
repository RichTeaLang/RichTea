package richTea.test;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

import richTea.runtime.attribute.Attribute;
import richTea.runtime.attribute.PrimativeAttribute;
import richTea.runtime.attribute.modifier.SetModifier;
import richTea.runtime.attribute.variable.LastReturnedValueAttribute;
import richTea.runtime.execution.ExecutionContext;
import richTea.runtime.execution.VariableScope;

public class VariableLookupsTest extends RichTeaTestBase {
	
	@Test
	public void testSimpleLookup() {
		createContextAndTestVariable("(x:100)", "x", 100);
	}
	
	@Test
	public void testThisPrefix() {
		ExecutionContext context = super.buildExecutionContext("(x:100)");
		
		try {
			// Variables resolve from the parent scope. Therefore there is no "x" variable to resolve
			buildAttribute("x").getValue(context);
			
			Assert.fail("Expected exception when resolving 'x'");
		} catch (Exception e) { // Expected.  Continue tests...
			assertEquals(100, buildAttribute("this.x").getValue(context));
		}
	}
	
	@Test
	public void testLookupChain() {
		createContextAndTestVariable("(x:@(y:200))", "x.y", 200);
	}
	
	@Test
	public void testBeanPropertyLookup() {
		createContextAndTestVariable("(x:\"I'm a string\")", "x.class.simpleName", "String");
	}
	
	@Test
	public void testJavaMethodExecution() {
		createContextAndTestVariable("(x:\"I'm a string\")", "x.equals(\"I'm a string\")", true);
		createContextAndTestVariable("(x:\"I'm a string\")", "x.equals(x)", true);
		createContextAndTestVariable("(x:\"I'm a string\")", "x.equals(x + \".\")", false);
		createContextAndTestVariable("(x:\"I'm a string\")", "x.length()", 12);
		createContextAndTestVariable("(x:\"I'm a string\")", "x.length().equals((x.length()))", true);
	}
	
	@Test
	public void testNestedLookupChains() {
		createContextAndTestVariable("(x:1 y:\"class\")", "x.{y}.simpleName", "Integer");
		createContextAndTestVariable("(x:1 y:\"class\" z:\"simpleName\")", "x.{y}.{z}", "Integer");
	}
	
	@Test
	public void testAssignmentAttribute() {
		ExecutionContext context = buildExecutionContext("(value:1)");
		Attribute setter = buildAttribute("value = 2");
		Attribute getter = buildAttribute("value");
		
		assertEquals(2, setter.getValue(context));
		assertEquals(2, getter.getValue(context));
	}
	
	@Test
	public void testFirstClassAttribute() {
		createContextAndTestVariable("(x:true)", "@x.name", "x");
	}
	
	@Test
	public void testNestedFirstClassAttribute() {
		ExecutionContext context = buildExecutionContext("(obj:@(name:\"abc\"))");
		Attribute nameValue = buildAttribute("obj.name");
		Attribute nameReference = buildAttribute("obj.@name");
		
		assertEquals("abc", nameValue.getValue(context));
		assertEquals(nameReference.getValue(context).getClass(), PrimativeAttribute.class);
		
		((PrimativeAttribute) nameReference.getValue(context)).setValue("123");
		
		assertEquals("123", nameValue.getValue(context));
	}
	
	@Test
	public void testLastReturnedValueAttribute() {
		ExecutionContext context = new ExecutionContext();
		Attribute attribute = buildAttribute("_");
		Object someValue = new Object();
		Object someOtherValue = new Object();
		
		assertEquals(null, attribute.getValue(context));
		
		context.setLastReturnValue(someValue);
		
		assertEquals(someValue, attribute.getValue(context));
		
		Object result = attribute.modify(context, new SetModifier(someOtherValue));
		
		assertEquals(someOtherValue, result);
		assertEquals(someOtherValue, attribute.getValue(context));
		assertEquals(someOtherValue, context.getLastReturnValue());
	}
	
	@Override
	protected ExecutionContext buildExecutionContext(String input) {
		// Nest variable scope to avoid having to prefix all variable attributes with "this."
		VariableScope root = new VariableScope(null, new VariableScope(buildNode(input)));
		
		return new ExecutionContext(root);
	}
	
	private void createContextAndTestVariable(String contextSource, String attributeSource, Object expected) {
		ExecutionContext context = buildExecutionContext(contextSource);
		Attribute attribute = buildAttribute(attributeSource);
		
		assertEquals(expected, attribute.getValue(context));
	}
}
