package richTea.impl.ui;

import java.awt.Container;

import richTea.core.attribute.Attribute;
import richTea.core.node.Branch;
import richTea.core.node.TreeNode;
import richTea.impl.CreateBean;
import richTea.impl.ui.event.RComponentListener;
import richTea.impl.ui.event.RContainerListener;
import richTea.impl.ui.event.RFocusListener;
import richTea.impl.ui.event.RKeyListener;
import richTea.impl.ui.event.RMouseListener;
import richTea.impl.ui.event.RMouseMotionListener;
import richTea.impl.ui.event.RMouseWheelListener;
import richTea.impl.ui.event.RPropertyChangeListener;

public class CreateAWTComponent extends CreateBean {
		
	@Override
	protected void mapBeanAttributes(Object bean, Attribute[] attributes) {
		Container component = (Container) bean;
		
		addContent(component);

		component.addComponentListener(new RComponentListener(context));
		component.addContainerListener(new RContainerListener(context));
		component.addFocusListener(new RFocusListener(context));
		component.addKeyListener(new RKeyListener(context));
		component.addMouseListener(new RMouseListener(context));
		component.addMouseMotionListener(new RMouseMotionListener(context));
		component.addMouseWheelListener(new RMouseWheelListener(context));
		component.addPropertyChangeListener(new RPropertyChangeListener(context));
		
		super.mapBeanAttributes(component, attributes);
	}
	
	protected void addContent(Container root) {
		Branch contentBranch = context.getCurrentNode().getBranch("content");
		
		if(contentBranch != null) {
			for(TreeNode contentNode : contentBranch.getChildren()) {
				Container content = (Container) context.execute(contentNode);
				
				root.add(content);
			}
		}
	}
}