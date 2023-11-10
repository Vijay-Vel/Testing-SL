package restassureScripts;

import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class Script006PostmanApiKeyDemo {
	
	@Test(priority='1')
	public void postmangetreq()
	{
		String PMapikey = "PMAK-65447eccf1f7d00038c23e3b-3111b494d8d9e645d19ab07e13eec77f30";
		given().baseUri("https://api.postman.com")
		.basePath("/workspaces")
		.header("X-API-Key", PMapikey)
		.when().get()
		.then().statusCode(200).log().all();
		
		
	}
	
	
	@Test(priority='2')
	public void extract_value_response()
	{
		String PMapikey = "PMAK-65447eccf1f7d00038c23e3b-3111b494d8d9e645d19ab07e13eec77f30";
		
		String responseoutput = given().baseUri("https://api.postman.com")
		.basePath("/workspaces")
		.header("X-API-Key", PMapikey)
		.when().get()
		.then()
		.extract().path("workspaces[1].name"); 
		
		System.out.println("The name of the workspace extracted is: " + responseoutput);
		
	}
	
	
	

	@Test(priority='3')
	public void extract_response_JSONPath()
	{
		String PMapikey = "PMAK-65447eccf1f7d00038c23e3b-3111b494d8d9e645d19ab07e13eec77f30";
		
		Response res = given().baseUri("https://api.postman.com")
		.basePath("/workspaces")
		.header("X-API-Key", PMapikey)
		.when().get()
		.then()
		.extract().response(); 
		
		JsonPath json = new JsonPath(res.asString());
		
		System.out.println(json.getString("workspaces[4]"));
		
	}

}
