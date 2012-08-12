package richTea.impl;

import org.apache.commons.beanutils.BeanUtils;

import richTea.core.attribute.Attribute;
import richTea.core.execution.AbstractFunction;

public class CreateBean extends AbstractFunction {

	@Override
	protected void run() throws Exception {
		Object bean = createBean();
		
		context.setLastReturnValue(bean);
	}
	
	protected Object createBean() throws ClassNotFoundException, InstantiationException, IllegalAccessException {		
		Class<?> beanClass = getBeanClass();
		
		Object bean = instanciateBean(beanClass);
		
		mapBeanAttributes(bean, context.getCurrentNode().getAttributes());
		
		return bean;
	}
	
	protected Object instanciateBean(Class<?> beanClass) throws InstantiationException, IllegalAccessException {
		return beanClass.newInstance();
	}
	
	protected void mapBeanAttributes(Object bean, Attribute[] attributes) {
		for(Attribute attribute : attributes) {
			try {
				BeanUtils.setProperty(bean, attribute.getName(), attribute.getValue(context));
			} catch (Exception e) {
				log.warn("Unable to map bean property", e);
			}
		}
	}
	
	protected Class<?> getBeanClass() throws ClassNotFoundException {
		return getClass().getClassLoader().loadClass(context.getString("class"));
	}
}