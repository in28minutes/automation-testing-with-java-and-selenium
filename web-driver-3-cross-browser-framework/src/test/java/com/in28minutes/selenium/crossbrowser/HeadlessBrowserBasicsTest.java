package com.in28minutes.selenium.crossbrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HeadlessBrowserBasicsTest {

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
	public void chromeBrowserHeadlessBrowsing() {
		// Chrome

		// Chrome Web Driver EXE
		WebDriverManager.chromedriver().setup();

		ChromeOptions options = new ChromeOptions();
		options.setHeadless(true);
		
		// WebDriver Interface - Create an instance of the web driver of the browser
		WebDriver driver = new ChromeDriver(options);

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
	public void firefoxBrowserHeadlessBrowsing() {
		// Firefox

		// Firefox Web Driver EXE
		WebDriverManager.firefoxdriver().setup();
		
		FirefoxOptions options = new FirefoxOptions();
		options.setHeadless(true);

		// WebDriver Interface - Create an instance of the web driver of the browser
		WebDriver driver = new FirefoxDriver(options);

		// Launch a web page
		driver.get("http://localhost:8080/pages/tables.html");

		sleep(5);

		driver.quit();
	}

	@Test
	public void phanthomJS() {
		WebDriverManager.phantomjs().setup();

		WebDriver driver = new PhantomJSDriver();

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
