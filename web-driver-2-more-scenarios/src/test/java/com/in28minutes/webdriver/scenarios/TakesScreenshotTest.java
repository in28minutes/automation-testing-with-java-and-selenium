package com.in28minutes.webdriver.scenarios;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class capturingScreenshot {

	public static WebDriver driver;

	private static void captureScreenshot() throws IOException {

		Date d = new Date();

		String FileName = d.toString().replace(":", "_").replace(" ", "_") + ".png";

		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		FileHandler.copy(screenshot, new File("./target/" + FileName));

	}

	public static void captureeleschreenshot(WebElement ele) throws IOException {
        
		Date d = new Date();

		String FileName = d.toString().replace(":", "_").replace(" ", "_") + ".png";
		
		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		BufferedImage fullimg = ImageIO.read(screenshot);

		Point point = ele.getLocation();

		int elewidth = ele.getSize().getWidth();
		int eleheight = ele.getSize().getHeight();

		BufferedImage elescreenshot = fullimg.getSubimage(point.getX(), point.getY(), elewidth, eleheight);
		ImageIO.write(elescreenshot, "png", screenshot);

		File screenshotLocation = new File("./target/"+ FileName);

		FileHandler.copy(screenshot, screenshotLocation);

	}

	public class TakesScreenshotTest extends AbstractChromeWebDriverTest {

	@Test
	public void testFrames() throws IOException {
		
		driver.get("http://localhost:8080/pages/frames-example.html");
		
		captureScreenshot()
		
        driver.navigate().to("https://webkul.com/about-us/our-team/");
		WebElement ele = driver.findElement(By.xpath("/html[1]/body[1]/section[2]/div[2]/div[3]/div[47]/div[1]"));
        captureeleschreenshot(ele);
		
	}

}
