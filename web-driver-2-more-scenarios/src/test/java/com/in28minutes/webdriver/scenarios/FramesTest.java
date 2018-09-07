package com.in28minutes.webdriver.scenarios;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.in28minutes.webdriver.basics.AbstractChromeWebDriverTest;

public class FramesTest extends AbstractChromeWebDriverTest {

	@Test
	public void testFrames() {
		driver.get("http://localhost:8080/pages/frames-example.html");
		
		driver.switchTo().frame(0);
		
		System.out.println(  
				"0 - " + driver.findElement(By.tagName("h1")).getText()
				);//0 - Frames Example Left
		
		//org.openqa.selenium.NoSuchFrameException: no such frame
		//driver.switchTo().frame(1);
		
		driver.switchTo().parentFrame();
		
		driver.switchTo().frame(1);
		
		System.out.println(  
				"1 - " + driver.findElement(By.tagName("h1")).getText()
				);//1 - Frames Example Right

		
	}
}
