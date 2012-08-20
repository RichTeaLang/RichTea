package richTea.impl.ui;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.ItemSelectable;
import java.awt.Rectangle;

import richTea.core.attribute.Attribute;
import richTea.core.node.Branch;
import richTea.core.node.TreeNode;
import richTea.impl.CreateBean;
import richTea.impl.ui.event.RComponentListener;
import richTea.impl.ui.event.RContainerListener;
import richTea.impl.ui.event.RFocusListener;
import richTea.impl.ui.event.RItemListener;
import richTea.impl.ui.event.RKeyListener;
import richTea.impl.ui.event.RMouseListener;
import richTea.impl.ui.event.RMouseMotionListener;
import richTea.impl.ui.event.RMouseWheelListener;
import richTea.impl.ui.event.RPropertyChangeListener;

public class CreateAWTComponent extends CreateBean {
		
	@Override
	protected void mapBeanAttributes(Object bean, Attribute[] attributes) {
		Container component = (Container) bean;
		
		addContent(component, "content");
		
		component.setBounds(getBounds(component));
		
		component.addComponentListener(new RComponentListener(context));
		component.addContainerListener(new RContainerListener(context));
		component.addFocusListener(new RFocusListener(context));
		component.addKeyListener(new RKeyListener(context));
		component.addMouseListener(new RMouseListener(context));
		component.addMouseMotionListener(new RMouseMotionListener(context));
		component.addMouseWheelListener(new RMouseWheelListener(context));
		component.addPropertyChangeListener(new RPropertyChangeListener(context));
		
		// Listener support for a number of swing components
		if(component instanceof ItemSelectable) {
			((ItemSelectable) component).addItemListener(new RItemListener(context));
		}
		
		super.mapBeanAttributes(component, attributes);
	}
	
	protected Rectangle getBounds(Component component) {
		Dimension preferredSize = component.getPreferredSize();
		
		int x = (int) context.getNumberOrDefault("x", 0);
		int y = (int) context.getNumberOrDefault("y", 0);
		int width = (int) context.getNumberOrDefault("width", preferredSize.getWidth());
		int height = (int) context.getNumberOrDefault("height", preferredSize.getHeight());
		
		return new Rectangle(x, y, width, height);
	}
	
	protected void addContent(Container root, String contentBranchName) {
		Branch contentBranch = context.getCurrentNode().getBranch(contentBranchName);
		
		if(contentBranch != null) {
			addContent(root, contentBranch.getChildren());
		}
	}
	
	protected void addContent(Container root, TreeNode[] children) {
		for(TreeNode contentNode : children) {
			Container content = (Container) context.execute(contentNode);
			
			addContent(root, content);
		}
	}
	
	protected void addContent(Container root, Component child) {
		root.add(child);
	}
}