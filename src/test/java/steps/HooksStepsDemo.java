package steps;

import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HooksStepsDemo {
	
	@Given("User is on Main page")
	public void user_is_on_main_page() {
	   
		System.out.println("Yes, user is on the main page");
	}

	@Then("User Enters username")
	public void user_enters_username() {
	   BaseHooks.driver.findElement(By.xpath("//input[@id='wpName2']")).sendKeys("admin");
	}

	@Then("User enters Password")
	public void user_enters_password() {
		BaseHooks.driver.findElement(By.xpath("//input[@id='wpPassword2']")).sendKeys("admin@123");
	}

	@When("User clicks on Login link")
	public void user_clicks_on_login_link() {
		BaseHooks.driver.findElement(By.xpath("(//span[text()='Log in'])[1]")).click();
	}

	@Then("User clicks on checkbox on login Page")
	public void user_clicks_on_checkbox_on_login_page() {
		BaseHooks.driver.findElement(By.xpath("//input[@name='wpRemember']")).click();
	}

	@Then("User clicks on Forgot your password? link")
	public void user_clicks_on_forgot_your_password_link() {
		BaseHooks.driver.findElement(By.xpath("//a[text()='Forgot your password?']")).click();
	}


}
