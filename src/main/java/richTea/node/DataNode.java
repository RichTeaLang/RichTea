package richTea.node;

import richTea.attribute.PrimativeAttribute;
import richTea.resolver.BasicNodeResolver;
import richTea.resolver.Resolver;

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