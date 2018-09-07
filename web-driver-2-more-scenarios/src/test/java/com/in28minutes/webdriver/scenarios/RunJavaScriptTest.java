package com.in28minutes.webdriver.scenarios;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.in28minutes.webdriver.basics.AbstractChromeWebDriverTest;

public class RunJavaScriptTest extends AbstractChromeWebDriverTest {

	@Test
	public void testRunningOfJavaScript() throws IOException {
		
		driver.get("http://localhost:8080/pages/tables.html");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		String title = (String)js.executeScript("return document.title;");
		
		sleep(3);
		
		js.executeScript("window.scrollBy(0,200)");
		
		sleep(3);
		
		js.executeScript("window.scrollBy(0,200)");
		
		sleep(3);
		
		js.executeScript("window.scrollBy(0,200)");

		sleep(3);
		System.out.println(title);
		
	}
}
