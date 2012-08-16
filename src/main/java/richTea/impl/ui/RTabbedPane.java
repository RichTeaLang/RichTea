package richTea.impl.ui;

import java.awt.Component;
import java.awt.Container;

import javax.swing.JTabbedPane;

public class RTabbedPane extends CreateAWTComponent {
	
	@Override
	protected void addContent(Container root, Component child) {
		JTabbedPane pane = (JTabbedPane) root;
		
		pane.addTab(child.getName(), child);
	}
}