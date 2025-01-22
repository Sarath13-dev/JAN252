package org.writepojo;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Sample {
	
	public static void main(String[] args) throws StreamWriteException, DatabindException, IOException {
		
		File f = new File("C:\\Users\\LENOVO\\newEclipseWorkspe\\Nov24API\\src\\test\\resources\\write.json");
		ObjectMapper objectMapper = new ObjectMapper();
		Root root = new Root("Ram Sarath", 32, true);
		objectMapper.writeValue(f, root);
		
	}
	
	

}
