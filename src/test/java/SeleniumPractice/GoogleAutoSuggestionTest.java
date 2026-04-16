package SeleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleAutoSuggestionTest {
	private WebDriver driver;

	@BeforeTest
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();

	}
	
	@Test
	public void verifyAutoSuggestion()  {
		GoogleAutoSuggestionPage gs = new GoogleAutoSuggestionPage(driver);
	
		gs.selectSpecificSuggestion("selenium testing", "selenium");
	}
	
	@AfterTest
	public void teardown() {
		driver.quit();

	}
}
