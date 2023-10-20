package com.runner;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;

import com.custom.listeners.CustomListener;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.selenium.scripts.Common;

@Listeners(CustomListener.class)
public class Base extends Common{

	public static ExtentReports reports;
	public static ExtentTest test;
	
	@BeforeSuite()
	public void launchBrowser() {
		reports = new ExtentReports(System.getProperty("user.dir") +"\\Extent Reports\\Automation Results.html", true);
		test = reports.startTest("Amazon Test");
		System.out.println("Executing launch browser method");
	}
	
	@AfterSuite()
	public void closetheBrowser() {
		System.out.println("Executing Close the browser method");
		reports.endTest(test);
		reports.flush();
	}
	
}
