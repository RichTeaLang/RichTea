package richTea;

import java.io.IOException;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.FileAppender;
import org.apache.log4j.HTMLLayout;
import org.apache.log4j.Logger;

import richTea.antlr.RichTeaLexer;
import richTea.antlr.RichTeaParser;
import richTea.antlr.RichTeaTreeAdaptor;
import richTea.antlr.tree.NodeData;
import richTea.core.execution.ExecutionContext;
import richTea.core.factory.RichTeaNodeFactory;
import richTea.core.factory.bindings.BindingSet;
import richTea.core.factory.bindings.BootstrapBindingSet;
import richTea.core.node.TreeNode;

public class RichTea {
	
	public static void main(String[] args) {
		new RichTea(args[0]);
	}
	
	protected Logger log;
	
	public RichTea(String programFile) {
		BasicConfigurator.configure();
		log = Logger.getLogger(getClass());
		try {
			log.addAppender(new FileAppender(new HTMLLayout(), "./output.html"));
		} catch (IOException e) {
			e.printStackTrace();
		}

		try {
			BindingSet bindings = (BindingSet) loadRichTeaFile("./conf/bindings.tea", new BootstrapBindingSet());
			
			try {
				TreeNode programRoot = (TreeNode) loadRichTeaFile(programFile, bindings);
				
				if(programRoot != null) {
					long startTime = System.currentTimeMillis();
					
					new ExecutionContext().execute(programRoot);
					
					log.info(String.format("RichTea Execution took %s ms", System.currentTimeMillis() - startTime));
				}
			}catch (IOException exception) {
				log.error("Unable to load program file", exception);
			}catch (RecognitionException exception) {
				log.error("Invalid RichTea code encountered in program", exception);
			}
		}catch (IOException exception) {
			log.error("Unable to load bindings file", exception);
		}catch (RecognitionException exception) {
			log.error("Invalid RichTea code encountered in bindings", exception);
		}
	}
	
	private TreeNode loadRichTeaFile(String fileName, BindingSet bindings) throws IOException, RecognitionException {
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