package richTea.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;

import richTea.runtime.attribute.Attribute;
import richTea.runtime.node.Branch;
import richTea.runtime.node.TreeNode;

public class BranchesTest extends RichTeaTestBase {
	
	@Test
	public void testNoBranch() {
		TreeNode node = buildNode("()");
		
		assertEquals(0, node.getBranches().length);
	}
	
	@Test
	public void testExplicitBranch() {
		TreeNode node = buildNode("( :branch {} )");
		
		assertEquals(1, node.getBranches().length);
	}
	
	@Test
	public void testDuplicateBranches() {
		TreeNode node = buildNode("( :branch {} :branch {} :branch {})");
		
		assertEquals(1, node.getBranches().length);
	}
	
	@Test
	public void testBranchName() {
		TreeNode node = buildNode("( :myBranch {})");
		
		assertTrue(node.hasBranch("myBranch"));
	}
	
	@Test
	public void testBranchGuard() {
		TreeNode node = buildNode("( :myBranch(false) {})");
		
		assertEquals(false, node.getBranch("myBranch").getGuard().getValue(null));
	}
	
	@Test
	public void testBranchAttributes() {
		TreeNode node = buildNode("( :myBranch |x, y:10| {})");
		List<Attribute> attributes = node.getBranch("myBranch").getAttributes();
		
		assertEquals(2, attributes.size());
		assertEquals("x", attributes.get(0).getName());
		assertEquals("y", attributes.get(1).getName());
		assertEquals(10, attributes.get(1).getValue(null));
	}
	
	@Test
	public void testBranchChildren() {
		TreeNode node = buildNode("( :myBranch { (); () })");
		Branch branch = node.getBranch("myBranch");
		
		assertEquals(2, branch.getChildren().length);
	}
}
