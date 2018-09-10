package com.in28minutes.webdriver.scenarios;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.in28minutes.webdriver.basics.AbstractChromeWebDriverTest;

public class ActionsBasicTest extends AbstractChromeWebDriverTest {

	@Test
	public void testBasicActions() {
		driver.get("http://localhost:8080/pages/forms.html");
		WebElement element = driver.findElement(By.id("textElement"));
		WebElement tablesLink = driver.findElement(By.linkText("Tables"));
		
		//element.sendKeys("abc");
		//tablesLink.click();
		
		Actions actions = new Actions(driver);
		actions.sendKeys(element, "Dummy Text").perform();
		sleep(5);
		actions.click(tablesLink).perform();
		sleep(5);
		
		
	}
	
	@Test
	public void testBasicActions_Combine() {
		driver.get("http://localhost:8080/pages/forms.html");
		WebElement element = driver.findElement(By.id("textElement"));
		WebElement tablesLink = driver.findElement(By.linkText("Tables"));
		
		Actions actions = new Actions(driver);
		actions
			.sendKeys(element, "Dummy Text")
			.click(tablesLink)
			.perform();
		sleep(5);
	}

	@Test
	public void testBasicDragAndDrop() {
		driver.get("http://localhost:8080/pages/sortable.html");
		WebElement htmlElement = driver.findElement(By.id("html"));
		Actions actions = new Actions(driver);
		actions
			.dragAndDropBy(htmlElement, 50, 200)
			.perform();
		
		sleep(5);
	}


	@Test
	public void testBasicDragAndDrop_Complicated() {
		driver.get("http://localhost:8080/pages/sortable.html");
		WebElement htmlElement = driver.findElement(By.id("html"));
		
		Actions actions = new Actions(driver);
		actions
			.clickAndHold(htmlElement)
			.moveByOffset(50, 200)
			.release()
			.perform();
		
		sleep(5);
	}

}
