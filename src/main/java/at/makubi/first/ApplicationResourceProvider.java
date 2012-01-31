package at.makubi.first;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class ApplicationResourceProvider implements ApplicationContextAware, BeanFactoryAware{
		
	private static ApplicationContext applicationContext;
	private static BeanFactory beanFactory;
	
	private ApplicationResourceProvider() {}

	public void setApplicationContext(ApplicationContext arg0)
			throws BeansException {
		applicationContext = arg0;
	}

	public void setBeanFactory(BeanFactory arg0) throws BeansException {
		beanFactory = arg0;
	}

	public static ApplicationContext getApplicationContext() {
		return applicationContext;
	}

	public static BeanFactory getBeanFactory() {
		return beanFactory;
	}

}
