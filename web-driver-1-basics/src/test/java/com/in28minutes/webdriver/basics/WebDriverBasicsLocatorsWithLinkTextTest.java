package com.in28minutes.webdriver.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class WebDriverBasicsLocatorsWithLinkTextTest extends AbstractChromeWebDriverTest {
  
  @Test
  public void getIn28MinuteLinkAndClickIt() {
	  driver.get("http://localhost:8080/login");
	  WebElement link = driver.findElement(By.linkText("in28Minutes"));
	  System.out.println(link.getAttribute("href"));//http://www.in28minutes.com/
	  link.click();
	  System.out.println(driver.getCurrentUrl());// http://www.in28minutes.com/
  }
  
  @Test
  public void getTableLinkAndClickIt() {
	  driver.get("http://localhost:8080/pages/index.html");
	  WebElement link = driver.findElement(By.linkText("Tables"));
	  System.out.println(link.getAttribute("href"));
	  link.click();
	  System.out.println(driver.getCurrentUrl());
  }

  @Test
  public void getSBAdminLinkAndClickIt() {
	  driver.get("http://localhost:8080/pages/index.html");
	  WebElement link = driver.findElement(By.partialLinkText("SB Admin"));
	  System.out.println(link.getAttribute("href"));
	  link.click();
	  System.out.println(driver.getCurrentUrl());
  }

  
}
