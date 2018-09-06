package com.in28minutes.webdriver.basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class WebDriverBasicsLocatorsWithTagTest extends AbstractChromeWebDriverTest {
  
  @Test
  public void getDetailsAboutLoginButton() {
	  driver.get("http://localhost:8080/pages/login.html");
	  WebElement linkElement = driver.findElement(By.tagName("a"));
	  System.out.println(linkElement.getText());//Login
	  System.out.println(linkElement.getAttribute("class"));//btn btn-lg btn-success btn-block
	  System.out.println(linkElement.getAttribute("href"));//http://localhost:8080/pages/index.html
  }
  
  @Test
  public void getDetailsAboutInputTags_FindElementWillReturnFirstElement() {
	  driver.get("http://localhost:8080/pages/login.html");
	  WebElement linkElement = driver.findElement(By.tagName("input"));
	  System.out.println(linkElement.getAttribute("class"));//form-control
	  System.out.println(linkElement.getAttribute("placeholder"));//E-mail
  }
  
  @Test
  public void getDetailsAboutInputTags_FindAllElements() {
	  driver.get("http://localhost:8080/pages/login.html");
	  
	  List<WebElement> elements = driver.findElements(By.tagName("input"));
	  
	  for(WebElement element:elements) {
		  System.out.println(element.getAttribute("class"));
		  System.out.println(element.getAttribute("placeholder"));
	  }
  }
  
  @Test
  public void getDetailsAboutInputTags_FindAllElements_Login() {
	  driver.get("http://localhost:8080/login");
	  
	  List<WebElement> elements = driver.findElements(By.tagName("input"));
	  
	  for(WebElement element:elements) {
		  System.out.println(element.getAttribute("type"));
		  System.out.println(element.getAttribute("name"));
		  sleep(3);
	  }
  }
}
