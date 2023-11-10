package restassureScripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Script002GetMethod {

	@Test(enabled = false)
	public void  httpGetMethod() {
		
		Response res = RestAssured.get("https://reqres.in/api/users?page=2");
		
		System.out.println(res.getStatusCode());
		
		System.out.println(res.getBody().asString());
		
		System.out.println(res.getTime());
		
		System.out.println(res.getHeader("Content-Type"));
		
		int expectedstatuscode = 200;
		int Actualstatuscode  = res.getStatusCode();
		
		Assert.assertEquals(expectedstatuscode, Actualstatuscode);
}
	
	@Test
	public void GetMethodBDDstyle() {
		
		RestAssured
		.given()
		.baseUri("https://reqres.in/api/users")
		.queryParam("page",2)
		.when().get()
		.then()
		.statusCode(200)
		.log()
		.all()
		;
	}
}