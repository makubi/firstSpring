package at.makubi.first.beans;

public class HelloBean {
	
	private GreetingBean greeting;
	
	private String name;

	public void setName(String name) {
		this.name = name;
	}
	
	public void setGreeting(GreetingBean greetingBean) {
		this.greeting = greetingBean;
	}
	
	public void greetMe() {
		int greetingNum = name.charAt(0) % 4;
		System.out.println(this.greeting.getGreeting(greetingNum)+" "+name);
	}
}
