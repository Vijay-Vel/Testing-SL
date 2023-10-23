package com.app.junit.Demo;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

@Disabled("Functionalty is not working, ignoring the tests")
public class DisabledTest {

	@Test
	public void method1() {
		
		System.out.println("Executing method 1");
	}
	
	@Test
	@Disabled
	public void method2() {
		
		System.out.println("Executing method 2");
	}
	
	@Test
	@Disabled
	public void method3() {
		
		System.out.println("Executing method 3");
		
	}
	
	@Test
	public void method4() {
		
		System.out.println("Executing method 4");
		
	}

}
