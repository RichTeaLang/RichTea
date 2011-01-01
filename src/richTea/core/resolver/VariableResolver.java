package richTea.core.resolver;

import richTea.core.attribute.Attribute;
import richTea.core.node.TreeNode;

public class VariableResolver<T extends TreeNode> extends BasicNodeResolver<T> {
	
	@SuppressWarnings("unchecked")
	@Override
	public Object getValue(String key) {
		Object value = super.getValue(key);
		
		if(value == null) {
			TreeNode context = getContext();
			TreeNode parent = context.getParent();
			
			while(parent != null && value == null) {
				setContext((T) parent);
				
				parent = parent.getParent();
				
				value = super.getValue(key);
			}
			
			setContext((T) context);
		}
		
		return value;
	}
	
	public Attribute getAttribute(String key) {
		Attribute attribute = getContext().getAttribute(key);
		
		if(attribute == null) {
			TreeNode parent = getContext().getParent();
			
			while(attribute == null && parent != null) {
				attribute = parent.getAttribute(key);
				
				parent = parent.getParent();
			}
		}
		
		return attribute;
	}
}
