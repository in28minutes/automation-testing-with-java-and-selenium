package com.in28minutes.selenium.crossbrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowserBasicsTest {
	@Test
	public void chromeBrowser() {
		// Chrome

		// Chrome Web Driver EXE
		WebDriverManager.chromedriver().setup();

		// WebDriver Interface - Create an instance of the web driver of the browser
		WebDriver driver = new ChromeDriver();

		// Launch a web page
		driver.get("http://localhost:8080/pages/tables.html");

		sleep(5);

		driver.quit();
	}
	
	@Test
	public void firefoxBrowser() {
		// Firefox

		// Firefox Web Driver EXE
		WebDriverManager.firefoxdriver().setup();

		// WebDriver Interface - Create an instance of the web driver of the browser
		WebDriver driver = new FirefoxDriver();

		// Launch a web page
		driver.get("http://localhost:8080/pages/tables.html");

		sleep(5);

		driver.quit();
	}

	@Test
	public void safariBrowser() {
		// Safari
		// Make sure you set Develop | Allow Remote Automation option from Safari's main
		// menu
		
		// Could not create a session: You must enable the 'Allow Remote Automation'
		// option in Safari's Develop menu to control Safari via WebDriver.

		// Safari Web Driver EXE
		//WebDriverManager.safaridriver().setup();

		// WebDriver Interface - Create an instance of the web driver of the browser
		WebDriver driver = new SafariDriver();

		// Launch a web page
		driver.get("http://localhost:8080/pages/tables.html");

		sleep(5);

		driver.quit();
	}
	
	@Test
	@Ignore
	public void ieBrowser() {
		
		WebDriverManager.iedriver().setup();

		// WebDriver Interface - Create an instance of the web driver of the browser
		WebDriver driver = new InternetExplorerDriver();

		// Launch a web page
		driver.get("http://localhost:8080/pages/tables.html");

		sleep(5);

		driver.quit();
	}


	@Test
	@Ignore
	public void edgeBrowser() {
		
		WebDriverManager.edgedriver().setup();

		// WebDriver Interface - Create an instance of the web driver of the browser
		WebDriver driver = new EdgeDriver();

		// Launch a web page
		driver.get("http://localhost:8080/pages/tables.html");

		sleep(5);

		driver.quit();
	}

	private void sleep(int i) {
		
		try {
			Thread.sleep(i * 1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
