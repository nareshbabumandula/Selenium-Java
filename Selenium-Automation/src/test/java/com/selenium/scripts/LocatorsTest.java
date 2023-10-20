package com.selenium.scripts;

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

public class LocatorsTest extends ActionEngine{

	WebDriver driver;

	public void highlightObject() {
		String javascriptBorder = "document.getElementById('user').style.border='2px solid red'";
		String javascriptBackground = "document.getElementById('user').style.background='yellow'"; 
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript(javascriptBorder);
		js.executeScript(javascriptBackground);
	}

	@Test
	public void locatorsMethods() throws InterruptedException {

		// Finding an object with linktext locator
		driver.findElement(By.linkText("Sample Forms")).click();

		// Absolute XPath  --> Always starts root or parent node with a preceding single slash
		driver.findElement(By.xpath("/html/body/div[3]/div[3]/form/table/tbody/tr/td/div/input")).click();
		Thread.sleep(1000);

		// Relative XPath --> Starts from the node of our choice with a preceding double slash
		driver.findElement(By.xpath("//tbody/tr[2]/td/input")).sendKeys("Test Subject");
		Thread.sleep(1000);

		// Relative XPath with attributes --> Syntax --> //html tag[@attribute='value']
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("shiva@gmail.com");
		Thread.sleep(1000);

		// Relative XPath with 'and' condition
		driver.findElement(By.xpath("//input[@name='q1' and @id='q1']")).sendKeys("Test Text");
		Thread.sleep(1000);

		// Relative XPath with 'or' condition 
		driver.findElement(By.xpath("//textarea[@name='q2' or @id='q2']")).sendKeys("Test Description");
		Thread.sleep(1000);
		// OR with | symbol
		//driver.findElement(By.xpath("//textarea[@name='q2'] | //textarea[@id='q2']")).sendKeys("Test Description");
		//Thread.sleep(1000);

		// Using ID locator with Select class
		WebElement dropdown = driver.findElement(By.id("q3"));
		selectValue(dropdown, "Option","Third Option");
		Thread.sleep(1000);

		// Using CSS Selector - Syntax --> html tag[attribute='value']
		driver.findElement(By.cssSelector("input[value='First Option']")).click();

		// CSS Selector --> Using # as a replacement for ID attribute
		//driver.findElement(By.cssSelector("input[id='q5']")).click();
		driver.findElement(By.cssSelector("input#q5")).click();

		// CSS Selector --> Using . as a replacement for class attribute
		driver.findElement(By.cssSelector("input.txt_log")).sendKeys("Nikhila");

		// CSS Selector with AND condition
		driver.findElement(By.cssSelector("input[name='checkbox6[]'][value='First Check Box']")).click();
		Thread.sleep(2000);

		// CSS Selector with OR condition and text attribute
		driver.findElement(By.cssSelector("input[text='Second Check Box'],[value='Second Check Box']")).click();

		// CSS Selector with OR condition and innertext attribute
		driver.findElement(By.cssSelector("input[innertext='Third Check Box'],[value='Third Check Box']")).click();

		// CSS Selector with starts-with method
		driver.findElement(By.cssSelector("input[value^='Fourth Check']")).click();

		// CSS Selector with ends-with method
		driver.findElement(By.cssSelector("input[value$='Check Box']")).click();

		// CSS Selector with ends-with method
		driver.findElement(By.cssSelector("input[value*='Fifth Che']")).click();

		// XPath with starts-with method
		driver.findElement(By.xpath("//input[starts-with(@value,'Fourth Check')]")).click();

		// XPath with contains method
		driver.findElement(By.xpath("//input[contains(@value,'Fourth Check')]")).click();

		// Identify the date text field using ID locator
		driver.findElement(By.id("q7")).sendKeys("10-19-2023");
		driver.findElement(By.id("q7")).sendKeys(Keys.TAB);
		
		// Select value from predefined state dropdown list
		WebElement predefinedstate = driver.findElement(By.id("q8"));
		selectValue(predefinedstate, "Predefined State", "IN");

		Thread.sleep(2000);
		// Select value from predefined country dropdown list
		WebElement predefinedCountry = driver.findElement(By.id("q9"));
		selectValue(predefinedCountry, "Predefined Country", "India");
		
		// Select value from predefined canadian provinces dropdown list
		WebElement predefinedProvinces = driver.findElement(By.id("q10"));
		selectValue(predefinedProvinces, "Predefined Canadian Provinces", "Ontario");
		
		
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
