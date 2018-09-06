package com.in28minutes.webdriver.basics;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class WebDriverBasicsLocatorsWithClassTest extends AbstractChromeWebDriverTest{
	
	@Test
	public void testTitle() {	
		driver.get("http://localhost:8080/pages/index.html");
		WebElement title = driver.findElement(By.className("navbar-brand"));
		assertEquals(title.getText(), "SB Admin v2.0");		
	}
	
	//huge
	@Test
	public void testHugeTextElements() {	
		driver.get("http://localhost:8080/pages/index.html");
		List<WebElement> hugeElements = driver.findElements(By.className("huge"));
		for(WebElement element: hugeElements) {
			System.out.println(element.getText());
		}

	}
	
}
