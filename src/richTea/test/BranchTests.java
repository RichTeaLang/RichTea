package richTea.test;

import static org.junit.Assert.assertTrue;

import org.antlr.runtime.RecognitionException;
import org.junit.Test;

import richTea.core.node.Branch;
import richTea.core.node.TreeNode;

public class BranchTests extends NodeBuilderTestBase {
	
	@Test
	public void testNoBranch() throws RecognitionException {
		TreeNode node = buildNode("()");
		
		assertTrue(node.getBranches().length == 0);
	}
	
	@Test
	public void testImplicitBranch() throws RecognitionException {
		TreeNode node = buildNode("(#{})");
		
		assertTrue(node.getBranches().length == 1);
	}
	
	@Test
	public void testExplicitBranch() throws RecognitionException {
		TreeNode node = buildNode("( #branch {} )");
		
		assertTrue(node.getBranches().length == 1);
	}
	
	@Test
	public void testMixedBranches() throws RecognitionException {
		TreeNode node = buildNode("( #{} #branch {} )");
		
		assertTrue(node.getBranches().length == 2);
	}
	
	@Test
	public void testDuplicateBranches() throws RecognitionException {
		TreeNode node = buildNode("( #branch {} #branch {} #branch {})");
		
		assertTrue(node.getBranches().length == 1);
	}
	
	@Test
	public void testBranchName() throws RecognitionException {
		TreeNode node = buildNode("( #myBranch {})");
		
		assertTrue(node.hasBranch("myBranch"));
	}
	
	@Test
	public void testBranchChildren() throws RecognitionException {
		TreeNode node = buildNode("( #myBranch { (); () })");
		
		Branch branch = node.getBranch("myBranch");
		
		
		assertTrue(branch.getChildren().length == 2);
	}

}
