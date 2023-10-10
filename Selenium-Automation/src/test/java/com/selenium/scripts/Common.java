package com.selenium.scripts;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

public class Common {
	
	@BeforeTest
	public void accessAmazonPortal() {
		System.out.println("Executing access Amazon portal method");
	}
	
	@BeforeClass
	public void login() {
		System.out.println("Executing Login method");
	}
	
	@AfterClass
	public void viewReceipt() {
		System.out.println("Executing View Receipt method");
	}
	
	@AfterTest
	public void logout() {
		System.out.println("Executing Logout method");
	}
		
}
