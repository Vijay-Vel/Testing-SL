package com.app.junit.Demo;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ParameterizedDemoMethodSource {
	
	@ParameterizedTest(name = "Method value {arguments}")
	@MethodSource("integerParameters")
	public void getdatafromMethod(int input) {
		
		System.out.println("The value form method is: "+input);
	}
		
	@ParameterizedTest(name = "Method value {arguments}")
	@MethodSource("stringParameters")
	public void getdatafromMethod1(String input1) {
			
		System.out.println("The value form method is: "+input1);
		
	}
	
	public static  Stream<String> stringParameters() {
		
		return Stream.of("Monday", "Tuesday", "Wednesday");
		
	}
	
	public static  Stream<Integer> integerParameters() {
		
		return Stream.of(1,2,3);
		
	}

}