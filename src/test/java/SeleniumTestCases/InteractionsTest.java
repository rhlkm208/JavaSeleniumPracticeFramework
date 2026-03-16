package SeleniumTestCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class InteractionsTest {

    WebDriver driver;
    WebDriverWait wait;

    @BeforeMethod
    public void setUp() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testkru.com/");

        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
         
    }

    @Test
    public void automateInteractionsSection() {

        // 1️⃣ Click Interactions Menu
        WebElement interactions = wait.until(
                ExpectedConditions.elementToBeClickable(By.linkText("Interactions"))
        );
        interactions.click();

        // 2️⃣ Click Frames under Interactions
        WebElement frames = wait.until(
                ExpectedConditions.elementToBeClickable(By.id("sidebarFramesMenu"))
        );
        frames.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        

        // 3️⃣ Validate navigation
        wait.until(ExpectedConditions.urlContains("Frames"));
        Assert.assertTrue(driver.getCurrentUrl().contains("Frames"));
        
        driver.switchTo().frame(0);
        

        System.out.println("Successfully navigated to Frames page.");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}

