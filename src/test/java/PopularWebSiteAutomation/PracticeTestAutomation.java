package PopularWebSiteAutomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PracticeTestAutomation {

	private WebDriver driver;
	private WebDriverWait wait;
	By TestExceptionsLink = By.xpath("//a[@href='https://practicetestautomation.com/practice-test-exceptions/']");
	By AddButton = By.xpath("//button[@id=\"add_btn\"]");
	By Row2InputField = By.xpath("//div[@id='row2']");
	By SaveButton = By.xpath("//div[@id='row2']//button[@id='save_btn']");
	By Row2InputFieldTextBox = By.xpath("//div[@id='row2']//input[@type='text']");

	@BeforeMethod
	public void setUp() {

		driver = new ChromeDriver();
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://practicetestautomation.com/practice/");
		driver.manage().window().maximize();

	}

	@Test
	public void TestExceptionOne() {

		driver.findElement(TestExceptionsLink).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(AddButton));
		wait.until(ExpectedConditions.elementToBeClickable(AddButton)).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(Row2InputField)).isDisplayed();
	}
	
	@Test
	public void TestExceptionTwo() {

		driver.findElement(TestExceptionsLink).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(AddButton));
		wait.until(ExpectedConditions.elementToBeClickable(AddButton)).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(Row2InputFieldTextBox)).sendKeys("Burger");
		wait.until(ExpectedConditions.elementToBeClickable(SaveButton)).click();
		String actual = wait.until(ExpectedConditions.presenceOfElementLocated(Row2InputFieldTextBox)).getAttribute("type");
		System.out.println("Actual: " +actual);
		String expected = "Burger";
		Assert.assertEquals(actual, expected);
	}


	@AfterMethod
	public void tearDown() {

		if (driver != null) {
			driver.quit();
		}
	}

}
