package com.in28minutes.selenium.crossbrowser.framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowserFrameworkTest {
	
	WebDriver driver = null;
	
	@Parameters("browser")
	@BeforeTest
	public void before(@Optional("chrome") String browser) {
		if(browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if(browser.equals("firefox")){
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else {
			throw new RuntimeException("Does not support browser + " + browser);
		}		
	}
		
	@Test
	public void launchTablesPage() {
		// Launch a web page
		driver.get("http://localhost:8080/pages/tables.html");

	}
	
	@Test
	public void launchIndexPage() {
		// Launch a web page
		driver.get("http://localhost:8080/pages/index.html");

	}

	@AfterTest
	public void afterTest() {
		driver.quit();
	}
}
