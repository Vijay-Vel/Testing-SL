package seleniumDemo3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsCheckBoxes {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.ironspider.ca/forms/checkradio.htm");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//blockquote[@class='Example'])[1]/descendant::input[1]")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//blockquote[@class='Example'])[1]/descendant::input[2]")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//blockquote[@class='Example'])[1]/descendant::input[3]")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//blockquote[@class='Example'])[1]/descendant::input[4]")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//blockquote[@class='Example'])[1]/descendant::input[5]")).click();

	}

}
