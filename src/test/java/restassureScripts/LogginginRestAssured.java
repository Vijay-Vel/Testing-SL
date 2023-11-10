package restassureScripts;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class LogginginRestAssured {
	
	@Test(priority='1')
	public void loggingmethods()
	{
		String PMapikey = "PMAK-65447eccf1f7d00038c23e3b-3111b494d8d9e645d19ab07e13eec77f30";
		given().baseUri("https://api.postman.com")
		.basePath("/workspaces")
		.header("X-API-Key", PMapikey)
		.when().get()
		//.then().statusCode(200).log().headers();
		//.then().log().ifError();
		//.then().statusCode(200).log().cookies();
		.then().statusCode(200).log().all();
		
		
	}

}
