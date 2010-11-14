package richTea.test;

import static org.junit.Assert.*;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.junit.Test;

import richTea.antlr.RichTeaLexer;
import richTea.antlr.RichTeaParser;
import richTea.antlr.RichTeaTreeAdaptor;
import richTea.antlr.tree.AttributeData;
import richTea.core.attribute.Attribute;
import richTea.core.factory.RichTeaAttributeFactory;
import richTea.core.factory.RichTeaNodeFactory;
import richTea.core.factory.bindings.BootstrapBindingSet;

public class AttributeTest {

	private RichTeaAttributeFactory factory;
	
	public AttributeTest() {
		factory = new RichTeaAttributeFactory(new RichTeaNodeFactory(new BootstrapBindingSet()));
	}
	
	@Test
	public void testCreateNumberAttribute() throws RecognitionException {
		 Attribute attribute = buildAttribute("x=1");
		   
		  assertTrue(attribute.getValue().equals(1.0));
	}
	
	@Test
	public void testCreateStringAttribute() throws RecognitionException {
		 Attribute attribute = buildAttribute("x=\"Hello world\"");
		   
		  assertTrue(attribute.getValue().equals("Hello world"));
	}
	
	@Test
	public void testCreateBooleanAttribute() throws RecognitionException {
		 Attribute attribute = buildAttribute("x=true");
		   
		  assertTrue(attribute.getValue().equals(true));
	}
	
	@Test
	public void testCreateTernaryAttribute() throws RecognitionException {
		Attribute attribute = buildAttribute("x=true ? false : true");
		
		assertTrue(attribute.getValue().equals(false));
	}
	
	protected Attribute buildAttribute(String input) throws RecognitionException {
	   	ANTLRStringStream source = new ANTLRStringStream(input);
		
		RichTeaLexer lexer = new RichTeaLexer(source);
		RichTeaParser parser = new RichTeaParser(new CommonTokenStream(lexer));
		parser.setTreeAdaptor(new RichTeaTreeAdaptor());
		
		AttributeData attributeData = (AttributeData) parser.attribute_list().getTree();
		
		return factory.create(attributeData);
	}
}