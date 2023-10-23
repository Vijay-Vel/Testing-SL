package com.app.TestNG.Extentreports;


import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentreportDemo {
	
	@Test
	public void extentdemo() throws IOException {
		ExtentReports ex = new ExtentReports();
		File file = new File("report1.html");
		ExtentSparkReporter sparkreporter = new ExtentSparkReporter(file);
		ex.attachReporter(sparkreporter);
		
		ExtentTest test1 = ex.createTest("Test1");
		test1.pass("Test case passed");
		
		ExtentTest test2 = ex.createTest("Test2");
		
		test2.pass("test case2 passed");
		
		ExtentTest test3 = ex.createTest("Test3");
		test3.log(Status.FAIL, "This test has failed");
		
		ExtentTest test4 = ex.createTest("Test4");
		test4.skip("This test has skipped");
		
		ex.flush(); 
		Desktop.getDesktop().browse(new File("report1.html").toURI());
		
	}

}
