package com.in28minutes.pageobjects.updatetodo;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UpdateTodoBasicTest2AfterLoginPage {
	
	WebDriver driver;
	
	@BeforeTest
	public void beforeTest() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	@Test
	public void loginPageObject() {
		
		driver.get("http://localhost:8080/login");
		
		LoginPage page = PageFactory.initElements(driver, LoginPage.class);
		
		//driver.findElement(By.id("name")).getAttribute("type")
		System.out.println(page.name.getAttribute("type"));//text
		
		//driver.findElement(By.id("password")).getAttribute("type")
		System.out.println(page.password.getAttribute("type"));//password
		
	}
	
	@Test
	public void updateTodo() {
		
		driver.get("http://localhost:8080/login");
		
		LoginPage page = PageFactory.initElements(driver, LoginPage.class);
		page.login("in28minutes", "dummy");
			
		//page.enterName("in28minutes");
		//page.enterPassword("dummy");
		//page.submit();
		
		//page.name.sendKeys("in28minutes");
		//page.password.sendKeys("dummy");
		//page.submitButton.submit();
		
		//Click here - Link Text - click
		driver.findElement(By.linkText("Click here")).click();
		
		//id update-10002 click
		driver.findElement(By.id("update-10002")).click();
		
		//id desc
		WebElement desc = driver.findElement(By.id("desc"));
		desc.clear();
		desc.sendKeys("Become a Tech Guru - 2");
		
		//id targetDate
		WebElement targetDate = driver.findElement(By.id("targetDate"));
		targetDate.clear();
		targetDate.sendKeys("12/09/2019");
		
		//save submit
		driver.findElement(By.id("save")).submit();
		
		//check desc-10002
		String updatedDesc = driver.findElement(By.id("desc-10002")).getText();
		//check targetdate-10002
		String updatedTargetDate = driver.findElement(By.id("targetdate-10002")).getText();
		
		//Become a Tech Guru - 2
		//12/09/2019

		assertEquals(updatedDesc, "Become a Tech Guru - 2");
		assertEquals(updatedTargetDate, "12/09/2019");
		
	}
	
	@AfterTest
	public void afterTest() {
		driver.quit();
	}
}
