package com.in28minutes.webdriver.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class WebDriverBasicsLocatorsWithNameTest extends AbstractChromeWebDriverTest {
	
	@Test
	public void testGetInformationAboutEmail() {
		driver.get("http://localhost:8080/pages/login.html");
		WebElement nameElement = driver.findElement(By.name("email"));
		System.out.println(nameElement.getTagName());//input
		System.out.println(nameElement.getAttribute("class"));//form-control
		System.out.println(nameElement.getAttribute("placeholder"));//E-mail
		System.out.println(nameElement.getAttribute("value"));//EMPTY
	}

	@Test
	public void testGetInformationAboutPassword() {
		driver.get("http://localhost:8080/pages/login.html");
		WebElement nameElement = driver.findElement(By.name("password"));
		System.out.println(nameElement.getTagName());//input
		System.out.println(nameElement.getAttribute("class"));//form-control
		System.out.println(nameElement.getAttribute("placeholder"));//Password
		System.out.println(nameElement.getAttribute("value"));//EMPTY
	}


	@Test
	public void testGetInformationAboutCheckbox() {
		driver.get("http://localhost:8080/pages/login.html");
		WebElement nameElement = driver.findElement(By.name("remember"));
		System.out.println(nameElement.getTagName());//input
		System.out.println(nameElement.getAttribute("class"));//
		System.out.println(nameElement.getAttribute("value"));//Remember Me
		System.out.println(nameElement.getAttribute("type"));//checkbox
	}
	
	@Test
	@Ignore
	public void testGetInformationAboutSubmitButton() {
		driver.get("http://localhost:8080/pages/login.html");
		WebElement nameElement = driver.findElement(By.id("submit"));
		System.out.println(nameElement.getTagName());//input
		System.out.println(nameElement.getAttribute("type"));//submit
		System.out.println(nameElement.getAttribute("value"));//EMPTY
	}

	//FAILED: testGetInformationAboutSubmitButton
	//org.openqa.selenium.NoSuchElementException: 
	//no such element: Unable to locate element: 
	//{"method":"id","selector":"submit"}

}
