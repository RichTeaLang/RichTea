package richTea.test;

import org.junit.Assert;
import org.junit.Test;

import richTea.runtime.node.TreeNode;

public class ParserTest extends RichTeaTestBase {
	
	private String[] implicitAttributes = {
		"", // no implicit attribute
		"[]", "[true]", "[true, false]", "[[true]]", // arrays
		"true", "false", // booleans
		"1", "10", "-1", "-10", // integers
		"1.0", "10.0", "-1.0", "-10.0", ".5", ".101", "-.5", "-.101", // doubles
		"\"\"", "\"hello\"", "\"hello world\"", "\"Hello { name } !\"", "\"{ name }\"",// strings
		"a", "a.b", "a.{ b }", "a.b(true)", "a.{ b.c() }" // variables
	};
	
	private String[] implicitBranches = {
		"", // No implicit branch
		":{}", ":(x == true) {}", ":(x == true) |a| {}", ":(x == true) |a, b, c:50| {}"
	};
	
	@Test
	public void parseFunctionTest() {
		for(String implicitAttribute : implicitAttributes) {
			for(String implicitBranch : implicitBranches) {
				String test = "Fn(" + implicitAttribute + " " + implicitBranch + ")";

				TreeNode node = buildNode(test);
				
				Assert.assertEquals(!implicitAttribute.equals(""), node.hasAttribute("a"));
				Assert.assertEquals(!implicitBranch.equals(""), node.hasBranch("b"));
			}
		}
	}
}
