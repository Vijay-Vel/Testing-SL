package com.app.junit.Demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.platform.commons.util.StringUtils;

public class ParameterizedDemoValueSource {
	
	@ParameterizedTest(name = "checkblanks {arguments}")
	@ValueSource(strings = {"abc", "xyz", ""})
	@EmptySource
	public void checksblanks(String value) {
		Assertions.assertTrue(StringUtils.isBlank(value));
		System.out.println(value);
	}
	
	 @ParameterizedTest(name = "null source")
	 @NullSource
	 public void checkblanks2(String value) 
	 { 
		 Assertions.assertTrue(StringUtils.isBlank(value)); 
		 System.out.println(value);
	}
	 
	 
	 @ParameterizedTest(name = "null and Empty source")
	 @NullAndEmptySource
	 public void checkblanks3(String value) 
	 { 
		 Assertions.assertTrue(StringUtils.isBlank(value)); 
	
	}
	 

	@ParameterizedTest (name= "{index} - Run Test with arguments - {0}")
	@ValueSource(ints = {1,2,3,4,5})
	public void valueSourcedemo(int args) {
		System.out.println("The integer value is " +args);
	}
}
