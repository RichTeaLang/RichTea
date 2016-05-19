package richTea.runtime.node;

import richTea.runtime.attribute.PrimativeAttribute;
import richTea.runtime.resolver.BasicNodeResolver;
import richTea.runtime.resolver.Resolver;

public class DataNode extends TreeNode {
	
	protected BasicNodeResolver<DataNode> resolver;
	
	public DataNode() {
		resolver = new BasicNodeResolver<DataNode>();
		resolver.setContext(this);
	}
	
	public Resolver getResolver() {
		return resolver;
	}
	
	public void setValue(String key, Object value) {
		setAttribute(new PrimativeAttribute(key, value));
	}
}