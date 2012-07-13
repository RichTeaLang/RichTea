package richTea.core.attribute;

import java.lang.reflect.InvocationTargetException;

import org.apache.commons.beanutils.PropertyUtils;

import richTea.core.execution.ExecutionContext;

public class JavaBeanAttribute extends PrimativeAttribute {

	private Object bean;

	public JavaBeanAttribute(String name, Object bean) {
		super(name, null);
		
		this.bean = bean;	
	}
	
	public Object getBean() {
		return bean;
	}
	
	@Override
	public void setValue(Object value) {
		try {
			PropertyUtils.setSimpleProperty(getBean(), getName(), value);
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	public Object getValue(ExecutionContext context) {
		try {
			return PropertyUtils.getSimpleProperty(bean, getName());
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
}
