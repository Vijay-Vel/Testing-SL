package com.app.junit.Demo;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

public class ParameterizedDemoEnumSource {
	
	enum Values { 
		Selenium, Jmeter, Junit
	}
	
	@ParameterizedTest(name = "Enum Values {arguments}")
	@EnumSource(Values.class)
	public void passvaluesEnumSource(Object value) {
		System.out.println(value.toString());
		
	}

}
