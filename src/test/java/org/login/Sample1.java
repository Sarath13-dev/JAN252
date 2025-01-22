package org.login;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Sample1 {
	
	public static void main(String[] args) throws IOException, ParseException {
		FileReader fileReader = new FileReader(new File("C:\\Users\\LENOVO\\newEclipseWorkspe\\Nov24API\\src\\test\\resources\\Read1.json"));
		JSONParser jsonParser = new JSONParser();
		Object parse = jsonParser.parse(fileReader);
		JSONObject jsonObject = (JSONObject)parse;
		System.out.println(jsonObject.get("id"));
		System.out.println(jsonObject.get("name"));
		System.out.println(jsonObject.get("type"));
		
		Object object = jsonObject.get("image");
		JSONObject jsonObject2 = (JSONObject)object;
		System.out.println(jsonObject2.get("url"));
		System.out.println(jsonObject2.get("width"));
		System.out.println(jsonObject2.get("height"));
		
		Object object2 = jsonObject.get("thumbnail");
		JSONObject jsonObject3 = (JSONObject)object2;
		System.out.println(jsonObject3.get("url"));
		System.out.println(jsonObject3.get("width"));
		System.out.println(jsonObject3.get("height"));
		
	}

}
