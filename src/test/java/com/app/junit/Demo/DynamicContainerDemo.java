package com.app.junit.Demo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;
import org.junit.jupiter.api.DynamicContainer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DynamicNode;
import org.junit.jupiter.api.TestFactory;

public class DynamicContainerDemo {
	
		private List<String> createInputList()
		{
			return Arrays.asList("race","mom","dad","test");
		}
			
		@TestFactory
		public  Stream<DynamicNode> dynamictestwithDynamicContainer()
		{
			return createInputList().stream()
					.map(input ->
					    DynamicContainer.dynamicContainer("Container For " + input, Stream.of(
					    		
					    		dynamicTest("not Null", () -> Assertions.assertNotNull(input)),
					    		DynamicContainer.dynamicContainer("properties test", Stream.of(		
										dynamicTest("length > 0", () -> Assertions.assertTrue(input.length() > 0)),	
										dynamicTest("not empty", () -> Assertions.assertFalse(input.isEmpty()))
										
										))
						
								)));
					    	
				
					
		}
				
	}
