package richTea.test;

import org.antlr.runtime.RecognitionException;
import org.junit.Test;

public class TestBooleanAttributes extends RichTeaTestBase {
	
	@Test
	public void testAndAttribute() throws RecognitionException {
		testAttributeValue("x=true && true", true);
		testAttributeValue("x=true && false", false);
		testAttributeValue("x=false && true", false);
		testAttributeValue("x=false && false", false);
	}
	
	@Test
	public void testOrAttribute() throws RecognitionException {
		testAttributeValue("x=true || true", true);
		testAttributeValue("x=true || false", true);
		testAttributeValue("x=false || true", true);
		testAttributeValue("x=false || false", false);
	}
	
	@Test
	public void testGreaterThanAttribute() throws RecognitionException {
		testAttributeValue("x=1 > 0", true);
		testAttributeValue("x=1 > 1", false);
		testAttributeValue("x=0 > 1", false);
	}
	
	@Test
	public void testGreaterThanOrEqualToAttribute() throws RecognitionException {
		testAttributeValue("x=1 >= 0", true);
		testAttributeValue("x=1 >= 1", true);
		testAttributeValue("x=0 >= 1", false);
	}
	
	@Test
	public void testLessThanOrEqualToAttribute() throws RecognitionException {
		testAttributeValue("x=1 <= 0", false);
		testAttributeValue("x=1 <= 1", true);
		testAttributeValue("x=0 <= 1", true);
	}
	
	@Test
	public void testLessThanAttribute() throws RecognitionException {
		testAttributeValue("x=1 < 0", false);
		testAttributeValue("x=1 < 1", false);
		testAttributeValue("x=0 < 1", true);
	}
	
	@Test
	public void testEqualsAttribute() throws RecognitionException {
		testAttributeValue("x=1 == 0", false);
		testAttributeValue("x=1 == 1", true);
		testAttributeValue("x=0 == 1", false);
		testAttributeValue("x=\"Hello\" == \"Hello\"", true);
	}
	
	@Test
	public void testNotEqualsAttribute() throws RecognitionException {
		testAttributeValue("x=1 != 0", true);
		testAttributeValue("x=1 != 1", false);
		testAttributeValue("x=0 != 1", true);
		testAttributeValue("x=\"Hello\" != \"Hello\"", false);
	}
	
	@Test
	public void testNotAttribute() throws RecognitionException {
		testAttributeValue("x=!true", false);
		testAttributeValue("x=!false", true);
	}
}