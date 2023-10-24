package com.selenium.scripts;

import java.time.Duration;
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


		// 5. Descendent : To identify the children and grandchildren including the context node
		String usernamelabel = driver.findElement(By.xpath("//div[@id='right_col_wrapper']/descendant-or-self::label")).getText();
		System.out.println("Label text found for the username field is : " + usernamelabel);

		List<WebElement> descendantorself = driver.findElements(By.xpath("//div[@id='right_col_wrapper']/descendant-or-self::label"));

		for (WebElement element : descendantorself) {
			System.out.println(element.getText());
			test.log(LogStatus.PASS, "Get Descendant-or-self", "Text attribute value is : " + element.getText());
		}

		// 6. Following : To find all the nodes that follow the context node.
		List<WebElement> following = driver.findElements(By.xpath("//label[@for='user']/following::input"));


		for (WebElement element : following) {
			System.out.println(element.getText());
			test.log(LogStatus.PASS, "Get Following", "Name attribute value is : " + element.getAttribute("name"));
		}
		
		// Click on Sample Forms tab
		driver.findElement(By.linkText("Sample Forms")).click(); 
		
		// 7. Following-sibling : To find all the nodes after the context node that share the same parent, and are a sibling to the context node.
		List<WebElement> followingDepartments = driver.findElements(By.xpath("//input[@value='0']/following-sibling::input"));

		for (WebElement element : followingDepartments) {
			System.out.println(element.getAttribute("value"));
			test.log(LogStatus.PASS, "Get Following-Sibling", "Value attribute value is : " + element.getAttribute("value"));
		}

		// 8. Preceding-sibling : To find all the nodes after the context node that share the same parent, and are a sibling to the context node.
		List<WebElement> precedingDepartments = driver.findElements(By.xpath("//input[@value='2']/preceding-sibling::input"));

		for (WebElement element : precedingDepartments) {
			System.out.println(element.getAttribute("value"));
			test.log(LogStatus.PASS, "Get Preceding-Sibling", "Value attribute value is : " + element.getAttribute("value"));
		}

		// 9. Preceding : It takes all the nodes that come before the context node. It may be the parent or the grandparent node. 
		driver.findElement(By.xpath("//input[@type='password']/preceding::input")).clear();
		driver.findElement(By.xpath("//input[@type='password']/preceding::input")).sendKeys("Suma");
		

		// 10. Parent : To find the parent element of the context node. If the context node itself is ancestor, it won’t have a parent node and would fetch no matching nodes.
		boolean parent = driver.findElement(By.xpath("//input[@id='q1']/parent::td")).isDisplayed();
		System.out.println("Parent object display status is : " + parent);
		test.log(LogStatus.PASS, "Get Parent Display Status", "Parent Object display status is : " + parent);
		
		// 11. Self : To find the context node, the self is used.
		boolean self = driver.findElement(By.xpath("//textarea[@id='q2']/self::textarea")).isDisplayed();
		System.out.println("Self object display status is : " + self);
		test.log(LogStatus.PASS, "Get Self Object Display Status", "Self Object display status is : " + self);
		
		List<WebElement> tabs = driver.findElements(By.xpath("//div[@id='header']/ul/li/a"));
		for (WebElement tab : tabs) {
			test.log(LogStatus.PASS, "Get tab name", "Tab name is : " + tab.getText());
		}
	}

	@BeforeClass
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.mycontactform.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

	@AfterClass
	public void closeBrowser() throws InterruptedException {
		Thread.sleep(4000);
		driver.quit();
		reports.endTest(test);
		reports.flush();
	}

}
