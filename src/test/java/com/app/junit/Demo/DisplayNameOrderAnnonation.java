package com.app.junit.Demo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class DisplayNameOrderAnnonation {
	
	@Order(4)
	@DisplayName("4. Sign In Button")
	@Test
	public void method1() {
		
		System.out.println("Testing Sign In Button");
	}
	
	@Order(1)
	@DisplayName("1. User Name field")
	@Test
	public void method2() {
		
		System.out.println("Testing User Name Field");
	}
	
	@Order(2)
	@DisplayName("2. Password Field")
	@Test
	public void method3() {
		
		System.out.println("Testing Password Field");
		
	}
	
	@Order(3)
	@DisplayName("3. Forget Password Field")
	@Test
	public void method4() {
		
		System.out.println("Testing Forget Password Field");
		
	}


}
