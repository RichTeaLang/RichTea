package richTea.core.node;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import richTea.core.resolver.Resolver;
import richTea.core.resolver.TreeNodeResolver;

public class TreeNode extends ExecutableNode {
	
	private TreeNode parent;
	
	protected List<TreeNode> children;
	
	public TreeNode() {
		setID(UUID.randomUUID().toString());
		children = new ArrayList<TreeNode>();
	}
	
	@Override
	protected Resolver createResolver() {
		return new TreeNodeResolver(this);
	}
	
	public String getID() {
		return getString("id");
	}
	
	public void setID(String id) {
		setValue("id", id);
	}
	
	public TreeNode getParent() {
		return parent;
	}
	
	public void setParent(TreeNode parent) {
		if(parent != this) {
			this.parent = parent;
		}else {
			throw new IllegalArgumentException("Cannot make a node a parent of itself");
		}
	}

	public boolean addChild(TreeNode child) {
		if(!containsChild(child)) {
			child.setParent(this);
			
			children.add(child);
		}
		
		return containsChild(child);
	}
	
	public boolean containsChild(TreeNode child) {
		return children.contains(child);
	}
	
	public TreeNode getChildByID(String id) {
		TreeNode requestedChild = null;
		
		if(id != null) {
			for(TreeNode child : getChildren()) {
				if(id.equalsIgnoreCase(child.getID())) {
					requestedChild = child;
					break;
				}
			}
		}
		
		return requestedChild;
	}
	
	public TreeNode[] getChildren() {
		return children.toArray(new TreeNode[children.size()]);
	}
	
	public boolean removeChild(TreeNode child) {
		if(containsChild(child) && children.remove(child)) {
			child.setParent(null);
		}
		
		return containsChild(child);
	}
}