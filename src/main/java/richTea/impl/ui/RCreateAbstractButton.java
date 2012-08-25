package richTea.impl.ui;

import java.util.HashMap;
import java.util.Map;

import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;

import richTea.impl.ui.event.RActionListener;

public class RCreateAbstractButton extends CreateAWTComponent {

	private static Map<String, ButtonGroup> buttonGroups = new HashMap<String, ButtonGroup>();
	
	@Override
	protected AbstractButton createBean() throws ClassNotFoundException, InstantiationException, IllegalAccessException {		
		AbstractButton button = (AbstractButton) super.createBean();
		
		button.addActionListener(new RActionListener(context));
		
		ButtonGroup buttonGroup = getButtonGroup();
		
		if(buttonGroup != null) {
			buttonGroup.add(button);
		}
		
		return button;
	}
	
	protected ButtonGroup getButtonGroup() {
		String groupName = context.getString("buttonGroup");
		ButtonGroup buttonGroup = null;
		
		if(groupName != null) {
			if(buttonGroups.containsKey(groupName)) {
				buttonGroup = buttonGroups.get(groupName);
			}else {
				buttonGroups.put(groupName, buttonGroup = new ButtonGroup());
			}
		}
		
		return buttonGroup;
	}
}
