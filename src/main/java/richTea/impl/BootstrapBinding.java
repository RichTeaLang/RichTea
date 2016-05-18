package richTea.impl;

import richTea.execution.EmptyFunction;
import richTea.execution.RichTeaFunction;
import richTea.node.TreeNode;

public class BootstrapBinding extends Binding {
	
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