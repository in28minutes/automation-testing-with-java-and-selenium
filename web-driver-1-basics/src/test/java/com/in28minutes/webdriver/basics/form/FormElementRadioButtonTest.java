package com.in28minutes.webdriver.basics.form;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.in28minutes.webdriver.basics.AbstractChromeWebDriverTest;

public class FormElementRadioButtonTest extends AbstractChromeWebDriverTest {

	@Test
	public void readFromARadioButton() {
		driver.get("http://localhost:8080/pages/forms.html");
		List<WebElement> options = driver.findElements(By.name("optionsRadios"));
		for (WebElement option : options) {
			System.out.println(option.getAttribute("value") + " " + option.isSelected());
		}
		// option1 false
		// option2 false
		// option3 true

	}

	@Test
	public void readFromARadioButtonWithAFrameworkMethod() {
		driver.get("http://localhost:8080/pages/forms.html");
		System.out.println(getSelectedRadioButtonValue("optionsRadios"));// option3
		System.out.println(getSelectedRadioButtonValue("optionsRadiosInline"));

	}

	@Test
	public void setValueForRadioButton() {
		driver.get("http://localhost:8080/pages/forms.html");
		List<WebElement> options = driver.findElements(By.name("optionsRadios"));
		sleep(4);
		for (WebElement option : options) {
			if (option.getAttribute("value").equals("option2")) {
				option.click();
			}
		}
		sleep(4);
	}

	@Test
	public void setValueForRadioButtonWithAFrameworkMethod() {
		driver.get("http://localhost:8080/pages/forms.html");
		sleep(4);
		setRadioButtonToValue("optionsRadios", "option2");
		sleep(4);
		setRadioButtonToValue("optionsRadiosInline", "inline-option1");
	}

	private void setRadioButtonToValue(String radioButtonName, String valueToSelect) {
		List<WebElement> options = driver.findElements(By.name(radioButtonName));
		for (WebElement option : options) {
			if (option.getAttribute("value").equals(valueToSelect)) {
				option.click();
			}
		}
	}

	private String getSelectedRadioButtonValue(String name) {

		List<WebElement> options = driver.findElements(By.name(name));

		for (WebElement option : options) {
			if (option.isSelected()) {
				return option.getAttribute("value");
			}
		}

		return null;
	}

	@Test
	public void setValueForRadioButtonWithAFrameworkMethod_UsingCSS() {
		driver.get("http://localhost:8080/pages/forms.html");
		sleep(4);
		setRadioButtonToValueUsingCSS("optionsRadios", "option2");
		sleep(4);
		setRadioButtonToValueUsingCSS("optionsRadiosInline", "inline-option1");
		sleep(4);
	}

	private void setRadioButtonToValueUsingCSS(String radioButtonName, String valueToSelect) {
		String cssSelector = "input[name='" + radioButtonName + "'][value='" + valueToSelect + "']";

		WebElement option = driver.findElement(By.cssSelector(cssSelector));
		option.click();
	}

	@Test
	public void setValueForRadioButtonWithAFrameworkMethod_UsingXPath() {
		driver.get("http://localhost:8080/pages/forms.html");
		sleep(4);
		setRadioButtonToValueUsingXPath("optionsRadios", "option2");
		sleep(4);
		setRadioButtonToValueUsingXPath("optionsRadiosInline", "inline-option1");
		sleep(4);
	}

	private void setRadioButtonToValueUsingXPath(String radioButtonName, String valueToSelect) {
		String cssSelector = "//input[@name='" + radioButtonName + "'][@value='" + valueToSelect + "']";

		WebElement option = driver.findElement(By.xpath(cssSelector));
		option.click();
	}

}
