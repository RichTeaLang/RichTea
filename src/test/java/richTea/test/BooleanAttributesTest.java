package richTea.test;

import org.junit.Test;

public class BooleanAttributesTest extends RichTeaTestBase {
	
	@Test
	public void testAndAttribute() {
		testAttributeValue("x:true && true", true);
		testAttributeValue("x:true && false", false);
		testAttributeValue("x:false && true", false);
		testAttributeValue("x:false && false", false);
	}
	
	@Test
	public void testOrAttribute() {
		testAttributeValue("x:true || true", true);
		testAttributeValue("x:true || false", true);
		testAttributeValue("x:false || true", true);
		testAttributeValue("x:false || false", false);
	}
	
	@Test
	public void testGreaterThanAttribute() {
		testAttributeValue("x:1 > 0", true);
		testAttributeValue("x:1 > 1", false);
		testAttributeValue("x:0 > 1", false);
	}
	
	@Test
	public void testGreaterThanOrEqualToAttribute() {
		testAttributeValue("x:1 >= 0", true);
		testAttributeValue("x:1 >= 1", true);
		testAttributeValue("x:0 >= 1", false);
	}
	
	@Test
	public void testLessThanOrEqualToAttribute() {
		testAttributeValue("x:1 <= 0", false);
		testAttributeValue("x:1 <= 1", true);
		testAttributeValue("x:0 <= 1", true);
	}
	
	@Test
	public void testLessThanAttribute() {
		testAttributeValue("x:1 < 0", false);
		testAttributeValue("x:1 < 1", false);
		testAttributeValue("x:0 < 1", true);
	}
	
	@Test
	public void testEqualsAttribute() {
		testAttributeValue("x:1 == 0", false);
		testAttributeValue("x:1 == 1", true);
		testAttributeValue("x:0 == 1", false);
		testAttributeValue("x:\"Hello\" == \"Hello\"", true);
		testAttributeValue("x:null == null", true);
		testAttributeValue("x:null == 1", false);
		testAttributeValue("x:1 == null", false);
	}
	
	@Test
	public void testNotEqualsAttribute() {
		testAttributeValue("x:1 != 0", true);
		testAttributeValue("x:1 != 1", false);
		testAttributeValue("x:0 != 1", true);
		testAttributeValue("x:\"Hello\" != \"Hello\"", false);
		testAttributeValue("x:null != null", false);
	}
	
	@Test
	public void testNotAttribute() {
		testAttributeValue("x:!true", false);
		testAttributeValue("x:!false", true);
	}
}
