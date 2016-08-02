package richTea.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;

import richTea.runtime.attribute.Attribute;
import richTea.runtime.attribute.function.FunctionAttribute;
import richTea.runtime.attribute.function.NodeReferenceAttribute;
import richTea.runtime.attribute.variable.LookupChainElement;

public class AttributesTest extends RichTeaTestBase {
	
	@Test
	public void testAttributeName() {
		Attribute attribute = buildAttribute("attributeName:1");
		
		assertEquals("attributeName", attribute.getName());
	}
	
	@Test
	public void testNullAttribute() {
		testAttributeValue("x:null", null);
	}
	
	@Test
	public void testCreateIntegerAttribute() {
		testAttributeValue("x:1", 1);
	}
	
	@Test
	public void testCreateDoubleAttribute() {
		testAttributeValue("x:1.2", 1.2);
		testAttributeValue("x:10.2", 10.2);
	}
	
	@Test
	public void testCreateFractionalDouble() {
		testAttributeValue("x:.5", 0.5);
		testAttributeValue("x:.123", 0.123);
	}
	
	@Test
	public void testSimpleCreateStringAttribute() {
		testAttributeValue("x:\"Hello world\"", "Hello world");
	}
	
	@Test
	public void testCreateBooleanAttribute() {
		testAttributeValue("x:true", true);
		testAttributeValue("x:false", false);
	}
	
	@Test
	public void testCreateTernaryAttribute() {
		testAttributeValue("x:true ? false : true", false);
		testAttributeValue("x:false ? false : true", true);
	}
	
	@Test
	public void testListAttribute() {
		Attribute attribute = buildAttribute("x:[1,2,3,4]");
		
		Object value = attribute.getValue(null);
		
		assertTrue(List.class.isAssignableFrom(value.getClass()));
		assertEquals(4, ((List<?>) value).size());
	}
	
	@Test
	public void testVariableAttribute() {
		Attribute attribute = buildAttribute("x:var");
		
		assertTrue(attribute instanceof LookupChainElement);
	}
	
	@Test
	public void testFunctionAttribute() {
		Attribute attribute = buildAttribute("x:Scope()");
		
		assertTrue(attribute instanceof FunctionAttribute);
	}
	
	@Test
	public void testNodeReferenceAttribute() {
		Attribute attribute = buildAttribute("x:@Scope()");
		
		assertTrue(attribute instanceof NodeReferenceAttribute);
	}
}
