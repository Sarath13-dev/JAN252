package org.loginrest;

import java.util.ArrayList;

import org.json.simple.JSONObject;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

//Serialization and Deserialization in RestAssured
//DataProvider in Rest Assured
public class Sample extends BaseClass{
	
	
	@BeforeMethod
	private void beforeMethod() {
		requestObject("https://reqres.in");
	}
	

//	@Test
//	private void tc0() {
//		
//		queryParameter("page", "2");
//		responseObject("GET", "api/users");
//		//Deserialization Approach
//		Root as = response.as(Root.class);
//		System.out.println(as.getPage());
//		System.out.println(as.getPer_page());
//		System.out.println(as.getTotal());
//		System.out.println(as.getTotal_pages());
//		ArrayList<Data> data = as.getData();
//		for(int i=0; i<data.size(); i++) {
//			Data data2 = data.get(i);
//			System.out.println(data2.getId());
//			System.out.println(data2.getFirst_name());
//			System.out.println(data2.getLast_name());
//			System.out.println(data2.getAvatar());
//			System.out.println(data2.getEmail());
//		}
//		
//		Support support = as.getSupport();
//		System.out.println(support.getUrl());
//		System.out.println(support.getText());
//	}
	
//	@Test
//	private void tc1() {
//		pathParmeter("id", "2");
//		responseObject("GET", "api/users/{id}");
//	}
//	
	
	
	
	@Test(dataProvider="SampleData")
	private void tc2(String key1, String value1, String key2, String value2 ) {
		JSONObject jsonObject = new JSONObject();
		jsonObject.put(key1, value1);
		jsonObject.put(key2, value2);
		attachPayload(jsonObject);
		responseObject("POST", "api/users");
	}
	
	
	@DataProvider(name="SampleData")
	private Object[][] dataProviderMethod(){
		return new Object[][] {
			{"name", "Ravi", "job", "Developer"},
			{"name", "Anand", "job", "QA"},
			{"name", "Babu", "job", "ScrumMaster"}
		};
	}
	
	
	
	
	
	
//	
//	@Test
//	private void tc3() {
//		pathParmeter("id", "2");
//		JSONObject jsonObject = new JSONObject();
//		jsonObject.put("name", "morpheous");
//		jsonObject.put("job", "zionResidant");
//		attachPayload(jsonObject);
//		responseObject("PUT", "api/users/{id}");
//	}
//	
//	@Test
//	private void tc4() {
//		pathParmeter("id", "2");
//		responseObject("DELETE", "api/users/{id}");
//	}
	
	@AfterMethod
	private void afterMethod() {
		responseCode();
		responseBody();
	}
	

}
