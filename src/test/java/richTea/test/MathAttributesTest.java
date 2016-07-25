package richTea.test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import richTea.runtime.attribute.Attribute;

public class MathAttributesTest extends RichTeaTestBase {
	
	@Test
	public void testAddition() {
		testAttributeValue("99 + 1", 100.0);
	}
	
	@Test
	public void testSubtraction() {
		testAttributeValue("99 - 1", 98.0);
	}
	
	@Test
	public void testMultiplcation() {
		testAttributeValue("12 * 12", 144.0);
	}
	
	@Test
	public void testDivision() {
		testAttributeValue("50 / 2", 25.0);
	}
	
	@Test
	public void testModulus() {
		testAttributeValue("100 % 2", 0.0);
		testAttributeValue("99 % 2", 1.0);
	}
	
	@Test
	public void testPlusEquals() {
		Attribute attribute = buildAttribute("0 += 2");
		
		assertTrue(attribute.getValue(null).equals(2.0));
		assertTrue(attribute.getValue(null).equals(4.0));
	}
	
	@Test
	public void testMinusEquals() {
		Attribute attribute = buildAttribute("0 -= 2");
		
		assertTrue(attribute.getValue(null).equals(-2.0));
		assertTrue(attribute.getValue(null).equals(-4.0));
	}
	
	@Test
	public void testMultiplyEquals() {
		Attribute attribute = buildAttribute("5 *= 2");
		
		assertTrue(attribute.getValue(null).equals(10.0));
		assertTrue(attribute.getValue(null).equals(20.0));
	}
	
	@Test
	public void testDivideEquals() {
		Attribute attribute = buildAttribute("100 /= 2");
		
		assertTrue(attribute.getValue(null).equals(50.0));
		assertTrue(attribute.getValue(null).equals(25.0));
	}
}
