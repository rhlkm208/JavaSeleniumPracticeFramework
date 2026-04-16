package SeleniumPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonWait {

    private WebDriverWait wait;
    private static int timeout = 10;

    public CommonWait(WebDriver driver) {
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
    }

    // 🔹 Wait Methods
    public WebElement waitForClickableElement(By locator) {
        return wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    public WebElement waitForVisibleElement(By locator) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public WebElement waitForPresenceOfElement(By locator) {
        return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    }

    public boolean waitForInvisibility(By locator) {
        return wait.until(ExpectedConditions.invisibilityOfElementLocated(locator));
    }

    // 🔥 Reusable Actions

    // Click Action
    public void click(By locator) {
        waitForClickableElement(locator).click();
    }

    // Type Action
    public void type(By locator, String text) {
        WebElement element = waitForVisibleElement(locator);
        element.clear();
        element.sendKeys(text);
    }

    // Get Text
    public String getText(By locator) {
        return waitForVisibleElement(locator).getText();
    }
}