package at.makubi.first.beans;

import java.util.ArrayList;
import java.util.List;

public class GreetingBean {
	private List<String> greetings = new ArrayList<String>();
	
	public GreetingBean() {
		greetings.add("Hello");
		greetings.add("Welcome");
		greetings.add("Guten Tag");
		greetings.add("Nice to see you");
	}
	
	public String getGreeting(int num) {
		return greetings.get(num);
	}
}
