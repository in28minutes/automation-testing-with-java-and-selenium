package com.in28minutes.webdriver.basics;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class WebDriverBasicsLocatorsPerformanceTest extends AbstractChromeWebDriverTest{
	
	@Test
	public void testCssSelectorForMultipleTableTd() {	
		driver.get("http://localhost:8080/pages/tables.html");
		WebElement browserRow1 = driver.findElement(
				By.cssSelector("#dataTables-example > tbody > tr:nth-child(1) > td:nth-child(2)"));
		WebElement browserRow2 = driver.findElement(
				By.cssSelector("#dataTables-example > tbody > tr:nth-child(2) > td:nth-child(2)"));
		WebElement browserRow3 = driver.findElement(
				By.cssSelector("#dataTables-example > tbody > tr:nth-child(3) > td:nth-child(2)"));
		assertEquals(browserRow1.getText(), "Firefox 1.0");		
		assertEquals(browserRow2.getText(), "Firefox 1.5");		
		assertEquals(browserRow3.getText(), "Firefox 2.0");		
	}
	
	@Test
	public void testCssSelectorForMultipleTableTd_MorePerformance() {	
		driver.get("http://localhost:8080/pages/tables.html");
		
		WebElement tableTbody = driver.findElement(
				By.cssSelector("#dataTables-example > tbody"));
		
		WebElement browserRow1 = 
				tableTbody.findElement(By.cssSelector("tr:nth-child(1) > td:nth-child(2)"));

		WebElement browserRow2 = 
				tableTbody.findElement(By.cssSelector("tr:nth-child(2) > td:nth-child(2)"));

		WebElement browserRow3 = 
				tableTbody.findElement(By.cssSelector("tr:nth-child(3) > td:nth-child(2)"));

		assertEquals(browserRow1.getText(), "Firefox 1.0");		
		assertEquals(browserRow2.getText(), "Firefox 1.5");		
		assertEquals(browserRow3.getText(), "Firefox 2.0");		
	}	

}
