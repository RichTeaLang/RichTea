package richTea.impl.ui;

import javax.swing.JFrame;

import richTea.core.attribute.Attribute;
import richTea.impl.ui.event.RWindowListener;

public class RFrame extends CreateAWTComponent {

	@Override
	protected void mapBeanAttributes(Object bean, Attribute[] attributes) {
		JFrame frame = (JFrame) bean;
		
		frame.setSize(getWidth(), getHeight());
		frame.addWindowListener(new RWindowListener(context));
		frame.validate();
		
		super.mapBeanAttributes(frame, attributes);
	}
	
	protected int getWidth() {
		return (int) context.getNumberOrDefault("width", 800);
	}
	
	protected int getHeight() {
		return (int) context.getNumberOrDefault("height", 800);
	}
}