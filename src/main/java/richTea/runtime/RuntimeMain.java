package richTea.runtime;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CharStream;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.impl.NoOpLog;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

import richTea.compiler.CompilationResult;
import richTea.compiler.Compiler;
import richTea.runtime.attribute.AbstractAttribute;
import richTea.runtime.attribute.Attribute;
import richTea.runtime.attribute.AttributeSet;
import richTea.runtime.attribute.PrimativeAttribute;
import richTea.runtime.attribute.modifier.AttributeModifier;
import richTea.runtime.execution.ExecutionContext;
import richTea.runtime.node.TreeNode;

public class RuntimeMain {
	public static final String CWD_DIR_PROPERTY = "user.dir";
	
	public static void main(String[] args) throws Exception {
		if (args.length == 0) {
			throw new IllegalArgumentException("Path to RichTea file not specified");
		}
		File inputFile = new File(args[0]);
		args = Arrays.copyOfRange(args, 1, args.length); // Pass any additional arguments to the RichTea program
		
		RuntimeMain.main(inputFile.getParentFile().getAbsolutePath(), new FileInputStream(inputFile), args);
	}
	
	public static void main(InputStream programInput, String[] args) throws IOException {
		RuntimeMain.main(System.getProperty(CWD_DIR_PROPERTY), programInput, args);
	}
	
	public static void main(String cwd, InputStream programInput, String[] args) throws IOException {
		// Configure logging
		Logger log = Logger.getLogger(Runtime.class.getName());
		BasicConfigurator.configure();
		System.setProperty(Log.class.getName(), NoOpLog.class.getName()); // Disable logging (Used by the BeanUtils lib)
		System.setProperty(CWD_DIR_PROPERTY, cwd);
		
		log.info("Compiling RichTea file");
		
		CharStream input = new ANTLRInputStream(programInput, StandardCharsets.UTF_8.name());
		Compiler compiler = new Compiler(input);
		
		long compileStartTime = System.currentTimeMillis();
		
		CompilationResult compilation = compiler.compile();
		TreeNode program = compilation.getProgram();
		
		log.info(String.format("Compilation took %s ms", System.currentTimeMillis() - compileStartTime));
		log.info("Executing RichTea program...");
		
		long executeStartTime = System.currentTimeMillis();
		
		ExecutionContext context = new ExecutionContext();
		
		Attribute env = new PrimativeAttribute("env", new AttributeSet(
			new PrimativeAttribute("mainArgs", Arrays.asList(args)),
			new PrimativeAttribute("compilation", compilation),
			new CwdAttribute("cwd")
		));
		
		context.pushScope(context.createScope(env));
		context.execute(program);
		
		log.info(String.format("Execution completed in %s ms", System.currentTimeMillis() - executeStartTime));
	}
	
	private RuntimeMain() {}
}

class CwdAttribute extends AbstractAttribute {
	private File cwd;
	private File originalCwd;
	
	public CwdAttribute(String name) {
		super(name);
		
		originalCwd = new File(".").getAbsoluteFile();
		cwd = originalCwd;
	}

	@Override
	public Object getValue(ExecutionContext context) {
		return cwd;
	}
	
	@Override
	public Object modify(ExecutionContext context, AttributeModifier modifier) {
		Object value = super.modify(context, modifier);
		
		cwd = value == null ? originalCwd : new File(value.toString());
		
		if (!cwd.isDirectory()) {
			cwd = cwd.getParentFile().getAbsoluteFile();
		}
		
		System.setProperty(RuntimeMain.CWD_DIR_PROPERTY, cwd.getAbsolutePath());
		
		return value;
	}
}