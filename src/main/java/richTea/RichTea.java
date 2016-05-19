package richTea;

import java.io.IOException;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.FileAppender;
import org.apache.log4j.HTMLLayout;
import org.apache.log4j.Logger;

import richTea.compiler.RichTeaLexer;
import richTea.compiler.RichTeaParser;
import richTea.compiler.antlr.RichTeaTreeAdaptor;
import richTea.compiler.antlr.tree.NodeData;
import richTea.compiler.bootstrap.BindingSet;
import richTea.compiler.bootstrap.BootstrapBindingSet;
import richTea.compiler.factory.RichTeaNodeFactory;
import richTea.runtime.execution.ExecutionContext;
import richTea.runtime.node.TreeNode;

public class RichTea {
	
	public static void main(String[] args) {
		new RichTea(args[0]);
	}
	
	protected Logger log;
	
	public RichTea(String programFile) {
		// Disable commons logging (Used by the BeanUtils lib)
		System.setProperty("org.apache.commons.logging.Log", "org.apache.commons.logging.impl.NoOpLog");
		 
		BasicConfigurator.configure();
		log = Logger.getLogger(getClass());
		try {
			log.addAppender(new FileAppender(new HTMLLayout(), "./output.html"));
		} catch (IOException e) {
			e.printStackTrace();
		}

		try {
			TreeNode programRoot = (TreeNode) loadRichTeaFile(programFile, new BindingSet[] { new BootstrapBindingSet() });
			
			if(programRoot != null) {
				long startTime = System.currentTimeMillis();
				
				new ExecutionContext().execute(programRoot);
				
				log.info(String.format("RichTea Execution took %s ms", System.currentTimeMillis() - startTime));
			}
		} catch (IOException exception) {
			log.error("Unable to load program file", exception);
		} catch (RecognitionException exception) {
			log.error("Invalid RichTea code encountered in program", exception);
		}
	}
	
	private TreeNode loadRichTeaFile(String fileName, BindingSet[] bindings) throws IOException, RecognitionException {
		log.info("Loading RichTea file " + fileName);
		
		long startTime = System.currentTimeMillis();
		
		ANTLRFileStream sourceFile = new ANTLRFileStream(fileName);
		RichTeaLexer lexer = new RichTeaLexer(sourceFile);
		RichTeaParser parser = new RichTeaParser(new CommonTokenStream(lexer));
		parser.setTreeAdaptor(new RichTeaTreeAdaptor());
		NodeData programData = (NodeData) parser.program().getTree();
		RichTeaNodeFactory nodeFactory = new RichTeaNodeFactory(bindings);
		TreeNode program = nodeFactory.create(programData);
		
		log.info(String.format("Load took %s ms", System.currentTimeMillis() - startTime));

		return program;
	}
}