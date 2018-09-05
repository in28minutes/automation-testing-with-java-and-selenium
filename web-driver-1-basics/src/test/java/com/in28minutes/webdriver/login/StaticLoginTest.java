package com.in28minutes.webdriver.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.in28minutes.webdriver.basics.AbstractChromeWebDriverTest;

public class StaticLoginTest extends AbstractChromeWebDriverTest{
  
  @Test
  public void login() {
	  driver.get("http://localhost:8080/pages/login.html");
	  
	  sleep(5);
	  
	  WebElement emailElement = driver.findElement(By.name("email"));
	  emailElement.sendKeys("in28minutes@gmail.com");
	  
	  sleep(2);
	  
	  WebElement passwordElement = driver.findElement(By.name("password"));
	  passwordElement.sendKeys("dummy");
	  
	  sleep(2);
	  
	  WebElement loginElement = driver.findElement(By.tagName("a"));
	  loginElement.click();
	  
	  sleep(2);
	  
	  //http://localhost:8080/pages/index.html
	  System.out.println(driver.getCurrentUrl());
	  
  }
}
