package com.app.junit.Demo;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class BeforeAfterAllAnnotation {

	JavaOperations obj;
	
	@BeforeAll
	public void init() {
		
		System.out.println("Start DB connection");
		obj = new JavaOperations();
		System.out.println("Initializaion done...");
	}
	
	@AfterAll
	public void teardown() {
		
		System.out.println("close DB connection");
		
	}
	
	@Test
	public void test1() {
		
		
		System.out.println("1.Execute the test case using methods of .... JavaOperations");
		
	}
	
	@Test
	public void test2() {
		
		System.out.println("2.Execute the test case using methods of .... JavaOperations");
	}
}
