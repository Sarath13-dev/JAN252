package org.login;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Sample {

	public static void main(String[] args) throws IOException, ParseException {
		FileReader fileReader = new FileReader(new File("C:\\Users\\LENOVO\\newEclipseWorkspe\\Nov24API\\src\\test\\resources\\Read.json"));
		JSONParser jsonParser = new JSONParser();
		Object parse = jsonParser.parse(fileReader);
		//Java - Object - Supermost class in java, JSONObject - pre defined class
		JSONObject jsonObject = (JSONObject)parse;
		System.out.println(jsonObject.get("name"));
		System.out.println(jsonObject.get("age"));
		System.out.println(jsonObject.get("status"));
		
		//to read the values from the indirect pair
		Object object = jsonObject.get("address");
		//Type Casting - Down Casting from Object to JSONObject
		JSONObject jsonObject2 = (JSONObject)object;
		System.out.println(jsonObject2.get("state"));
		System.out.println(jsonObject2.get("city"));
		
		Object object2 = jsonObject.get("courses");
		//Object - Higher Order , JSONArray - LowerOrder
		JSONArray jsonArray = (JSONArray)object2;
		for(int i=0; i<jsonArray.size(); i++) {
			System.out.println(jsonArray.get(i));
		}
	}

}
