package com.in28minutes.pageobjects.updatetodo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TodoPage {

	private WebDriver driver;
	
	public TodoPage(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	@FindBy(id="desc")
	private WebElement description;
	
	@FindBy(id="targetDate")
	private WebElement targetDate;
	
	@FindBy(id="save")
	private WebElement saveButton;
	
	public void enterDescription(String desc) {
		description.clear();
		description.sendKeys(desc);
	}
	
	public void enterTargetDate(String date) {
		targetDate.clear();
		targetDate.sendKeys(date);
	}
	
	public void submit() {
		saveButton.submit();
	}
	
	public void enterDetailsAndSubmit(String desc,String targetDate) {
		enterDescription(desc);
		enterTargetDate(targetDate);
		submit();
	}
}
