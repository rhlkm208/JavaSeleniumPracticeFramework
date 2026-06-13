package SeleniumTestCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestCasesPage {
	
	WebDriver driver;
	WebDriverWait wait;
	
	By userNameField = By.id("user-name");
	By passwordField = By.id("password");
	By loginButton = By.id("login-button");
	
	
	public TestCasesPage(WebDriver driver) {
		this.driver=driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}
	
	public WebElement WaitForVisiblityOfElement (By locator) {
	return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
	
	public WebElement WaitForClicakbleElement (By locator) {
		return wait.until(ExpectedConditions.elementToBeClickable(locator));
		}
	
	public void login(String usename, String password) {
		WaitForVisiblityOfElement(userNameField).sendKeys(usename);
		WaitForVisiblityOfElement(passwordField).sendKeys(password);
		WaitForClicakbleElement(loginButton).click();
	}
	

}
