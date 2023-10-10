package com.selenium.scripts;

import org.testng.annotations.Test;

public class AmazonTest {

	@Test(priority = 7)
	public void proceedtoBuy() {
		System.out.println("Executing Proceed to Buy method");
	}
	
	@Test(priority = 2)
	public void accessAmazonPortal() {
		System.out.println("Executing access Amazon portal method");
	}
	
	@Test(priority = 3)
	public void login() {
		System.out.println("Executing Login method");
	}
	
	@Test(priority = 4)
	public void searchProduct() {
		System.out.println("Executing Search Product method");
	}
	
	@Test(priority = 12)
	public void closetheBrowser() {
		System.out.println("Executing Close the browser method");
	}
	
	@Test(priority = 5)
	public void addToCart() {
		System.out.println("Executing Add to Cart method");
	}
	
	@Test(priority = 6)
	public void checkout() {
		System.out.println("Executing Checkout method");
	}
		
	@Test(priority = 1)
	public void launchBrowser() {
		System.out.println("Executing launch browser method");
	}
	
	@Test(priority = 8)
	public void selectDeliveryAddress() {
		System.out.println("Executing Select Delivery Address method");
	}
	
	@Test(priority = 9)
	public void placeOrder() {
		System.out.println("Executing Place Order method");
	}
	
	@Test(priority = 10)
	public void viewReceipt() {
		System.out.println("Executing View Receipt method");
	}
	
	@Test(priority = 11)
	public void logout() {
		System.out.println("Executing Logout method");
	}
	
}