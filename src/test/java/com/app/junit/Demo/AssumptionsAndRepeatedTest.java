package com.app.junit.Demo;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

public class AssumptionsAndRepeatedTest {
	
	@RepeatedTest(3)
	@DisplayName("Repeated Tests")
	public void repeatmeassage()  {
		
		System.out.println("We are learning JUnit");
	}
	
	@Test
	public void AssumptionsDemo() {
		boolean isDBServerUp = true;
		
		Assumptions.assumeTrue(isDBServerUp, "Server is up");
		
		System.out.println("Create table and insert data");
		
	}
}
