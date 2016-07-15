package richTea.test;

import java.io.InputStream;

import org.antlr.runtime.ANTLRInputStream;
import org.junit.Assert;
import org.junit.Test;

import richTea.compiler.CompilationResult;
import richTea.compiler.Compiler;
import richTea.runtime.execution.ExecutionContext;
import richTea.test.testLib.TestLibImportNode;

public class ProgramTest {
	
	@Test
	public void testFunctionUsage() {
		executeProgram("test-function-usage.tea");
	}
	
	@Test
	public void testFirstClassFunctions() {
		executeProgram("test-first-class-functions.tea");
	}
	
	@Test
	public void testScope() {
		executeProgram("test-scope.tea");
	}
	
	protected void executeProgram(String resourcePath) {
		try {
			InputStream input = getClass().getClassLoader().getResourceAsStream(resourcePath);
			Compiler compiler = new Compiler(new ANTLRInputStream(input));
			compiler.getNodeFactory().registerImportNode(new TestLibImportNode());
			CompilationResult compilation = compiler.compile();
			Object lastReturnedValue = new ExecutionContext().execute(compilation.getProgram());
			Assert.assertEquals("Last returned value", "Test Completed", lastReturnedValue);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}
