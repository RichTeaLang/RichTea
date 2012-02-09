package richTea.test;

import static org.junit.Assert.assertTrue;

import org.antlr.runtime.RecognitionException;
import org.junit.Test;

import richTea.core.attribute.Attribute;

public class MathAttributeTests extends RichTeaTestBase {
	
	@Test
	public void testAddition() throws RecognitionException {
		testAttributeValue("99 + 1", 100.0);
	}
	
	@Test
	public void testSubtraction() throws RecognitionException {
		testAttributeValue("99 - 1", 98.0);
	}
	
	@Test
	public void testMultiplcation() throws RecognitionException {
		testAttributeValue("12 * 12", 144.0);
	}
	
	@Test
	public void testDivision() throws RecognitionException {
		testAttributeValue("50 / 2", 25.0);
	}
	
	@Test
	public void testPlusEquals() throws RecognitionException {
		Attribute attribute = buildAttribute("0 += 2");
		
		assertTrue(attribute.getValue().equals(2.0));
		assertTrue(attribute.getValue().equals(4.0));
	}
	
	@Test
	public void testMinusEquals() throws RecognitionException {
		Attribute attribute = buildAttribute("0 -= 2");
		
		assertTrue(attribute.getValue().equals(-2.0));
		assertTrue(attribute.getValue().equals(-4.0));
	}
	
	@Test
	public void testMultiplyEquals() throws RecognitionException {
		Attribute attribute = buildAttribute("5 *= 2");
		
		assertTrue(attribute.getValue().equals(10.0));
		assertTrue(attribute.getValue().equals(20.0));
	}
	
	@Test
	public void testDivideEquals() throws RecognitionException {
		Attribute attribute = buildAttribute("100 /= 2");
		
		assertTrue(attribute.getValue().equals(50.0));
		assertTrue(attribute.getValue().equals(25.0));
	}

}
