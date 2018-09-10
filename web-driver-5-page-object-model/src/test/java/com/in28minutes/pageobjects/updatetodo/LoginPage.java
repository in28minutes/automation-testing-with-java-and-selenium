package com.in28minutes.pageobjects.updatetodo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	
	private WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		super();
		driver.get("http://localhost:8080/login");
		this.driver = driver;
	}

	//Name Text Box
	@FindBy(id="name")
	WebElement name;
	
	//Password Text Box
	@FindBy(id="password")
	WebElement password;
	
	//Submit Button
	@FindBy(id="submit")
	WebElement submitButton;
	
	//enterName
	public void enterName(String nameToEnter) {
		name.sendKeys(nameToEnter);
	}

	//enterPassword
	public void enterPassword(String passwordToEnter) {
		password.sendKeys(passwordToEnter);
	}

	//submit
	public void submit() {
		submitButton.submit();
	}
	
	public void login(String name, String password) {
		enterName(name);
		enterPassword(password);
		submit();
	}
}
