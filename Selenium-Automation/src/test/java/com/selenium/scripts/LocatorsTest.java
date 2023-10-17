package com.selenium.scripts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;

public class LocatorsTest {

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
		
		// Relative XPath with 'and' operator
		driver.findElement(By.xpath("//input[@name='q1' and @id='q1']")).sendKeys("Test Text");
		Thread.sleep(1000);

		// Relative XPath with 'or' operator 
		driver.findElement(By.xpath("//textarea[@name='q2' or @id='q2']")).sendKeys("Test Description");
		Thread.sleep(1000);
										// OR with | symbol
		//driver.findElement(By.xpath("//textarea[@name='q2'] | //textarea[@id='q2']")).sendKeys("Test Description");
		//Thread.sleep(1000);
		
		// Using ID locator with Select class
		WebElement dropdown = driver.findElement(By.id("q3"));
		Select select = new Select(dropdown);
		select.selectByVisibleText("Third Option");	
		Thread.sleep(1000);
		
		// Using CSS Selector - Syntax --> html tag[attribute='value']
		driver.findElement(By.cssSelector("input[value='First Option']")).click();
				

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
	}

}
