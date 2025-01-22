package org.writepojo;

public class Root {
	
	private String name;
	
	private int age;
	
	private boolean status;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public Root(String name, int age, boolean status) {
		super();
		this.name = name;
		this.age = age;
		this.status = status;
	}
	
	

}
