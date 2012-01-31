package at.makubi.first;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import at.makubi.first.beans.HelloBean;

public class Main {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("springbeans.xml");
		HelloBean bean = (HelloBean) context.getBean("helloBean");
		bean.greetMe();
	}

}
