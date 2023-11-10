package restassureScripts;

import org.json.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class Script004PayLoadJSON {
	
	@Test
	public void postusingJSON()
	{
		
		JSONObject body = new JSONObject();
		body.put("name", "Ajay");
		body.put("salary", "4569");
		body.put("age", "37");
		
		RestAssured.given()
		.baseUri("https://dummy.restapiexample.com/api/v1")
		.contentType(ContentType.JSON)
		.body(body.toString())
		.when().post("/create")
		.then()
		.statusCode(200)
		.log().all();
		
		
		
		
	}

}
