package com.object.repository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	
	// Login Page Objects using Page Object Model Design Pattern
	public static By username = By.name("userName");
	public static By password = By.name("password");
	public static By submit = By.name("submit");
	
	
	// Login Page Objects using Page Factory Pattern
	@FindBy(name = "userName")
	public WebElement txtUsername;
	
	@FindBy(name = "password")
	public WebElement txtPassword;
	
	@FindBy(name = "submit")
	public WebElement btnSubmit;
	
	public void login() throws InterruptedException {
		txtUsername.sendKeys("Suma");
		txtPassword.sendKeys("Ignore123");
		//btnSubmit.click();
	}
	
	
	
}
