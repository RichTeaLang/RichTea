package richTea.test;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.antlr.runtime.RecognitionException;
import org.junit.Test;

import richTea.core.attribute.Attribute;
import richTea.core.attribute.ExecutableFunctionAttribute;
import richTea.core.attribute.FunctionAttribute;
import richTea.core.attribute.VariableAttribute;

public class AttributeTests extends RichTeaTestBase {
	
	@Test
	public void testAttributeName() throws RecognitionException {
		Attribute attribute = buildAttribute("attributeName=1");
		
		assertTrue(attribute.getName().equals("attributeName"));
	}
	
	@Test
	public void testCreateNumberAttribute() throws RecognitionException {
		testAttributeValue("x=1", 1.0);
	}
	
	@Test
	public void testCreateStringAttribute() throws RecognitionException {
		testAttributeValue("x=\"Hello world\"", "Hello world");
	}
	
	@Test
	public void testCreateBooleanAttribute() throws RecognitionException {
		testAttributeValue("x=true", true);
		testAttributeValue("x=false", false);
	}
	
	@Test
	public void testCreateTernaryAttribute() throws RecognitionException {
		testAttributeValue("x=true ? false : true", false);
		testAttributeValue("x=false ? false : true", true);
	}
	
	@Test
	public void testListAttribute() throws RecognitionException {
		Attribute attribute = buildAttribute("x=[1,2,3,4]");
		
		Object value = attribute.getValue();
		
		assertTrue(value instanceof List<?>);
		assertTrue(((List<?>) value).size() == 4);
	}
	
	@Test
	public void testVariableAttribute() throws RecognitionException {
		Attribute attribute = buildAttribute("x=var");
		
		assertTrue(attribute instanceof VariableAttribute);
	}
	
	@Test
	public void testFunctionAttribute() throws RecognitionException {
		Attribute attribute = buildAttribute("x=Scope()");
				
		assertTrue(attribute instanceof FunctionAttribute);
	}
	
	@Test
	public void testExecutableFunctionAttribute() throws RecognitionException
	{
		Attribute attribute = buildAttribute("x=@Scope()");
		
		assertTrue(attribute instanceof ExecutableFunctionAttribute);
	}
}