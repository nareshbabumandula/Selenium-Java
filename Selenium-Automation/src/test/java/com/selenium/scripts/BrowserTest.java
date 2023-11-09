package com.selenium.scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserTest {

	static WebDriver driver;

	static void launchBrowser(String browser) throws InterruptedException {
		switch (browser.toLowerCase().trim()) {
		case "ie":
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
			break;
		case "ff":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		case "edge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;
		default:
			System.out.println("Invalid browser..!");
			break;
		}

		driver.get("https://www.mycontactform.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.quit();

	}

	public static void main(String[] args) throws InterruptedException {
		launchBrowser("chrome");
	}

}
