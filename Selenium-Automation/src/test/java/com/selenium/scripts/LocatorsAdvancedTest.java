package com.selenium.scripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.common.ActionEngine;
import com.relevantcodes.extentreports.LogStatus;

public class LocatorsAdvancedTest extends ActionEngine{

	WebDriver driver;

	@Test
	public void xpathAxesMethods() throws InterruptedException {
		
		// 1. ancestor : To identify the ancestor element from the context node.
		WebElement ancestorelement = driver.findElement(By.xpath("//input[@id='user']/ancestor::div"));
		String rootElementID = ancestorelement.getAttribute("id");
		System.out.println("Root element ID value is : " + rootElementID);
		test.log(LogStatus.PASS, "Get root element ID", "Root element ID value is : " + rootElementID);
					
		List<WebElement> ancestorElements = driver.findElements(By.xpath("//input[@id='user']/ancestor::div"));
		
		for (WebElement element : ancestorElements) {
			System.out.println(element.getAttribute("id"));
			test.log(LogStatus.PASS, "Get ancestor", "ID attribute value is : " + element.getAttribute("id"));
		}
		
		// 2. ancestor-or-self : To identify the context node and the ancestor element from the context node
		List<WebElement> ancestorsandSelf = driver.findElements(By.xpath("//div[@id='right_col_top']/ancestor-or-self::div"));
		
		for (WebElement element : ancestorsandSelf) {
			System.out.println(element.getAttribute("id"));
			test.log(LogStatus.PASS, "Get ancestor-or-self", "ID attribute value is : " + element.getAttribute("id"));
		}
		
		// 3. child : To identify the child of context node
		List<WebElement> child = driver.findElements(By.xpath("//div[@id='right_col_wrapper']/child::*"));
		
		for (WebElement element : child) {
			System.out.println(element.getAttribute("id"));
			test.log(LogStatus.PASS, "Get Child", "ID attribute value is : " + element.getAttribute("id"));
		}

		// 4. Descendent : To identify the children and grandchildren of the context node
		driver.findElement(By.xpath("//div[@id='right_col_wrapper']/descendant::input")).sendKeys("Nikhila");
		
		List<WebElement> descendant = driver.findElements(By.xpath("//div[@id='right_col_wrapper']/descendant::input"));
		
		for (WebElement element : descendant) {
			System.out.println(element.getAttribute("name"));
			test.log(LogStatus.PASS, "Get Descendant", "Name attribute value is : " + element.getAttribute("name"));
		}
		
		// Finding an object with linktext locator
		//driver.findElement(By.linkText("Sample Forms")).click();
	
		
	}

	@BeforeClass
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.mycontactform.com");
	}

	@AfterClass
	public void closeBrowser() throws InterruptedException {
		Thread.sleep(4000);
		driver.quit();
		reports.endTest(test);
		reports.flush();
	}

}
