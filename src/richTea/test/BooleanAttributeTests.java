package richTea.test;

import org.antlr.runtime.RecognitionException;
import org.junit.Test;

public class BooleanAttributeTests extends NodeBuilderTestBase {
	
	@Test
	public void testAndAttribute() throws RecognitionException {
		testAttribute("x=true && true", true);
		testAttribute("x=true && false", false);
		testAttribute("x=false && true", false);
		testAttribute("x=false && false", false);
	}
	
	@Test
	public void testOrAttribute() throws RecognitionException {
		testAttribute("x=true || true", true);
		testAttribute("x=true || false", true);
		testAttribute("x=false || true", true);
		testAttribute("x=false || false", false);
	}
	
	@Test
	public void testGreaterThanAttribute() throws RecognitionException {
		testAttribute("x=1 > 0", true);
		testAttribute("x=1 > 1", false);
		testAttribute("x=0 > 1", false);
	}
	
	@Test
	public void testGreaterThanOrEqualToAttribute() throws RecognitionException {
		testAttribute("x=1 >= 0", true);
		testAttribute("x=1 >= 1", true);
		testAttribute("x=0 >= 1", false);
	}
	
	@Test
	public void testLessThanOrEqualToAttribute() throws RecognitionException {
		testAttribute("x=1 <= 0", false);
		testAttribute("x=1 <= 1", true);
		testAttribute("x=0 <= 1", true);
	}
	
	@Test
	public void testLessThanAttribute() throws RecognitionException {
		testAttribute("x=1 < 0", false);
		testAttribute("x=1 < 1", false);
		testAttribute("x=0 < 1", true);
	}
	
	@Test
	public void testEqualsAttribute() throws RecognitionException {
		testAttribute("x=1 == 0", false);
		testAttribute("x=1 == 1", true);
		testAttribute("x=0 == 1", false);
		testAttribute("x=\"Hello\" == \"Hello\"", true);
	}
	
	@Test
	public void testNotEqualsAttribute() throws RecognitionException {
		testAttribute("x=1 != 0", true);
		testAttribute("x=1 != 1", false);
		testAttribute("x=0 != 1", true);
		testAttribute("x=\"Hello\" != \"Hello\"", false);
	}
	
	@Test
	public void testNotAttribute() throws RecognitionException {
		testAttribute("x=!true", false);
		testAttribute("x=!false", true);
	}
}