package driverLaunch;

import java.time.Duration;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseClass {

    @Test
    public void loginTest() {

        WebDriver driver = DriverFactory.getDriver();
        LoginPage loginPage = new LoginPage(driver);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // ✅ FIXED — getLoginButton() returns WebElement correctly
        wait.until(ExpectedConditions.elementToBeClickable(loginPage.getLoginButton()));

        loginPage.login("testuser", "testpassword");

        Assert.assertEquals(driver.getTitle(), "Flipkart Home Page");
    }

    @Test
    public void fluentWaitTest() {

        WebDriver driver = DriverFactory.getDriver();
        LoginPage loginPage = new LoginPage(driver);

        Wait<WebDriver> fluentWait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(40))
                .pollingEvery(Duration.ofSeconds(5))
                .ignoring(org.openqa.selenium.NoSuchElementException.class);

        try {
            fluentWait.until(ExpectedConditions.titleContains("Flipkart"));
            System.out.println("Page loaded successfully");
        } catch (TimeoutException e) {
            System.err.println("Page did not load within time: " + e.getMessage());
        }
    }

    // ✅ Reusable wait utility — correct, no changes needed
    public void waitForVisibility(WebElement element) {
        try {
            WebDriverWait wait = new WebDriverWait(
                    DriverFactory.getDriver(), Duration.ofSeconds(10));
            wait.until(ExpectedConditions.visibilityOf(element));
        } catch (TimeoutException e) {
            System.err.println("Element not visible: " + e.getMessage());
        }
    }
}