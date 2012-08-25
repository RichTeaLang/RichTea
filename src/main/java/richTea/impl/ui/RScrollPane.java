package richTea.impl.ui;

import java.awt.Component;
import java.awt.Container;

import javax.swing.JScrollPane;

public class RScrollPane extends CreateAWTComponent {
	
	@Override
	protected void addContent(Container root, Component child) {
		JScrollPane scrollPane = (JScrollPane) root;
		scrollPane.setViewportView(child);
	}
}