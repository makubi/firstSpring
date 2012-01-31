package at.makubi.first.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HelloBean {
	
	@Autowired private GreetingBean greeting;
	
	private String name = "Unnamed";
	
	public void greetMe() {
		int greetingNum = name.charAt(0) % 4;
		System.out.println(this.greeting.getGreeting(greetingNum)+" "+name);
	}
}
