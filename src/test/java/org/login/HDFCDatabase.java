package org.login;

import java.io.File;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.io.FileUtils;

public class HDFCDatabase {
	//Local variable  - method 
	//instance(object) variable - objectname.variablename
	//static variable(class) - classname.variablenme
	
	//instance methods - objname.methodname
	//static methods - classname.methodname
	
	Map<String, Integer> m;
	
	private String username;
	
	private int password;
	
	private int balance;
	
	public void setUsername(String a) {
		if(a.equals("Ravi@123")) {
			this.username="Ravi Username";
		}
		else if(a.equals("Babu@123")) {
			this.username="Babu Username";
		}
		else if(a.equals("Anand@123")) {
			this.username="Anand Username";
		}
		else {
			this.username="Invalid Username";
		}
	}
	
	public void setPassword(int b) {
		if(b == 111) {
			this.password=1;
		}
		else if(b == 222) {
			this.password = 2;
		}
		else if(b == 333) {
			this.password = 3;
		}
		else {
			this.password =0;
		}
	}
	
	public void setBalance(int c) {
		if(this.username.equals("Ravi Username") && this.password == 1) {
			this.balance = m.get("Ravi");
		}
		else if(this.username.equals("Babu Username") && this.password == 2) {
			this.balance=m.get("Babu");
		}
		else if(this.username.equals("Anand Username") && this.password == 3) {
			this.balance = m.get("Anand");
		}
		else { 
			this.balance=0;
		}
	}
	
	public String getUsername() {
		return username;
	}
	
	public int getPassword() {
		return password;
	}
	
	public int getBalance() {
		return balance;
	}
	
	public void readData() throws IOException {
		 m = new LinkedHashMap();
		File f = new File("C:\\Users\\LENOVO\\newEclipseWorkspe\\Nov24API\\src\\test\\resources\\HDFCDatabase.txt");
		List<String> readLines = FileUtils.readLines(f);//Deprecated method
		String firstUser = readLines.get(0);//Ravi@123,111,10000
		String secondUser = readLines.get(1);//Babu@123,222,20000
		String thirdUser = readLines.get(2);//Anand@123,333,30000
		String[] split = firstUser.split(",");
		String[] split2 = secondUser.split(",");
		String[] split3 = thirdUser.split(",");
		m.put("Ravi", Integer.parseInt(split[2]));
		m.put("Babu", Integer.parseInt(split2[2]));
		m.put("Anand", Integer.parseInt(split3[2]));
		System.out.println(m);
System.out.println("Work Done by Dev");
System.out.println("Developer Work");
		System.out.println("Work Done by Qa");
		System.out.println("QA Work");

			
	}
	
	
}
