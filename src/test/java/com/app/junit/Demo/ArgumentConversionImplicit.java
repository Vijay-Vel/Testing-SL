package com.app.junit.Demo;

import java.time.temporal.ChronoUnit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class ArgumentConversionImplicit {

	@ParameterizedTest
	@ValueSource(strings = "SECONDS")
	public void testwithImplicitArgumentConversion(ChronoUnit chronoUnit) {
		
		System.out.println(chronoUnit.name());
		Assertions.assertNotNull(chronoUnit.name());
		
	}
}
