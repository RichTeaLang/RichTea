package richTea.impl.ui;

import java.util.List;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;

import richTea.impl.ui.event.RActionListener;

public class RComboBox extends CreateAWTComponent {
	
	@Override
	protected Object createBean() throws ClassNotFoundException, InstantiationException, IllegalAccessException {		
		JComboBox comboBox = (JComboBox) super.createBean();
		
		comboBox.addActionListener(new RActionListener(context));
		comboBox.setModel(new DefaultComboBoxModel(getModelData()));
		
		return comboBox;
	}
	
	protected Object[] getModelData() {
		List<?> data = (List<?>) context.getValue("data");
		
		return data.toArray(new Object[data.size()]);
	}
}