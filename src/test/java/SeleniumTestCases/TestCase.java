package SeleniumTestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCase {

	WebDriver driver;

	@BeforeMethod
	public void setup() {
		
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");

	}

	@Test
	public void verifylogin() {

		TestCasesPage tc = new TestCasesPage(driver);
		tc.login("standard_user", "secret_sauce");

	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
