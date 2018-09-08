import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NewTest {
	@DataProvider(name="browser-list")
	public String[] browsers() {
		return new String[] { "safari", "chrome", "firefox"};
	}
	
	
	@Test(dataProvider="browser-list")
	public void standalone(String browser) throws InterruptedException, MalformedURLException {

		DesiredCapabilities capabilities = new DesiredCapabilities();
		
		capabilities.setBrowserName(browser);//chrome, firefox, htmlunit, internet explorer, iphone, opera

		WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capabilities);

		driver.get("http://localhost:8080/pages/tables.html");
		
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());

		Thread.sleep(10000);
	}
}
