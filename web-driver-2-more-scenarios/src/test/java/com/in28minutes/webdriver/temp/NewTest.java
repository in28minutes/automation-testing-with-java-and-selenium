package com.in28minutes.webdriver.temp;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewTest {

	@Parameters("browser")
	@Test
	public void f(@Optional("chrome") String browser) {
		WebDriver driver = null;
		if (browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else if (browser.equalsIgnoreCase("safari")) {

		} else if (browser.equalsIgnoreCase("ie")) {

		} else {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}

		driver.get("http://localhost:8080/pages/forms.html");
		Actions actions = new Actions(driver);

		WebElement findElement = driver.findElement(By.id("textElement"));
		
		actions.click(findElement)
		.keyDown(findElement, Keys.ALT)
		.sendKeys(findElement, "abcd")
				.keyUp(findElement, Keys.ALT).perform();
		sleep(2);

		driver.quit();
	}

	private void sleep(int i) {
		try {
			Thread.sleep(i * 1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
