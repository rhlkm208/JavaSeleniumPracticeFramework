package TestProgram;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EventHubPage {
	
	private WebDriver driver;
	private WebDriverWait wait;
	
	private By emailField = By.id("user-name");
	private By passwordField = By.id("password");
	private By signInButton = By.id("login-button");
	
	public EventHubPage(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}
	
	private WebElement WaitForClickable(By locator) {
		return wait.until(ExpectedConditions.elementToBeClickable(locator));		
	}
	
	public WebElement WaitForVisible(By locator) {
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));	
	}
	
	public void enterEmail(String email) {
		WaitForVisible(emailField).sendKeys(email);	
	}
	
	public void enterPassword(String password) {
		WaitForVisible(passwordField).sendKeys(password);	
	}
	
	public void clickOnSignInButton() {
		WaitForClickable(signInButton).click();
	}
	
	public void login(String email, String password) {
		enterEmail(email);	
		enterPassword(password);
		clickOnSignInButton();
	}
}
