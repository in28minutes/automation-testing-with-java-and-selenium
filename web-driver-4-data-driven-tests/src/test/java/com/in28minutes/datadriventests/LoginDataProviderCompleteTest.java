package com.in28minutes.datadriventests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginDataProviderCompleteTest {
		
	//Create the Data Provider and give the data provider a name
	@DataProvider(name="user-ids-passwords-data-provider")
	public Object[][] userIdsAndPasswordsDataProvider() {
		return new Object[][]{
				{"in28minutes","dummy", true},
				{"adam","adam", false},
				{"adam","adam@123", true},
				{"eve","eve",false},
				{"eve","eve@123", true},
			};
	}	
	
	//Use the data provider
	@Test(dataProvider="user-ids-passwords-data-provider")
	public void testLoginForAllScenarios(String userId, 
			String password, boolean isLoginExpectedToBeSuccessful) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:8080/login");
		driver.findElement(By.id("name")).sendKeys(userId);
		//driver.findElement(By.id("name")).sendKeys("in28minutes");
		WebElement passwordElement = driver.findElement(By.id("password"));
		passwordElement.sendKeys(password);
		passwordElement.submit();
		// driver.findElement(By.id("submit")).click();

		if(isLoginExpectedToBeSuccessful) {
			String welcomeMessageText = driver.findElement(By.id("welcome-message")).getText();
			assertTrue(welcomeMessageText.contains("Welcome " + userId));
		} else {
			String errorMessageText = driver.findElement(By.id("error-message")).getText();
			assertEquals(errorMessageText,"Invalid Credentials");			
		}
		
		driver.quit();
	}
}
