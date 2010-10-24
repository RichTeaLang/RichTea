package richTea;

import java.io.IOException;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.apache.log4j.BasicConfigurator;
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
		new RichTea();
	}
	
	protected Logger log;
	
	public RichTea() {
		BasicConfigurator.configure();
		log = Logger.getLogger(getClass());
		
		try {
			BindingSet bindings = (BindingSet) loadRichTeaFile("./conf/bindings.tea", new BootstrapBindingSet());
			
			TreeNode programRoot = (TreeNode) loadRichTeaFile("./conf/program.tea", bindings);
			
			if(programRoot != null) {
				long startTime = System.currentTimeMillis();
				
				new ExecutionContext().execute(programRoot);
				
				log.info(String.format("Execution took %s ms", System.currentTimeMillis() - startTime));
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