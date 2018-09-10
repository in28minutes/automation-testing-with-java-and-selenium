package com.in28minutes.webdriver.scenarios;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.in28minutes.webdriver.basics.AbstractChromeWebDriverTest;
import com.in28minutes.webdriver.scenarios.framework.TableReader;

public class ReadTablesTest extends AbstractChromeWebDriverTest {

	@Test
	public void testReadingOfTables() throws IOException {
		
		driver.get("http://localhost:8080/pages/tables.html");
		
		TableReader reader = new TableReader(driver, "dataTables-example");
		System.out.println(reader.getData(1,2));
		System.out.println(reader.getData(2,2));
		System.out.println(reader.getData(5,4));
		System.out.println(reader.getData(6,3));

		TableReader reader2 = new TableReader(driver, "dataTables-example-2");
		System.out.println(reader2.getData(1, 2));
		
		//1,2
		//2,3
		//WebElement tbody = driver.findElement(By.cssSelector("#dataTables-example > tbody"));
		
		//String t12 = tbody.findElement(By.cssSelector("tr:nth-child(1) > td:nth-child(2)")).getText();
		
		//String t22 = tbody.findElement(By.cssSelector("tr:nth-child(2) > td:nth-child(2)")).getText();
		
		//System.out.println(t12);
		//System.out.println(t22);
		
		//#dataTables-example > tbody > tr:nth-child(1) > td:nth-child(2)
		//#dataTables-example > tbody > tr:nth-child(2) > td:nth-child(2)
		//#dataTables-example > tbody > tr:nth-child(1) > td:nth-child(3)
		
	}
}
