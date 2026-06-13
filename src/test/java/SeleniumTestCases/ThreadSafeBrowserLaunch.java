package SeleniumTestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class ThreadSafeBrowserLaunch {
	
	public static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

	
	public static WebDriver getDriver() {
		return driver.get();
	}
	
	@BeforeMethod
	public void setup() {
		driver.set(new ChromeDriver());
	}
	
	@AfterMethod
	public void tearDown() {
		if (getDriver() != null) {
		getDriver().quit();
		driver.remove();
	}
	}
}
