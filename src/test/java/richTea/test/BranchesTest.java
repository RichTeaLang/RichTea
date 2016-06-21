package richTea.test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import richTea.runtime.node.Branch;
import richTea.runtime.node.TreeNode;

public class BranchesTest extends RichTeaTestBase {
	
	@Test
	public void testNoBranch() {
		TreeNode node = buildNode("()");
		
		assertTrue(node.getBranches().length == 0);
	}
	
	@Test
	public void testExplicitBranch() {
		TreeNode node = buildNode("( #branch {} )");
		
		assertTrue(node.getBranches().length == 1);
	}
	
	@Test
	public void testDuplicateBranches() {
		TreeNode node = buildNode("( #branch {} #branch {} #branch {})");
		
		assertTrue(node.getBranches().length == 1);
	}
	
	@Test
	public void testBranchName() {
		TreeNode node = buildNode("( #myBranch {})");
		
		assertTrue(node.hasBranch("myBranch"));
	}
	
	@Test
	public void testBranchChildren() {
		TreeNode node = buildNode("( #myBranch { (); () })");
		Branch branch = node.getBranch("myBranch");
		
		assertTrue(branch.getChildren().length == 2);
	}
}
