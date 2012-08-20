package richTea.impl.ui;

import java.awt.Container;

import javax.swing.JSplitPane;

import richTea.core.node.TreeNode;

public class RSplitPane extends CreateAWTComponent {
	
	@Override
	protected void addContent(Container root, TreeNode[] children) {
		if(children.length == 2) {
			JSplitPane pane = (JSplitPane) root;
			
			pane.setLeftComponent((Container) context.execute(children[0]));
			pane.setRightComponent((Container) context.execute(children[1]));
		} else {
			throw new IllegalArgumentException("SplitPane must contain two children");
		}
	}
}