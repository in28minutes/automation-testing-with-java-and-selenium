package com.in28minutes.datadriventests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginDataProviderCompleteExcelTest {
		
	//Create the Data Provider and give the data provider a name
	@DataProvider(name="user-ids-passwords-excel-data-provider")
	public String[][] userIdsAndPasswordsDataProvider() {
		return ExcelReadUtil.readExcelInto2DArray(
				"./src/test/resources/login-data.xlsx", "Sheet1", 3);
	}	
	
	//Use the data provider
	@Test(dataProvider="user-ids-passwords-excel-data-provider")
	public void testLoginForAllScenarios(String userId, 
			String password, String isLoginExpectedToBeSuccessfulString) {
		
		boolean isLoginExpectedToBeSuccessful = 
				Boolean.valueOf(isLoginExpectedToBeSuccessfulString);
		
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
	
	@Test
	public void readFromExcel() {
		//[[in28minutes, dummy, true], [adam, adam, false], 
		//[adam, adam@123, true], [eve, eve, false]]
		String[][] data = ExcelReadUtil.readExcelInto2DArray(
				"./src/test/resources/login-data.xlsx", "Sheet1", 3);
		System.out.println(Arrays.deepToString(data));
		
	}
}
