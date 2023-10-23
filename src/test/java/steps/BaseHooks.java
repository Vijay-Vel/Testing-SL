package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.BeforeStep;

public class BaseHooks {
	
	@BeforeAll
	public static void featurestarts()
	{
		System.out.println("The feature has started execution");
	}
	
	@AfterAll
	public static void featureends()
	{
		System.out.println("The feature has completed execution");
	}
	
	
	
	public static WebDriver driver;
	
	@Before(order=0,value="@login and @functional")  
	public void ConditionalHooks()
	{
		System.out.println("Task 1: Open the Chrome Browser");
		
		
	}
	
	@Before(order=0,value="@login or @functional")   
	public void ConditionalHooks1()
	{
		System.out.println("Task 1: Open the Chrome Browser");
		
		
	}
	
	@Before(order=0,value="not @login")  
	public void ConditionalHooks2()
	{
		System.out.println("Task 1: Open the Chrome Browser");
		
		
	}
	
	
	
	
	@Before(order=0,value="@functional")  
	public void OpenBrowser()
	{
		System.out.println("Task 1: Open the Chrome Browser");
		driver = new ChromeDriver();
		
	}
	
	@Before(order=1,value="@functional") 
	public void managebrowserwindow()
	{
		System.out.println("Task 2: Manage browser window");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
	}
	
	@Before(order=2,value="@functional") 
	public void openUrl()
	{
		System.out.println("Task 3: Enter URL");
		driver.get("https://en.wikipedia.org/w/index.php?title=Special:CreateAccount&returnto=Wikipedia%3ASign+up");
		
	}
	
	@BeforeStep
	public void stepstart()
	{
		System.out.println("The steps has started execution");
	}
	@AfterStep
	public void stepend()
	{
		System.out.println("The steps has completed execution");
	}
	
	@After(order=2,value="@functional")
	public void capturetitle()
	{
		System.out.println("Task 4: Capturetitle");
		System.out.println(driver.getTitle());
		
	}
	
	@After(order=1,value="@functional")
	public void closebrowser()
	{
		System.out.println("Task 5: browser is now closed");
		driver.close();
		
	}
	
	@After(order=0,value="@functional")
	public void Testcompletemessage()
	{
		System.out.println("Task 6: Test scenario is now completed");
	
		
	}
	

}
