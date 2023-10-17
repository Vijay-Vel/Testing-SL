package com.app.junit.Demo;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.platform.suite.api.IncludeTags;

@IncludeTags("Production")
public class IncludeExcludeTags {
	
	@Test
	@Tag("development")
	public void devtest1() {
		
		System.out.println("Test case development 1");
	}
	
	@Test
	@Tag("development")
	public void devtest2() {
		
		System.out.println("Test case development 2");
	}
	
	@Test
	@Tag("QA")
	public void qatest1() {
		
		System.out.println("Test case QA 1");
	}
	
	@Test
	@Tag("QA")
	public void qatest2() {
		
		System.out.println("Test case QA 2");
}
	@Test
	@Tag("Production")
	public void prod1() {
		
		System.out.println("Test case Production 1");
	}
	
	@Test
	@Tag("Production")
	public void prod2() {
			
		System.out.println("Test case Production 2");
	
}
}