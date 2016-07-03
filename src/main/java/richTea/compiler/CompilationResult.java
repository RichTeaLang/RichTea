package richTea.compiler;

import java.util.List;

import richTea.compiler.bootstrap.ImportNode;
import richTea.runtime.node.TreeNode;

public class CompilationResult {
	
	private String source;
	private TreeNode program;
	private List<ImportNode> imports;
	
	public CompilationResult(String source, TreeNode program, List<ImportNode> imports) {
		this.source = source;
		this.program = program;
		this.imports = imports;
	}
	
	public String getSource() {
		return source;
	}
	
	public TreeNode getProgram() {
		return program;
	}
	
	public List<ImportNode> getImports() {
		return imports;
	}
}
