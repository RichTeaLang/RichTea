package richTea.test;

import static org.junit.Assert.assertTrue;

import org.antlr.runtime.RecognitionException;
import org.junit.Test;

import richTea.core.attribute.Attribute;
import richTea.core.execution.ExecutionContext;
import richTea.core.execution.VariableScope;

public class VariableLookupTests extends RichTeaTestBase {
	
	@Test
	public void testSimpleLookup() throws RecognitionException {
		createContextAndTestVariable("(x:100)", "x", 100.0);
	}
	
	@Test
	public void testLookupChain() throws RecognitionException {
		createContextAndTestVariable("(x:(y:200))", "x.y", 200.0);
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
		createContextAndTestVariable("(x:1 y:\"class\")", "x.{y}.simpleName", "Double");
		createContextAndTestVariable("(x:1 y:\"class\" z:\"simpleName\")", "x.{y}.{z}", "Double");
	}
	
	private void createContextAndTestVariable(String contextSource, String attributeSource, Object expected) throws RecognitionException {
		ExecutionContext context = new ExecutionContext(new VariableScope(buildNode(contextSource)));
		Attribute attribute = buildAttribute(attributeSource);
		
		assertTrue(attribute.getValue(context).equals(expected));
	}
}
