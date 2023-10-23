package seleniumDemo3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/");
	     
	     String title = driver.getTitle();
	     System.out.println("The title of the page is : " + title);
	     
	     String url = driver.getCurrentUrl();
	     
	     System.out.println("The URL of the page is : " + url);
		  
	     //driver.close();
	}

}
