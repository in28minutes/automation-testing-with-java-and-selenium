package com.in28minutes.webdriver.scenarios;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.in28minutes.webdriver.basics.AbstractChromeWebDriverTest;

public class NewWindowTest extends AbstractChromeWebDriverTest {

	@Test
	public void testForWindows() {

		driver.get("http://localhost:8080/pages/notifications.html");

		// 0 - [CDwindow-C62544C6B928D4C97EE4F2E54D9B7FE2]
		System.out.println("0 - " + driver.getWindowHandles());

		driver.findElement(By.id("newPageButton")).click();
		// Window Handle
		// 1 - CDwindow-C62544C6B928D4C97EE4F2E54D9B7FE2
		System.out.println("1 - " + driver.getWindowHandle());

		// 2 - [CDwindow-C62544C6B928D4C97EE4F2E54D9B7FE2,
		// CDwindow-F3E3A57A563CF50F3A063A72C4B23768]
		System.out.println("2 - " + driver.getWindowHandles());

	}

	@Test
	public void findWindowHandleOfSecondWindow() {

		driver.get("http://localhost:8080/pages/notifications.html");

		String firstWindowHandle = driver.getWindowHandle();

		System.out.println(firstWindowHandle);

		driver.findElement(By.id("newPageButton")).click();

		String secondWindowHandle = findSecondWindowHandle(firstWindowHandle);

		System.out.println(secondWindowHandle);
	}

	private String findSecondWindowHandle(String firstWindowHandle) {
		for (String handle : driver.getWindowHandles()) {
			if (!firstWindowHandle.equals(handle)) {
				return handle;
			}
		}
		return null;
	}

	@Test
	public void switchToSecondWindow() {

		driver.get("http://localhost:8080/pages/notifications.html");

		String firstWindowHandle = driver.getWindowHandle();

		System.out.println(firstWindowHandle);

		driver.findElement(By.id("newPageButton")).click();

		String secondWindowHandle = findSecondWindowHandle(firstWindowHandle);

		System.out.println(secondWindowHandle);

		System.out.println(driver.findElement(By.tagName("h1")).getText());// Notifications

		driver.switchTo().window(secondWindowHandle);

		System.out.println(driver.findElement(By.tagName("h1")).getText());// Forms

		driver.switchTo().window(firstWindowHandle);

		System.out.println(driver.findElement(By.tagName("h1")).getText());// Notifications

		System.out.println(driver.getCurrentUrl());// http://localhost:8080/pages/notifications.html

		driver.close();

		// org.openqa.selenium.NoSuchWindowException: no such window: target window
		// already closed
		// System.out.println(driver.getCurrentUrl());

		driver.switchTo().window(secondWindowHandle);

		System.out.println(driver.getCurrentUrl());// http://localhost:8080/pages/forms.html
	}
}
