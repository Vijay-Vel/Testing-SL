package com.app.junit.Demo;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BeforeAfterEachAnnotation {
	
	JavaOperations obj;
	
	@BeforeEach
	public void init() {
		
		System.out.println("Start DB connection");
		obj = new JavaOperations();
		System.out.println("Initializaion done...");
	}
	
	@AfterEach
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
