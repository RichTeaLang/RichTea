package richTea.test;

import static org.junit.Assert.assertTrue;

import org.antlr.runtime.RecognitionException;
import org.junit.Test;

import richTea.core.node.TreeNode;

public class AttributeListTests extends NodeBuilderTestBase {
	
	@Test
	public void testAttributeList() throws RecognitionException {
		TreeNode node = buildNode("(x:1 y:2 z:3){}");
		
		assertTrue(node.getAttributes().length == 3);
		
	}
}
