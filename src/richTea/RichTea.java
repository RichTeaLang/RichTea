package richTea;

import java.io.IOException;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.FileAppender;
import org.apache.log4j.HTMLLayout;
import org.apache.log4j.Layout;
import org.apache.log4j.Logger;
import org.apache.log4j.spi.LoggingEvent;
import org.apache.log4j.xml.XMLLayout;

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
			log.addAppender(new FileAppender(new HTMLLayout(), "../output.html"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			BindingSet bindings = (BindingSet) loadRichTeaFile("./conf/bindings.tea", new BootstrapBindingSet());
			
			try {
				TreeNode programRoot = (TreeNode) loadRichTeaFile("./conf/program.tea", bindings);
				
				if(programRoot != null) {
					while(true) {
						long startTime = System.currentTimeMillis();
						
						new ExecutionContext().execute(programRoot);
						
						log.info(String.format("RichTea Execution took %s ms", System.currentTimeMillis() - startTime));
						
						startTime = System.currentTimeMillis();
						
						int x = 0;
						
						while(x < 100000) { 
							System.out.println(x);
							x++;
						}
						
						log.info(String.format("Java Execution took %s ms", System.currentTimeMillis() - startTime));
					}
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