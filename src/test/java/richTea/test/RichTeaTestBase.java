package richTea.test;

import static org.junit.Assert.assertEquals;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.impl.NoOpLog;
import org.apache.log4j.BasicConfigurator;

import richTea.compiler.CompilationResult;
import richTea.compiler.Compiler;
import richTea.runtime.attribute.Attribute;
import richTea.runtime.execution.ExecutionContext;
import richTea.runtime.execution.VariableScope;
import richTea.runtime.node.TreeNode;
import richTea.test.testLib.TestLibImportNode;

public class RichTeaTestBase {
	public RichTeaTestBase() {
		BasicConfigurator.configure();
		System.setProperty(Log.class.getName(), NoOpLog.class.getName()); // Disable logging (Used by the BeanUtils lib)
	}
	
	protected TreeNode buildNode(String input) {
		Compiler compiler = createTestLibCompiler(input);
		CompilationResult compilation = compiler.compile();
		
		return compilation.getProgram();
	}
	
	protected Attribute buildAttribute(String input) {
		Compiler compiler = createTestLibCompiler(input);
		Attribute attribute = compiler.compileAttribute();
		
		return attribute;
	}
	
	protected void testAttributeValue(String input, Object requiredValue) {
		testAttributeValue(input, requiredValue, null);
	}
	
	protected void testAttributeValue(String input, Object requiredValue, ExecutionContext context) {
		Object value = buildAttribute(input).getValue(context);
		
		assertEquals(requiredValue, value);
	}
	
	protected ExecutionContext buildExecutionContext(String input) {
		return new ExecutionContext(new VariableScope(buildNode(input)));
	}
	
	protected Compiler createTestLibCompiler(String source) {
		return createTestLibCompiler(new ANTLRStringStream(source));
	}
		
	protected Compiler createTestLibCompiler(CharStream source) {
		Compiler compiler = new Compiler(source);
		compiler.getNodeFactory().registerImportNode(new TestLibImportNode());
		
		return compiler;
	}
}
