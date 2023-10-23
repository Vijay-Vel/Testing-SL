package com.app.junit.Demo;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.EnumSource;

public class ArgumentConversionExplicit {
	
	@ParameterizedTest
	@EnumSource(TimeUnit.class)
	void testCaseWithExplicitArgumentConversion(
	        @ConvertWith(ToStringArgumentConverter.class) String argument) {
 
	    Assertions.assertNotNull(TimeUnit.valueOf(argument));
	    System.out.println(TimeUnit.valueOf(argument));
	}
}
