package com.in28minutes.webdriver.scenarios;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import com.in28minutes.webdriver.basics.AbstractChromeWebDriverTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PlayingWithModalWindowAndWaitsTest extends AbstractChromeWebDriverTest {

	@Test(expectedExceptions = ElementNotVisibleException.class)
	public void playingWithModalWindows_expectingAException() {
		driver.get("http://localhost:8080/pages/notifications.html");
		// Button id - modalButton
		// Modal Wdw id - myModal, myModalLabel, myModalBody, myModalCloseButton
		driver.findElement(By.id("modalButton")).click();

		// org.openqa.selenium.ElementNotVisibleException: element not visible
		driver.findElement(By.id("myModalCloseButton")).click();

	}

	@Test
	public void playingWithModalWindows_FixingWithSleep() {

		driver.get("http://localhost:8080/pages/notifications.html");

		// Button id - modalButton
		// Modal Wdw id - myModal, myModalLabel, myModalBody, myModalCloseButton
		driver.findElement(By.id("modalButton")).click();

		sleep(1);

		System.out.println(driver.findElement(By.id("myModalLabel")).getText());// Modal title

		driver.findElement(By.id("myModalCloseButton")).click();

		// sleep(10);
	}

	@Test
	@Ignore("implicit wait fails on Chrome")
	// https://github.com/SeleniumHQ/selenium-google-code-issue-archive/issues/711
	public void playingWithModalWindows_implicitWait() {

		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);

		driver.get("http://localhost:8080/pages/notifications.html");

		// Button id - modalButton
		// Modal Wdw id - myModal, myModalLabel, myModalBody, myModalCloseButton
		driver.findElement(By.id("modalButton")).click();

		// sleep(1);

		System.out.println(driver.findElement(By.id("myModalLabel")).getText());// Modal title

		driver.findElement(By.id("myModalCloseButton")).click();

		// sleep(10);
	}

	@Test
	public void playingWithModalWindows_ExplicitWait() {

		driver.get("http://localhost:8080/pages/notifications.html");

		// Button id - modalButton
		// Modal Wdw id - myModal, myModalLabel, myModalBody, myModalCloseButton
		driver.findElement(By.id("modalButton")).click();

		// sleep(10);
		// Max - 10
		// Wait for myModalLabel to load

		WebDriverWait webDriverWait = new WebDriverWait(driver, 10);
		
		webDriverWait.withMessage("Waited for 10 Seconds but still myModalLabel not available");
		
		WebElement modalLabel = 
				webDriverWait.until(
						ExpectedConditions.visibilityOf(
								driver.findElement(By.id("myModalLabel"))
								)
						);// By.id("myModalLabel")


		System.out.println(modalLabel.getText());// Modal title

		driver.findElement(By.id("myModalCloseButton")).click();

		// sleep(10);
	}
}
