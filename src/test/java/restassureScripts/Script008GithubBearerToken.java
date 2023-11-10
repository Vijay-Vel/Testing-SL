package restassureScripts;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import io.restassured.response.Response;

public class Script008GithubBearerToken {
	
	@Test(priority='1')
	public void githubAuthorization() {
		
		Response res = given().baseUri("https://api.github.com")
		.basePath("/user/repos")
		.header("Authorization", "GitHub Token")
		.when().get()
		.then().statusCode(200)
		.extract().response();
		
		res.prettyPrint();
		
	}
	

	@Test(priority='2')
	public void Authorization_bearertoken_specificrepo()
	{
		
	Response res=	given().baseUri("https://api.github.com")
		.basePath("/repos/Vijay-Vel/Testing-SL")
		.header("Authorization","Bearer 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")
		.when().get()
		.then().statusCode(200)
		.extract().response();
	
		res.prettyPrint();
	}
}
