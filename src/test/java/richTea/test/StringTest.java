package richTea.test;

import org.junit.Assert;
import org.junit.Test;

public class StringTest extends RichTeaTestBase {
	
	@Test
	public void testEmptyString() {
		testAttributeValue("\"\"", "");
	}
	@Test
	public void testSimpleString() {
		testAttributeValue("\"Simple string\"", "Simple string");
	}
	
	@Test
	public void testStringInterpolation() {
		testAttributeValue("\"Interpolated { true ? 10 : 0 } string\"", "Interpolated 10 string");
	}
	
	@Test
	public void testMultipleStringInterpolations() {
		testAttributeValue("\"Interpolated { true ? 10 : 0 } string { 10 + 10 }!\"", "Interpolated 10 string 20.0!");
	}
	
	@Test
	public void testEmptyInterpolation() {
		try {
			buildAttribute("\"Hello {} world\"");
			
			Assert.fail("Empty string interpolations are invalid");
		} catch (Exception e) {}
	}
	
	@Test
	public void testEscaping() {
		testAttributeValue("\"String with \\\"Nested quotes\\\" string\"", "String with \"Nested quotes\" string");
	}
}
