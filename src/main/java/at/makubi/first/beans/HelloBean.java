package at.makubi.first.beans;

public class HelloBean {
	
	private String name;

	public void setName(String name) {
		this.name = name;
	}
	
	public void greetMe() {
		System.out.println("Hello "+name);
	}
}
