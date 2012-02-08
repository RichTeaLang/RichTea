package richTea.test;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.antlr.runtime.RecognitionException;
import org.junit.Test;

import richTea.core.attribute.Attribute;
import richTea.core.attribute.FunctionAttribute;
import richTea.core.attribute.VariableAttribute;

public class AttributeTests extends NodeBuilderTestBase {
	
	@Test
	public void testCreateNumberAttribute() throws RecognitionException {
		 Attribute attribute = buildAttribute("x=1");
		   
		 assertTrue(attribute.getValue().equals(1.0));
	}
	
	@Test
	public void testCreateStringAttribute() throws RecognitionException {
		 Attribute attribute = buildAttribute("x=\"Hello world\"");
		   
		 assertTrue(attribute.getValue().equals("Hello world"));
	}
	
	@Test
	public void testCreateBooleanAttribute() throws RecognitionException {
		 Attribute attribute = buildAttribute("x=true");
		   
		 assertTrue(attribute.getValue().equals(true));
	}
	
	@Test
	public void testCreateTernaryAttribute() throws RecognitionException {
		Attribute attribute = buildAttribute("x=true ? false : true");
		
		assertTrue(attribute.getValue().equals(false));
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
}