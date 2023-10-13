package com.selenium.scripts;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class Common {
	
	@Parameters({"URL"})
	@BeforeTest(groups = {"smoke", "regression"})
	public void accessAmazonPortal(String URL) {
		System.out.println("Executing access Amazon portal method with URL - " + URL);
		Assert.assertEquals(true, true, "Expected value is not matched with the actual value");  // TestNG assertion
	}
	
	@BeforeClass(groups = {"smoke"})
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
	
	
	@BeforeMethod()
	public void verifyProduct() {
		System.out.println("Executing verify product method");
	}
	
	
	@AfterMethod
	public void verifyQuantity() {
		System.out.println("Executing verify quantity method");
	}
	
	
		
}
