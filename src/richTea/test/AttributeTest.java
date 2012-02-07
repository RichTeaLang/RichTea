package richTea.test;

import static org.junit.Assert.assertTrue;

import org.antlr.runtime.RecognitionException;
import org.junit.Test;

import richTea.core.attribute.Attribute;

public class AttributeTest extends NodeBuilderTestBase {
	
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
}