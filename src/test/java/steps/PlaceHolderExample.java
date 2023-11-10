package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PlaceHolderExample {
	
	WebDriver driver;
	//@Given("I am on tutorialsNinja Homepage")	
	public void i_am_on_tutorials_ninja_homepage() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/index.php?route=common/home");     
	}

	//@Then("I click on myaccount link")
	public void i_click_on_myaccount_link() {
		
		    driver.findElement(By.xpath("//span[text()='My Account']")).click();
	}

	//@When("I click on login link")
	public void i_click_on_login_link() {
		driver.findElement(By.xpath("//a[text()='Login']")).click();
	}

	//@Then("I will on the login page and I capture the title of the page")
	public void i_will_on_the_login_page_and_i_capture_the_title_of_the_page() {
		System.out.println("title of the is page is : "+ driver.getTitle());

	}

	//@Then("I enter email id as {string} on the page")
	public void i_enter_email_id_as_on_the_page(String EmailId) {
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(EmailId);
	}

	//@Then("I enter password as {string} on the page")
	public void i_enter_password_as_on_the_page(String password) {
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys(password);

	}

	//@Then("I click login button")
	public void i_click_login_button() {
		driver.findElement(By.xpath("//input[@value='Login']")).click();

	}


}
