package com.selenium.scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.runner.Base;

public class AmazonTest extends Base{

		
	@Test(priority = 1, groups = {"smoke"})
	public void searchProduct() {
		System.out.println("Executing Search Product method");
	}
	
	@Test(priority = 2, groups = {"smoke"} )
	public void addToCart() {
		System.out.println("Executing Add to Cart method");
	}
	
	@Test(priority = 3)
	public void checkout() {
		System.out.println("Executing Checkout method");
	}
		
	@Test(priority = 4)
	public void proceedtoBuy() {
		System.out.println("Executing Proceed to Buy method");
	}
	
	@Test(dependsOnMethods = {"proceedtoBuy"})
	public void selectDeliveryAddress() {
		Assert.assertTrue(false,"Default delivery address is selected");
		System.out.println("Executing Select Delivery Address method");
	}
	
	@Test(dependsOnMethods = {"selectDeliveryAddress"})
	public void orderProduct() {
		System.out.println("Executing Place Order method");
	}
	
	@Test(dependsOnMethods = {"addToCart"}, enabled = true)
	public void verifyProductRating() {
		System.out.println("Executing verify Product Rating method");
	}
	
	
	
		
}
