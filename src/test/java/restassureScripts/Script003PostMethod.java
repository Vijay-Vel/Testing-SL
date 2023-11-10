package restassureScripts;

import java.util.HashMap;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class Script003PostMethod {
	
	@Test
	public void PostMethod() {
		
		HashMap<String, String> map = new HashMap<String, String> ();
		map.put("name","Steve");
		map.put("job", "Developer");
		
		RestAssured.
		given().baseUri("https://reqres.in/") 
		.basePath("/api/users") 
		.contentType("application/json")
		.body(map)
		.when().post()
		.then().statusCode(201)
		.log().all();
		
		
	}

}
