package richTea.impl.ui.event;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import richTea.core.execution.EventDispatcher;
import richTea.core.execution.ExecutionContext;

public class RItemListener extends EventDispatcher implements ItemListener {

	public RItemListener(ExecutionContext context) {
		super(context);
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		dispatchEvent("itemStateChanged", e);
				
		if(e.getStateChange() == ItemEvent.SELECTED) {
			dispatchEvent("itemSelected", e);
		} else if(e.getStateChange() == ItemEvent.DESELECTED) {
			dispatchEvent("itemDeselected", e);
		}
	}
}