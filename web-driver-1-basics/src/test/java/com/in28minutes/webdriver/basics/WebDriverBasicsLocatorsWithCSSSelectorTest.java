package com.in28minutes.webdriver.basics;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class WebDriverBasicsLocatorsWithCSSSelectorTest extends AbstractChromeWebDriverTest {

	@Test
	public void testCssSelectorForaTableTd() {
		driver.get("http://localhost:8080/pages/tables.html");

		WebElement browserRow1 = driver
				.findElement(By.cssSelector("#dataTables-example > tbody > tr:nth-child(1) > td:nth-child(2)"));
		assertEquals(browserRow1.getText(), "Firefox 1.0");
		
	}

	// $$("#dataTables-example > thead > tr > th:nth-child(2)")
	// [th.sorting]0: th.sortinglength: 1__proto__: Array(0)
	// $$("#dataTables-example > tbody > tr.gradeU.odd > td.sorting_1")
	// [td.sorting_1]

	@Test
	public void testCssSelectorForSortingAndCheckingFirstRow() {
		driver.get("http://localhost:8080/pages/tables.html");

		/*
		 * <tr class="gradeA odd" role="row"> <td class="sorting_1">Gecko</td>
		 * <td>Firefox 1.0</td> <td>Win 98+ / OSX.2+</td> <td class="center">1.7</td>
		 * <td class="center">A</td> </tr>
		 * 
		 * 
		 * <tr class="gradeU odd" role="row"> <td class="">Other browsers</td> <td
		 * class="sorting_1">All others</td> <td>-</td> <td class="center">-</td> <td
		 * class="center">U</td> </tr>
		 */

		// #dataTables-example > tbody > tr:nth-child(1) > td:nth-child(2)
		// #dataTables-example > tbody > tr.gradeU.odd > td.sorting_1

		WebElement headerBrowser = driver
				.findElement(By.cssSelector("#dataTables-example > thead > tr > th:nth-child(2)"));

		headerBrowser.click();

		WebElement element = driver
				.findElement(By.cssSelector("#dataTables-example > tbody > tr.gradeU.odd > td.sorting_1"));

		assertEquals(element.getText(), "All others");
	}

}
