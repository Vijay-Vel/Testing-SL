package seleniumDemo3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://en.wikipedia.org/w/index.php?title=Special:CreateAccount&returnto=Wikipedia%25253ASign+up");
		
		boolean displayed = driver.findElement(By.id("wpName2")).isDisplayed();
		System.out.println("Element is Displayed ? " +displayed);
		
		boolean enabled = driver.findElement(By.id("wpName2")).isEnabled();
		System.out.println("Element is Displayed ? " +enabled);
		
		driver.findElement(By.id("wpName2")).sendKeys("admin");
		
		WebElement password = driver.findElement(By.id("wpPassword2"));
		
		displayed = password.isDisplayed();
		System.out.println("Element is Displayed ? " +displayed);
		
		enabled = password.isEnabled();
		System.out.println("Element is Displayed ? " +enabled);
		
		password.sendKeys("admin123");
		
		WebElement email = driver.findElement(By.name("email"));
		
		email.sendKeys("admin@gmail.com");
		
		
		

	}

}
