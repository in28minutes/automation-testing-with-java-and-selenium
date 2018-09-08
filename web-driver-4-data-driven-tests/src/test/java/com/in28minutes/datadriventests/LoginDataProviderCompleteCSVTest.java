package com.in28minutes.datadriventests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.opencsv.CSVReader;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginDataProviderCompleteCsvTest {
	
	//Data Provider public java.util.List com.in28minutes.datadriventests.
	//LoginDataProviderCompleteCsvTest.userIdsAndPasswordsCSVDataProvider() 
	//must return either Object[][] or Object[] or Iterator<Object[]> 
	//or Iterator<Object>, not interface java.util.List

	// Create the Data Provider and give the data provider a name
	@DataProvider(name = "user-ids-passwords-csv-data-provider")
	public Iterator<String[]> userIdsAndPasswordsCSVDataProvider() {
		return readFromCSVFile("./src/test/resources/login-data.csv").iterator();
	}

	// Use the data provider
	@Test(dataProvider = "user-ids-passwords-csv-data-provider")
	public void testLoginForAllScenarios(String userId, String password, String isLoginExpectedToBeSuccessfulString) {
		
		boolean isLoginExpectedToBeSuccessful = Boolean.valueOf(isLoginExpectedToBeSuccessfulString);
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:8080/login");
		driver.findElement(By.id("name")).sendKeys(userId);
		// driver.findElement(By.id("name")).sendKeys("in28minutes");
		WebElement passwordElement = driver.findElement(By.id("password"));
		passwordElement.sendKeys(password);
		passwordElement.submit();
		// driver.findElement(By.id("submit")).click();

		if (isLoginExpectedToBeSuccessful) {
			String welcomeMessageText = driver.findElement(By.id("welcome-message")).getText();
			assertTrue(welcomeMessageText.contains("Welcome " + userId));
		} else {
			String errorMessageText = driver.findElement(By.id("error-message")).getText();
			assertEquals(errorMessageText, "Invalid Credentials");
		}

		driver.quit();
	}

	@Test
	public void testReadingDataFromCSV() throws IOException {
		List<String[]> data = readFromCSVFile("./src/test/resources/login-data.csv");
		for (String[] row : data) {
			System.out.println(Arrays.toString(row));
		}

	}

	private List<String[]> readFromCSVFile(String csvFilePath) {
		try {
			CSVReader reader = new CSVReader(new FileReader(csvFilePath));
			List<String[]> data = reader.readAll();
			return data;
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}

}
