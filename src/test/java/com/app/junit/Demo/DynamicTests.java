package com.app.junit.Demo;

import java.util.Arrays;
import java.util.Collection;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

public class DynamicTests {
	
	@TestFactory
	Collection <DynamicTest> dynamicTest() {
		return Arrays.asList(
				DynamicTest.dynamicTest("Simple Test1", () -> Assertions.assertTrue(true)),
				DynamicTest.dynamicTest("Simple Test2", () -> Assertions.assertTrue(true)),
				DynamicTest.dynamicTest("Exception handling", () -> {throw new Exception("Exception dynamicTest");}),
				DynamicTest.dynamicTest("Simple Test2", () -> Assertions.assertTrue(true))
				
				);
		}
	}

