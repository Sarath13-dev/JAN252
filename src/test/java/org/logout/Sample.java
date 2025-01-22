package org.logout;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Sample {

	public static void main(String[] args) throws IOException {
		FileReader fileReader = new FileReader(new File("C:\\Users\\LENOVO\\newEclipseWorkspe\\Nov24API\\src\\test\\resources\\Read.json"));
		ObjectMapper objectMapper = new ObjectMapper();
		Root readValue = objectMapper.readValue(fileReader, Root.class);
		System.out.println(readValue.getName());
		System.out.println(readValue.getAge());
		System.out.println(readValue.isStatus());
		
		Address address = readValue.getAddress();
		System.out.println(address.getCity());
		System.out.println(address.getState());
		
		ArrayList<String> courses = readValue.getCourses();
		for(int i=0; i<courses.size(); i++) {
			System.out.println(courses.get(i));
		}
	}

}
