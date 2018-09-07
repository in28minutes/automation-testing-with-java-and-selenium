package com.in28minutes.webdriver.scenarios;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.in28minutes.webdriver.basics.AbstractChromeWebDriverTest;

public class JavaScriptAlertTest extends AbstractChromeWebDriverTest {

	@Test
	public void testForAlert() {
		driver.get("http://localhost:8080/pages/notifications.html");
		driver.findElement(By.id("alertButton")).click();

		//org.openqa.selenium.UnhandledAlertException: 
		//unexpected alert open: {Alert text : Enter Something}
		//driver.findElement(By.id("modalButton")).click();
		
		Alert alertQuestion = driver.switchTo().alert();
		alertQuestion.sendKeys("Some Message");
		alertQuestion.accept();
		
		Alert alertMessage = driver.switchTo().alert();
		System.out.println(alertMessage.getText());
		alertMessage.accept();		
	}
}
