package com.in28minutes.webdriver.basics;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class WebDriverBasicsLocatorsWithXPathSelectorTest extends AbstractChromeWebDriverTest{
	
	@Test
	public void testXpathSelectorForaTableTd() {
		driver.get("http://localhost:8080/pages/tables.html");
		//$x("//*[@id='dataTables-example']/tbody/tr[1]/td[2]")
		WebElement browserRow1 = driver.findElement(By.xpath("//*[@id='dataTables-example']/tbody/tr[1]/td[2]"));
		assertEquals(browserRow1.getText(), "Firefox 1.0");		
	}
	
//	$$("#dataTables-example > thead > tr > th:nth-child(2)")
//	[th.sorting]0: th.sortinglength: 1__proto__: Array(0)
//	$$("#dataTables-example > tbody > tr.gradeU.odd > td.sorting_1")
//	[td.sorting_1]
	
	@Test
	public void testXpathSelectorForSortingAndCheckingFirstRow() {
		
//		$x("//*[@id='dataTables-example']/thead/tr/th[2]")
//		[th.sorting]0: th.sortinglength: 1__proto__: Array(0)
//		$x("//*[@id='dataTables-example']/tbody/tr[1]/td[2]")
//		[td]
				
		driver.get("http://localhost:8080/pages/tables.html");
		
		WebElement headerBrowser = driver.findElement
				(By.xpath(
				"//*[@id='dataTables-example']/thead/tr/th[2]"));
		
		headerBrowser.click();

		WebElement element = driver.findElement
				(By.xpath(
				"//*[@id='dataTables-example']/tbody/tr[1]/td[2]"));

		assertEquals(element.getText(), "All others");		
	}
	
	
}
