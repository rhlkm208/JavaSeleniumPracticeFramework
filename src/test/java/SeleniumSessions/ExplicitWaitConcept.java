package SeleniumSessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitConcept {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));

        driver.get("https://www.facebook.com");

        // Login Button
        clickOn(driver, By.name("login"), 20);

        // Create a Page Link
        clickOn(driver, By.linkText("Create a Page"), 10);

        driver.quit();
    }

    public static void clickOn(WebDriver driver, By locator, int timeout) {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));

        wait.ignoring(StaleElementReferenceException.class)
            .until(ExpectedConditions.elementToBeClickable(locator))
            .click();
    }
}