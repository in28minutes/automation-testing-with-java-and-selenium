package com.in28minutes.pageobjects.updatetodo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ListTodoPage {
	
	private WebDriver driver;
	
	public ListTodoPage(WebDriver driver) {
		super();
		this.driver = driver;
	}

	//get description for id
	//desc- + id
	public String getDescription(String id) {
		return driver.findElement(By.id("desc-" + id)).getText();
	}
	
	//get target date for id
	public String getTargetDate(String id) {
		return driver.findElement(By.id("targetdate-" + id)).getText();
	}
	
	//click update for a id
	public void clickUpdateFor(String id) {
		driver.findElement(By.id("update-" + id)).click();
	}
	
	//delete a id

}
