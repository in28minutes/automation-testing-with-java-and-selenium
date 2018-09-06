package com.in28minutes.webdriver.basics.form;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.in28minutes.webdriver.basics.AbstractChromeWebDriverTest;

public class FormElementTextTest extends AbstractChromeWebDriverTest {

	@Test
	public void readFromATextElement() {
		driver.get("http://localhost:8080/pages/forms.html");
		assertEquals(
				driver.findElement(By.id("textElement")).getAttribute("value"), 
				"in28minutes");
	}
	
	@Test
	public void setASpecificValueIntoTextElement() {
		driver.get("http://localhost:8080/pages/forms.html");
		WebElement textElement = driver.findElement(By.id("textElement"));
		sleep(4);
		textElement.clear();
		textElement.sendKeys("NewValue");
		sleep(4);
	}

	@Test
	public void writeAndReadAValueFromTextArea() {
		driver.get("http://localhost:8080/pages/forms.html");
		
		WebElement textArea = driver.findElement(By.id("textAreaElement"));
		
		assertEquals(textArea.getAttribute("value"),"");
		sleep(4);
		textArea.clear();
		textArea.sendKeys("FirstLine");
		textArea.sendKeys("\n");
		textArea.sendKeys("SecondLine");
		sleep(4);
		System.out.println(textArea.getAttribute("value"));
		assertEquals(textArea.getAttribute("value"),"FirstLine\nSecondLine");
		
	}

}
