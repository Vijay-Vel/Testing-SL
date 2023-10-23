package seleniumDemo3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickerCalanderDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize(); 
		
		driver.manage().deleteAllCookies(); 
		
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		
		driver.findElement(By.xpath("//input[contains(@id,'picker')]")).click();
		
		Thread.sleep(1500);
		
		String monthyear = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
		
		System.out.println(monthyear);
		
		String my[] = monthyear.split(" ");
		
		String month = my[0];  
		String year = my[1];   
		
		while(!(month.equals("August") && year.equals("2024")))
		{
			
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		
		monthyear = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
	
		month = monthyear.split(" ")[0];  
		year = monthyear.split(" ")[1];  
		}
		
		driver.findElement(By.xpath("//a[text()='14']")).click();

	}

}
