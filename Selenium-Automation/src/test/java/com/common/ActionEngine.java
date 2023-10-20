package com.common;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeSuite;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.runner.Base;

public class ActionEngine{
	
	public static ExtentReports reports;
	public static ExtentTest test;

	@BeforeSuite
	public void generateReport() {
		reports = new ExtentReports(System.getProperty("user.dir") +"\\Extent Reports\\Automation Results.html", true);
		test = reports.startTest("MyContactForm Automation");
	}
		
	public static void selectValue(WebElement locator, String object, String value) {
		try {
			Select select = new Select(locator);
			select.selectByVisibleText(value);
			test.log(LogStatus.PASS, "Select value from dropdown", "Successfully selected the value '" + value + "' from '" +object + "' dropdown");
		} catch (Exception e) {
			test.log(LogStatus.FAIL, "Select value from dropdown", "Failed to select the value '" + value + "' from '" +object + "' dropdown");
			e.printStackTrace();
		}
	}
	

}
