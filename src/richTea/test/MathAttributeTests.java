package richTea.test;

import static org.junit.Assert.assertTrue;

import org.antlr.runtime.RecognitionException;
import org.junit.Test;

import richTea.core.attribute.Attribute;

public class MathAttributeTests extends NodeBuilderTestBase {
	
	@Test
	public void testAddition() throws RecognitionException {
		Attribute attribute = buildAttribute("99 + 1");
		
		assertTrue(attribute.getValue().equals(100.0));
	}
	
	@Test
	public void testSubtraction() throws RecognitionException {
		Attribute attribute = buildAttribute("99 - 1");
		
		assertTrue(attribute.getValue().equals(98.0));
	}
	
	@Test
	public void testMultiplcation() throws RecognitionException {
		Attribute attribute = buildAttribute("12 * 12");
		
		assertTrue(attribute.getValue().equals(144.0));
	}
	
	@Test
	public void testDivision() throws RecognitionException {
		Attribute attribute = buildAttribute("50 / 2");
		
		assertTrue(attribute.getValue().equals(25.0));
	}

}
