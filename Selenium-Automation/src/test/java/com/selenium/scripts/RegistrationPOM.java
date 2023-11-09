package com.selenium.scripts;

import org.testng.annotations.Test;

import com.object.repository.LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;

public class RegistrationPOM {

	WebDriver driver;
	LoginPage lp;

	@Test(priority = 3)
	public void verifyLogin() {
		// Selenium WebDriver code without using Page Object
		driver.findElement(By.name("userName")).sendKeys("Nikhila");
		driver.findElement(By.name("password")).sendKeys("Secure*12");
		driver.findElement(By.name("submit")).click();
	}
	
	@Test(priority = 2)
	public void verifyPOMLogin() throws InterruptedException {
		// Selenium WebDriver code with using Page Object
		driver.findElement(lp.username).sendKeys("Nikhila");
		driver.findElement(lp.password).sendKeys("Secure*12");
		Thread.sleep(1000);
		driver.findElement(lp.submit).click();
	}

	@Test(priority = 1)
	public void verifyRegistration() {
		driver.findElement(By.linkText("REGISTER")).click();
	}
	
	@Test(priority = 4)
	public void testLogin() throws InterruptedException  {
		LoginPage pf = PageFactory.initElements(driver, LoginPage.class);
		pf.txtUsername.sendKeys("Naresh");
		pf.txtPassword.sendKeys("Testing*123");
		//pf.btnSubmit.click();
		//pf.login();
	}
	
	
	@BeforeClass
	public void accessSite() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/newtours/index.php");
	}

	@AfterClass
	public void closeBrowser() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}

}
