package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class TestHooksDemo {
	
	@Before(order = 0,value="@regression")
	public void setup()
	{
		System.out.println("Executing only regression scenarios");
		System.out.println("The feature sceanrio has started");
		System.out.println("The Author is Sonal Mittal");
		
	}
	@Before(order = 1,value="@db")
	public void Dbsetup()
	{
		System.out.println("Connect to DB");
	}
	
	// Suppose you have a feature file which has some scenarios, and after executing those scenarios if
		// you want to run this teardown() method then give @After annotation
		
	@After(order = 1,value="@db")
	public void DbClose()
	{
		System.out.println("Close the DB connection");
	}

	@After(order = 0,value="@regression")
	public void teardown()
	{
		
		System.out.println("The feature sceanrio has completed");
		
	}

}
