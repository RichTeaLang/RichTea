package richTea.compiler.bootstrap;

import richTea.runtime.execution.RichTeaFunction;
import richTea.runtime.node.TreeNode;

public class Binding {
	
	private String name;
	private ClassLoader classLoader;
	private BindingDefinition definition;
	private Class<? extends TreeNode> nodeClass;
	private Class<? extends RichTeaFunction> functionClass;
	
	public Binding(String name, ClassLoader classLoader, BindingDefinition definition) throws ClassNotFoundException {
		this.name = name;
		this.classLoader = classLoader;
		this.definition = definition;
		
		try {
			String className = definition.getNodeClassName();
			nodeClass = classLoader.loadClass(className).asSubclass(TreeNode.class);
		} catch (Exception e) {
			String message = String.format("Could not find node class for \"%s\" definition", getName());
			
			throw new ClassNotFoundException(message, e);
		}
		
		try {
			String className = definition.getFunctionClassName();
			functionClass = classLoader.loadClass(className).asSubclass(RichTeaFunction.class);
		} catch(Exception e) {
			String message = String.format("Could not find function class for \"%s\" definition", getName());
			throw new ClassNotFoundException(message, e);
		}
	}
	
	public String getName() {
		return name;
	}
	
	public ClassLoader getClassLoader() {
		return classLoader;
	}
	
	public BindingDefinition getDefinition() {
		return definition;
	}
	
	public Class<? extends TreeNode> getNodeClass() {
		return nodeClass;
	}
	
	public Class<? extends RichTeaFunction> getFunctionClass() {
		return functionClass;
	}
}
