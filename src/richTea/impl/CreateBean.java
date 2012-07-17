package richTea.impl;

import org.apache.commons.beanutils.BeanMap;

import richTea.core.attribute.Attribute;
import richTea.core.execution.AbstractFunction;

public class CreateBean extends AbstractFunction {

	@Override
	protected void run() throws Exception {
		ClassLoader classLoader = getClass().getClassLoader();
		String className = getClassName();
		
		Class<?> beanClass = classLoader.loadClass(className);
		
		BeanMap beanMapper = new BeanMap(beanClass.newInstance());
		
		for(Attribute attribute : context.getCurrentNode().getAttributes()) {
			if(attribute.getName().equals("class")) continue;
			
			beanMapper.put(attribute.getName(), attribute.getValue(context));
		}
		
		context.setLastReturnValue(beanMapper.getBean());
	}
	
	protected String getClassName() {
		return context.getString("class");
	}
}