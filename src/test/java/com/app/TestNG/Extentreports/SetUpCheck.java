package com.app.TestNG.Extentreports;

import java.io.File;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;


public class SetUpCheck {
	
	@Test
	public void extentdemo() {
		ExtentReports ex = new ExtentReports();
		File file = new File("report.html");
		ExtentSparkReporter sparkreporter = new ExtentSparkReporter(file);
		
		ex.attachReporter(sparkreporter);
		ex.flush();
		
	}

}
