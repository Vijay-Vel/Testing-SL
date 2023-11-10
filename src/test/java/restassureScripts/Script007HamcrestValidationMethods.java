package restassureScripts;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

public class Script007HamcrestValidationMethods {
	
	@Test(priority='1')
	public void ValidateRepsonseBody()
	{
		String PMapikey = "Postman API key";
		given().baseUri("https://api.postman.com")
		.basePath("/workspaces")
		.header("X-API-Key", PMapikey)
		.when().get()
		.then().statusCode(200)
		.body("workspaces[4].id", equalTo("cc203ecf-b260-484f-b2ec-f9a9955b351a"),
			  "workspaces[4].name",equalTo("Workspace New-POST"),
			   "workspaces[4].type",equalTo("personal"));
		
		
	}
	
	@Test(priority='2')
	public void ValidateRepsonseBody_equlaTo()
	{
		
		given().baseUri("https://petstore.swagger.io")
		.basePath("/v2/user/Uname001")
		.when().get()
		.then().statusCode(200)
		.body("username", equalTo("Uname001"),
			  "email", equalTo("Positive@Attitude.com"),
			  "userStatus", equalTo(1));
		
		
	}
	
	
	@Test(priority='3')
	public void ValidateRepsonseBody_hasitems()
	{
		String PMapikey = "Postman API key";
		given().baseUri("https://api.postman.com")
		.basePath("/workspaces")
		.header("X-API-Key", PMapikey)
		.when().get()
		.then().statusCode(200)
		.body("workspaces.name", hasItems("Phase3-Lesson2-APITesting","Phase3-PostMan","My Workspace"),
				"workspaces.type", hasItems("personal"));
		
		
	}
}
