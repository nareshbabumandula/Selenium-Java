package com.selenium.scripts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class LocatorsTest {
	
  WebDriver driver;
	
  @Test
  public void locatorsMethods() throws InterruptedException {
	  // Absolute XPath  --> Always starts root or parent node with a preceding single slash
	  driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/form/fieldset/div/input")).sendKeys("Suma");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/form/fieldset/div/input")).clear();
	  
	  // Relative XPath --> Starts from the node of our choice with a preceding double slash
	  driver.findElement(By.xpath("//form/fieldset/div/input")).sendKeys("Nikhila");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//form/fieldset/div/input")).clear();
	  
	  
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
