package com.app.TestNGScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion {
	
WebDriver driver;
	
	
	@BeforeClass
	public void openBrowser()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
	}
	
	
	@Test(priority='1')
	public void GetTitle()   
	{
		
		
		SoftAssert sf = new SoftAssert();
		
		String expectedtitle = "Your Store";
		String actualtitle = driver.getTitle();
		
		sf.assertEquals(actualtitle, expectedtitle, "The title donot match");
	   
	boolean searchbox =  driver.findElement(By.name("search")).isDisplayed();
	
	searchbox = true;
		
	sf.assertTrue(searchbox); 
	
	driver.findElement(By.name("search")).sendKeys("mac");
	
	driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg']")).click();
	
	sf.assertAll();
		
	}
}
