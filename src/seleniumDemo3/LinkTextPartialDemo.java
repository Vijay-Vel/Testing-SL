package seleniumDemo3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTextPartialDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://en.wikipedia.org/w/index.php?title=Special:CreateAccount&returnto=Wikipedia%25253ASign+up");
		
		driver.findElement(By.linkText("Log in")).click();
		Thread.sleep(1500);
		
		driver.findElement(By.id("wpName1")).sendKeys("admin");
		
		driver.findElement(By.id("wpPassword1")).sendKeys("admin123");
		
		driver.findElement(By.id("wpRemember")).click();
		Thread.sleep(1500);
		
		driver.findElement(By.id("wpLoginAttempt")).click();
		Thread.sleep(1500);
		
		driver.findElement(By.partialLinkText("account")).click();
		
	}

}
