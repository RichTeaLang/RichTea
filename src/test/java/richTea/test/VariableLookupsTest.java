package richTea.test;

import static org.junit.Assert.assertTrue;

import org.antlr.runtime.RecognitionException;
import org.junit.Test;

import richTea.runtime.attribute.Attribute;
import richTea.runtime.execution.ExecutionContext;

public class VariableLookupsTest extends RichTeaTestBase {
	
	@Test
	public void testSimpleLookup() throws RecognitionException {
		createContextAndTestVariable("(x:100)", "x", 100);
	}
	
	@Test
	public void testLookupChain() throws RecognitionException {
		createContextAndTestVariable("(x:(y:200))", "x.y", 200);
	}
	
	@Test
	public void testBeanPropertyLookup() throws RecognitionException {
		createContextAndTestVariable("(x:\"I'm a string\")", "x.class.simpleName", "String");
	}
	
	@Test
	public void testJavaMethodExecution() throws RecognitionException {
		createContextAndTestVariable("(x:\"I'm a string\")", "x.equals(\"I'm a string\")", true);
		createContextAndTestVariable("(x:\"I'm a string\")", "x.equals(x)", true);
		createContextAndTestVariable("(x:\"I'm a string\")", "x.equals(x + \".\")", false);
		createContextAndTestVariable("(x:\"I'm a string\")", "x.length()", 12);
		createContextAndTestVariable("(x:\"I'm a string\")", "x.length().equals((x.length()))", true);
	}
	
	@Test
	public void testNestedLookupChains() throws RecognitionException {
		createContextAndTestVariable("(x:1 y:\"class\")", "x.{y}.simpleName", "Integer");
		createContextAndTestVariable("(x:1 y:\"class\" z:\"simpleName\")", "x.{y}.{z}", "Integer");
	}
	
	@Test
	public void testStringInterpolation() throws RecognitionException {
		createContextAndTestVariable("(name:\"RichTea\")", "\"Hello from {name}!\"", "Hello from RichTea!");
		createContextAndTestVariable("()", "\"10 + 10 = {10 + 10}\"", "10 + 10 = 20.0");
	}
	
	@Test
	public void testAssignmentAttribute() throws RecognitionException {
		ExecutionContext context = buildExecutionContext("(value:1)");
		Attribute assignment = buildAttribute("value = 2");
		
		Object value = assignment.getValue(context);
		
		assertTrue(value.equals(2));
		assertTrue(context.getValue("value").equals(2));
	}
	
	private void createContextAndTestVariable(String contextSource, String attributeSource, Object expected) throws RecognitionException {
		ExecutionContext context = buildExecutionContext(contextSource);
		Attribute attribute = buildAttribute(attributeSource);
		
		assertTrue(attribute.getValue(context).equals(expected));
	}
}
