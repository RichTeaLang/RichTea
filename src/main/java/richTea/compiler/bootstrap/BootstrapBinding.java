package richTea.compiler.bootstrap;

import richTea.runtime.execution.EmptyFunction;
import richTea.runtime.execution.RichTeaFunction;
import richTea.runtime.node.TreeNode;

public class BootstrapBinding extends BindingNode {
	
	public BootstrapBinding(String name) {
		this(name, TreeNode.class, EmptyFunction.class);
	}
	
	public BootstrapBinding(String name, Class<? extends TreeNode> nodeClass) {
		this(name, nodeClass, EmptyFunction.class);
	}
	
	public BootstrapBinding(String name, Class<? extends TreeNode> nodeClass, Class<? extends RichTeaFunction> functionClass) {
		setName(name);
		setNodeClassName(nodeClass.getName());
		setFunctionClassName(functionClass.getName());
		
		try {
			initialize();
		} catch (ClassNotFoundException e) {
			throw new RuntimeException(e);
		}
	}
}