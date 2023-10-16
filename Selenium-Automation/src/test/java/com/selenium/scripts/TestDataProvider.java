package com.selenium.scripts;

import org.testng.annotations.Test;

public class TestDataProvider extends TestData{
	
	@Test(dataProvider = "empdata")
	public void Demo(String n1, String n2) {
		System.out.println("Name is : " + n1);
		System.out.println("Age is : " + n2);
	}

}
