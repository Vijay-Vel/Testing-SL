package seleniumDemo3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertCookies {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.opera.com/download");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//div[@class='cookie-consent__body'])[1]/descendant::*[5]")).click();
		

	}

}

