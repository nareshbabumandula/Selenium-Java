package com.runner;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import com.selenium.scripts.Common;

public class Base extends Common{

	@BeforeSuite()
	public void launchBrowser() {
		System.out.println("Executing launch browser method");
	}
	
	@AfterSuite()
	public void closetheBrowser() {
		System.out.println("Executing Close the browser method");
	}
	
}