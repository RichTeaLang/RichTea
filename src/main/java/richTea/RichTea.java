package richTea;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CharStream;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.FileAppender;
import org.apache.log4j.HTMLLayout;
import org.apache.log4j.Logger;

import richTea.compiler.RichTeaCompiler;
import richTea.compiler.bootstrap.BindingSet;
import richTea.compiler.bootstrap.BootstrapBindingSet;
import richTea.runtime.execution.ExecutionContext;
import richTea.runtime.node.TreeNode;

public class RichTea {
	
	public static void main(String[] args) throws Exception {
		new RichTea(args[0]);
	}
	
	protected Logger log;
	
	public RichTea(String programFile) throws Exception {
		// Disable commons logging (Used by the BeanUtils lib)
		System.setProperty("org.apache.commons.logging.Log", "org.apache.commons.logging.impl.NoOpLog");
		
		BasicConfigurator.configure();
		log = Logger.getLogger(getClass());
		log.addAppender(new FileAppender(new HTMLLayout(), "./output.html"));
		
		CharStream source = new ANTLRFileStream(programFile);
		BindingSet[] bindings = { new BootstrapBindingSet() };
		RichTeaCompiler compiler = new RichTeaCompiler(source, bindings);
		
		long compileStartTime = System.currentTimeMillis();
		log.info("Compiling RichTea file: " + programFile);
		
		TreeNode program = compiler.compile();
		
		log.info(String.format("Compilation took %s ms", System.currentTimeMillis() - compileStartTime));
		log.info("Executing RichTea program...");
		long executeStartTime = System.currentTimeMillis();
		
		new ExecutionContext().execute(program);
		
		log.info(String.format("Execution completed in %s ms", System.currentTimeMillis() - executeStartTime));
	}
}