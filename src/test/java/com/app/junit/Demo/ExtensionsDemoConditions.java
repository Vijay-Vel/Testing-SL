package com.app.junit.Demo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledForJreRange;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.api.condition.OS;

public class ExtensionsDemoConditions {
	
	@Test
	@EnabledOnOs(OS.WINDOWS)
	public void conditionOS() {
		
		System.out.println("Execute Test cases on Windows");
	}
	
	@Test
	@EnabledOnJre(JRE.JAVA_11)
	public void conditionJRE() {
		
		System.out.println("Execute Test cases on JAVA Version");
	}
	
	@Test
	@EnabledForJreRange(min = JRE.JAVA_11, max = JRE.JAVA_20)
	public void conditionJRERange() {
		
		System.out.println("Execute Test cases on machine with java version 11 to 20");
	}

}
