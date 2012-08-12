package richTea.impl.ui;

import java.awt.Container;

import richTea.core.attribute.Attribute;
import richTea.core.node.Branch;
import richTea.core.node.TreeNode;
import richTea.impl.CreateBean;
import richTea.impl.ui.event.RFocusListener;
import richTea.impl.ui.event.RKeyListener;
import richTea.impl.ui.event.RMouseListener;
import richTea.impl.ui.event.RMouseMotionListener;

public class CreateAWTComponent extends CreateBean {
		
	@Override
	protected void mapBeanAttributes(Object bean, Attribute[] attributes) {
		Container component = (Container) bean;
		
		addContent(component);

		component.addMouseListener(new RMouseListener(context));
		component.addKeyListener(new RKeyListener(context));
		component.addFocusListener(new RFocusListener(context));
		component.addMouseMotionListener(new RMouseMotionListener(context));
		
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