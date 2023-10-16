package com.selenium.scripts;

import org.testng.annotations.DataProvider;

public class TestData {
	
	@DataProvider(name = "empdata")
	public Object[][] getData() {
	  return new Object[][] {
	   { "Suma", "32" },
	   { "Nikhila", "31"},
	   {"Aryan", "20"}
	 };
	}

}
