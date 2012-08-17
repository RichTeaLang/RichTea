package richTea.impl.ui;

import javax.swing.JFrame;

import richTea.core.attribute.Attribute;
import richTea.impl.ui.event.RWindowListener;

public class RFrame extends CreateAWTComponent {

	@Override
	protected void mapBeanAttributes(Object bean, Attribute[] attributes) {
		JFrame frame = (JFrame) bean;
		
		frame.setLayout(null);
		frame.addWindowListener(new RWindowListener(context));
		
		super.mapBeanAttributes(frame, attributes);
		
		frame.validate();
	}
}