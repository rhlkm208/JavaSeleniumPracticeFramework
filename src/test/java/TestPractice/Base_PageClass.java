package TestPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base_PageClass {

    WebDriver driver;
    WebDriverWait wait;

    // Constructor
    public Base_PageClass(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    // Locators
    private By login = By.id("login");
    private By password = By.id("password");
    private By clickButton = By.xpath("//div[@id='click']");

    // Generic Wait Method
    public WebElement waitForClickableElement(By locator) {
        return wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    // Reusable SendKeys Method
    public void enterText(By locator, String value) {
        waitForClickableElement(locator).sendKeys(value);
    }

    // Reusable Click Method
    public void clickElement(By locator) {
        waitForClickableElement(locator).click();
    }

    // Business Method
    public void login(String userName, String passWord) {

        enterText(login, userName);
        enterText(password, passWord);
        clickElement(clickButton);
    }
}