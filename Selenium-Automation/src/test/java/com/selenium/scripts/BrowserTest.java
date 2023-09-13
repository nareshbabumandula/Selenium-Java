package com.selenium.scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserTest {

	static WebDriver driver;

	static void launchBrowser(String browser) throws InterruptedException {
		switch (browser.toLowerCase().trim()) {
		case "ie":
			System.setProperty("webdriver.ie.driver", "./drivers/iedriverserer.exe");
			driver = new InternetExplorerDriver();
			break;
		case "ff":
			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
			driver = new FirefoxDriver();
			break;
		case "chrome":
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			driver = new ChromeDriver();
			break;
		case "edge":
			System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
			driver = new ChromeDriver();
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
		launchBrowser("  CHROME  ");
	}

}
