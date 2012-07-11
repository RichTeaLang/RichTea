package richTea.impl.ui;

import javax.swing.JFrame;

import org.apache.commons.beanutils.BeanMap;

import richTea.core.attribute.Attribute;
import richTea.core.execution.AbstractFunction;
import richTea.impl.ui.event.RWindowListener;

public class RFrame extends AbstractFunction {

	@Override
	protected void run() throws Exception {
		JFrame frame = new JFrame();
		
		frame.setSize(getWidth(), getHeight());
		
		frame.addWindowListener(new RWindowListener(context));
		
		context.setLastReturnValue(frame);
		context.executeBranch("content");

		BeanMap beanMap = new BeanMap(frame);
		
		for(Attribute attribute : context.getCurrentNode().getAttributes()) {
			beanMap.put(attribute.getName(), attribute.getValue(context));
		}
		
		frame.validate();
	}
	
	protected String getTitle() {
		return context.getString("title");
	}
	
	protected int getWidth() {
		return (int) context.getNumberOrDefault("width", 800);
	}
	
	protected int getHeight() {
		return (int) context.getNumberOrDefault("height", 800);
	}

}
