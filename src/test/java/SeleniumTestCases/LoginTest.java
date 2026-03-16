package SeleniumTestCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class LoginTest {
	
	public WebDriver driver;
	
	@Test
	public void loginUsingPageFactory() {

	    LoginPage loginPage = new LoginPage(driver);
	    loginPage.login("testuser", "testpassword");
	}

	@Test
	public void loginWithExplicitWait() {

	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")))
	            .sendKeys("testuser");

	    driver.findElement(By.id("password"))
	            .sendKeys("testpassword");

	    wait.until(ExpectedConditions.elementToBeClickable(
	            By.xpath("//input[@type='submit']"))).click();
	}


}
