package TestPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtility {

    WebDriver driver;
    WebDriverWait wait;

    // Constructor
    public WaitUtility(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    // Implicit Wait
    public void waitForImplicitMethod(int seconds) {

        driver.manage().timeouts()
                .implicitlyWait(Duration.ofSeconds(seconds));
    }

    // Wait for element visibility
    public WebElement waitForElementVisible(By locator, int seconds) {

        WebDriverWait wait = new WebDriverWait(driver,
                Duration.ofSeconds(seconds));

        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(locator));
    }

    // Wait for element clickable
    public WebElement waitForElementClickable(By locator, int seconds) {

        WebDriverWait wait = new WebDriverWait(driver,
                Duration.ofSeconds(seconds));

        return wait.until(
                ExpectedConditions.elementToBeClickable(locator));
    }

    // Wait for presence of element
    public WebElement waitForPresenceOfElement(By locator, int seconds) {

        WebDriverWait wait = new WebDriverWait(driver,
                Duration.ofSeconds(seconds));

        return wait.until(
                ExpectedConditions.presenceOfElementLocated(locator));
    }

    // Wait for title contains
    public boolean waitForTitleContains(String title, int seconds) {

        WebDriverWait wait = new WebDriverWait(driver,
                Duration.ofSeconds(seconds));

        return wait.until(
                ExpectedConditions.titleContains(title));
    }

    // Wait for alert
    public void waitForAlert(int seconds) {

        WebDriverWait wait = new WebDriverWait(driver,
                Duration.ofSeconds(seconds));

        wait.until(ExpectedConditions.alertIsPresent());
    }

    // Fluent Wait
    public WebElement fluentWait(By locator,
                                 int timeout,
                                 int pollingTime) {

        FluentWait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(timeout))
                .pollingEvery(Duration.ofSeconds(pollingTime))
                .ignoring(NoSuchElementException.class)
                .ignoring(StaleElementReferenceException.class);

        return wait.until(driver -> driver.findElement(locator));
    }

    // Select dropdown by visible text
    public void selectDropdown(By locator, String value) {

        WebElement element = waitForElementVisible(locator, 10);

        Select select = new Select(element);

        select.selectByVisibleText(value);
    }

    // Wait and Click
    public void clickElement(By locator, int seconds) {

        waitForElementClickable(locator, seconds).click();
    }

    // Wait and Send Keys
    public void enterText(By locator,
                          String text,
                          int seconds) {

        WebElement element =
                waitForElementVisible(locator, seconds);

        element.clear();
        element.sendKeys(text);
    }
}