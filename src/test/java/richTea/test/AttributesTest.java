package richTea.test;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;

import richTea.runtime.attribute.Attribute;
import richTea.runtime.attribute.VariableAttribute;
import richTea.runtime.attribute.function.ExecutableFunctionAttribute;
import richTea.runtime.attribute.function.FunctionAttribute;

public class AttributesTest extends RichTeaTestBase {
	
	@Test
	public void testAttributeName() {
		Attribute attribute = buildAttribute("attributeName:1");
		
		assertTrue(attribute.getName().equals("attributeName"));
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
		
		assertTrue(value instanceof List<?>);
		assertTrue(((List<?>) value).size() == 4);
	}
	
	@Test
	public void testVariableAttribute() {
		Attribute attribute = buildAttribute("x:var");
		
		assertTrue(attribute instanceof VariableAttribute);
	}
	
	@Test
	public void testFunctionAttribute() {
		Attribute attribute = buildAttribute("x:Scope()");
		
		assertTrue(attribute instanceof FunctionAttribute);
	}
	
	@Test
	public void testExecutableFunctionAttribute() {
		Attribute attribute = buildAttribute("x:@Scope()");
		
		assertTrue(attribute instanceof ExecutableFunctionAttribute);
	}
}
