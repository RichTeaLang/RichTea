package richTea.core.node;

import java.util.HashMap;
import java.util.Map;

public class TreeNode extends FunctionNode {
		
	private TreeNode parent;
	
	private Map<String, Branch> branches;
	
	public TreeNode() {
		branches = new HashMap<String, Branch>();
	}
	
	public void initialize() {}
	
	public TreeNode getParent() {
		return parent;
	}
	
	public void setParent(TreeNode parent) {
		this.parent = parent;
	}
	
	public void setBranch(Branch branch) {			
		branches.put(branch.getName().toLowerCase(), branch);
		branch.setParent(this);
	}

	public boolean hasBranch(String name) {
		return branches.containsKey(name.toLowerCase());
	}
	
	public Branch getBranch(String name) {
		return branches.get(name.toLowerCase());
	}
	
	public Branch[] getBranches() {
		return branches.values().toArray(new Branch[branches.size()]);
	}
	
	public void removeBranch(Branch branch) {
		branches.remove(branch.getName().toLowerCase());
	}
}