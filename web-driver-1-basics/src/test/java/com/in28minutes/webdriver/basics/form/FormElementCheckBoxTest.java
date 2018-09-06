package com.in28minutes.webdriver.basics.form;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.in28minutes.webdriver.basics.AbstractChromeWebDriverTest;

public class FormElementCheckBoxTest extends AbstractChromeWebDriverTest {

	@Test
	public void readFromACheckBox() {
		driver.get("http://localhost:8080/pages/forms.html");
		WebElement checkboxElement1 = driver.findElement(By.name("checkboxElement1"));
		System.out.println(checkboxElement1.isSelected());//false
		assertFalse(checkboxElement1.isSelected());
		
		WebElement checkboxElement2 = driver.findElement(By.name("checkboxElement2"));
		System.out.println(checkboxElement2.isSelected());//true
		assertTrue(checkboxElement2.isSelected());
	}
	
	@Test
	public void setAValueIntoCheckBoxElement1() {
		driver.get("http://localhost:8080/pages/forms.html");
		WebElement checkboxElement1 = driver.findElement(By.name("checkboxElement1"));
		sleep(4);
		checkboxElement1.click();
		sleep(4);
		WebElement checkboxElement3 = driver.findElement(By.name("checkboxElement3"));
		sleep(4);
		checkboxElement3.click();
		sleep(4);
	}

	@Test
	public void checkACheckBox() {
		driver.get("http://localhost:8080/pages/forms.html");
		
		checkACheckBox("checkboxElement1");
		sleep(2);
		checkACheckBox("checkboxElement2");
		sleep(2);
		checkACheckBox("checkboxElement3");
		
		checkACheckBox("inlineCheckboxElement1");
		checkACheckBox("inlineCheckboxElement2");
		checkACheckBox("inlineCheckboxElement3");
		sleep(4);

	}

	@Test
	public void unCheckACheckBox() {
		driver.get("http://localhost:8080/pages/forms.html");
		
		unCheckACheckBox("checkboxElement1");
		sleep(2);
		unCheckACheckBox("checkboxElement2");
		sleep(2);
		unCheckACheckBox("checkboxElement3");

		unCheckACheckBox("inlineCheckboxElement1");
		unCheckACheckBox("inlineCheckboxElement2");
		unCheckACheckBox("inlineCheckboxElement3");
		
		sleep(4);

	}

	private void checkACheckBox(String checkboxName) {
		WebElement checkboxElement1 = driver.findElement(By.name(checkboxName));
		
		boolean currentValue = checkboxElement1.isSelected();
		
		if(currentValue==false) {
			checkboxElement1.click();
		}
	}
	
	private void unCheckACheckBox(String checkboxName) {
		WebElement checkboxElement1 = driver.findElement(By.name(checkboxName));
		
		boolean currentValue = checkboxElement1.isSelected();
		
		if(currentValue==true) {
			checkboxElement1.click();
		}
	}

}
