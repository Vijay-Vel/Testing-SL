package com.app.junit.Demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AssertionsJunitDemo {
	
	@Test
	public void testAssertions() {
		
		String expected = new String("abc");
		String actual = new String("abc");
		String str3 =  "junit";
		String str4 = null;
		String s1 = "vijay";
		String s2 = "vijay";
		int val1 = 20;
		int val2 = 12;
		
		Assertions.assertEquals(expected, actual);
		Assertions.assertTrue(val1>val2);
		Assertions.assertNotNull(str3);
		Assertions.assertNull(str4);
		Assertions.assertSame(s1, s2);
		//Assertions.assertNotSame(s1, s2);
		
		String [] array1 = {"one", "two", "three"};
		String [] array2 = {"one", "two", "three"};
		
		Assertions.assertArrayEquals(array1,array2);
		
	}

}
