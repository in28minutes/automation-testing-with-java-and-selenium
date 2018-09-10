package com.in28minutes.pageobjects.updatetodo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WelcomePage {
	
	private WebDriver driver;
	
	public WelcomePage(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public void clickTodosLink() {
		driver.findElement(By.linkText("Click here")).click();
	}
}
