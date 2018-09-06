package com.in28minutes.webdriver.basics.form;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.in28minutes.webdriver.basics.AbstractChromeWebDriverTest;

public class FormElementSelectTest extends AbstractChromeWebDriverTest {

	@Test
	public void readValueOfSelectBox() {
		driver.get("http://localhost:8080/pages/forms.html");
		WebElement selectElement = driver.findElement(By.id("selectElement1"));
		Select select = new Select(selectElement);
		System.out.println(select.isMultiple());
		System.out.println(select.getFirstSelectedOption().getText());
	}
	
	@Test
	public void readValueFromMultiSelectBox() {
		driver.get("http://localhost:8080/pages/forms.html");
		WebElement selectElement = driver.findElement(By.id("multiSelectElement"));
		Select select = new Select(selectElement);
		System.out.println(select.isMultiple());//true
		System.out.println(select.getFirstSelectedOption().getText());//One
		for (WebElement element : select.getAllSelectedOptions()) {
			System.out.println(element.getText());//One,Three
		}
	}
	
	@Test
	public void setValuesIntoSelectBox() {
		driver.get("http://localhost:8080/pages/forms.html");
		WebElement selectElement = driver.findElement(By.id("selectElement1"));
		sleep(5);
		Select select = new Select(selectElement);
		select.selectByValue("2");
		sleep(5);
		select.selectByVisibleText("Five");
		sleep(5);
		select.selectByIndex(3);
		sleep(5);
		System.out.println(select.isMultiple());
		System.out.println(select.getFirstSelectedOption().getText());
	}

	@Test
	public void setValuesIntoMultiSelectBox() {
		driver.get("http://localhost:8080/pages/forms.html");
		WebElement selectElement = driver.findElement(By.id("multiSelectElement"));
		sleep(5);
		Select select = new Select(selectElement);
		select.deselectAll();
		sleep(3);
		select.selectByValue("2");
		sleep(3);
		select.selectByVisibleText("Five");
		sleep(3);
		select.selectByIndex(3);
		sleep(3);
		select.deselectByVisibleText("Four");
		sleep(3);
		System.out.println(select.isMultiple());
		System.out.println(select.getFirstSelectedOption().getText());
	}

}
