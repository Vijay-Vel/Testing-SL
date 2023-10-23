package seleniumDemo3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://in.search.yahoo.com/");
		
		driver.findElement(By.xpath("(//div[@class='sbq-w'])/descendant::*[1]")).sendKeys("SimpliLearn");
		
		Thread.sleep(7000);
		
		List<WebElement> l1 = driver.findElements(By.xpath("//div[@class='sa-list-ctn']/descendant::li"));
		
		System.out.println(l1.size());
		
		for(int i=0;i<l1.size();i++) {
			
			String text = l1.get(i).getText();
			System.out.println(text);
		}

	}

}
