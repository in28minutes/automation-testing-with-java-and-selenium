package com.in28minutes.webdriver.scenarios;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import com.in28minutes.webdriver.basics.AbstractChromeWebDriverTest;

public class TakesScreenshotTest extends AbstractChromeWebDriverTest {

	@Test
	public void testFrames() throws IOException {
		
		driver.get("http://localhost:8080/pages/frames-example.html");
		
		//Operations
		
		File screenshot = ((TakesScreenshot)driver)
				.getScreenshotAs(OutputType.FILE);

		FileUtils.copyFile(screenshot,
				new File("./target/" + driver + "-screenshot.png"));
	}
}
