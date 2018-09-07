package com.in28minutes.webdriver.scenarios;

import static org.testng.Assert.assertFalse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.in28minutes.webdriver.basics.AbstractChromeWebDriverTest;

public class CheckElementStylesTest extends AbstractChromeWebDriverTest {

	@Test
	public void getCSSStylesForErrorElement() {
		driver.get("http://localhost:8080/pages/forms.html");
		WebElement errorField = driver.findElement(By.id("inputError"));

		System.out.println(errorField.getCssValue("color"));// rgba(85, 85, 85, 1)
		System.out.println(errorField.getCssValue("display"));// block
		System.out.println(errorField.getCssValue("border-color"));// rgb(169, 68, 66)
		System.out.println(errorField.getCssValue("height"));// 34px
		System.out.println(errorField.getCssValue("font-size"));// 14px
		System.out.println(errorField.getCssValue("background-color"));// rgba(255, 255, 255, 1)
		System.out.println(errorField.getCssValue("border"));// 1px solid rgb(169, 68, 66)

	}

	@Test
	public void getCSSStylesForSuccessElement() {
		driver.get("http://localhost:8080/pages/forms.html");
		WebElement errorField = driver.findElement(By.id("inputSuccess"));
		System.out.println(errorField.getCssValue("color"));// rgba(85, 85, 85, 1)
		System.out.println(errorField.getCssValue("display"));// block
		System.out.println(errorField.getCssValue("border-color"));// rgb(60, 118, 61)
		System.out.println(errorField.getCssValue("height"));// 34px
		System.out.println(errorField.getCssValue("font-size"));// 14px
		System.out.println(errorField.getCssValue("background-color"));// rgba(255, 255, 255, 1)
		System.out.println(errorField.getCssValue("border"));// 1px solid rgb(60, 118, 61)
	}

	@Test
	public void checkIfAnElementIsEnabled() {
		driver.get("http://localhost:8080/pages/forms.html");
		
		WebElement errorField = driver.findElement(By.id("disabledInput"));
		
		assertFalse(errorField.isEnabled());
		System.out.println(errorField.isEnabled());//false
		
	}
	
	@Test
	public void exploreWebElementInterface() {
		driver.get("http://localhost:8080/pages/forms.html");
		
		WebElement errorField = driver.findElement(By.id("disabledInput"));
		System.out.println(errorField.getAttribute("placeholder"));//Disabled input
		
		System.out.println(errorField.getLocation());//(740, 311)
		System.out.println(errorField.getSize());//(414, 34)
		
		WebElement textElement = driver.findElement(By.id("textElement"));		
		System.out.println(textElement.getLocation());//(297, 242)
		System.out.println(textElement.getSize());//(414, 34)

		WebElement textAreaElement = driver.findElement(By.id("textAreaElement"));		
		System.out.println(textAreaElement.getLocation());//(297, 549)
		System.out.println(textAreaElement.getSize());//(414, 74)

		WebElement inputWarning = driver.findElement(By.id("inputWarning"));		
		System.out.println(inputWarning.getLocation());//(740, 666)
		System.out.println(inputWarning.getSize());//(414, 34)

		//findElements, findElement

	}

}
