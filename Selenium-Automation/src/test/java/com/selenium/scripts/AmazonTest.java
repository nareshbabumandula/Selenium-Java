package com.selenium.scripts;

import org.testng.annotations.Test;

import com.runner.Base;

public class AmazonTest extends Base{

	@Test(priority = 7)
	public void proceedtoBuy() {
		System.out.println("Executing Proceed to Buy method");
	}
		
	@Test(priority = 4)
	public void searchProduct() {
		System.out.println("Executing Search Product method");
	}
	
	@Test(priority = 5)
	public void addToCart() {
		System.out.println("Executing Add to Cart method");
	}
	
	@Test(priority = 6)
	public void checkout() {
		System.out.println("Executing Checkout method");
	}
		
	@Test(priority = 8)
	public void selectDeliveryAddress() {
		System.out.println("Executing Select Delivery Address method");
	}
	
	@Test(priority = 9)
	public void placeOrder() {
		System.out.println("Executing Place Order method");
	}
	
	
		
}
