package seleniumDemo3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DialogBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//div[@class='_3skCyB']/descendant::*[4]")).sendKeys("5748865998");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@class='JFPqaw']/child::*[1]")).click();
		

	}

}
