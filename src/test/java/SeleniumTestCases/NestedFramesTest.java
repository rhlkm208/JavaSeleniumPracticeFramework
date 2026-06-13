package SeleniumTestCases;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NestedFramesTest {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.tutorialspoint.com/selenium/practice/nestedframes.php");
    }

    @Test
    public void handleNestedFrames() {

        // 🔹 Switch to Parent Frame (index 0)
        driver.switchTo().frame(0);

        WebElement parentText = driver.findElement(By.tagName("body"));
        System.out.println("Parent Frame Text: " + parentText.getText());

        // 🔹 Switch to Child Frame inside Parent
        driver.switchTo().frame(0);

        WebElement childText = driver.findElement(By.tagName("body"));
        System.out.println("Child Frame Text: " + childText.getText());

        // 🔹 Go back to Parent Frame
        driver.switchTo().parentFrame();

        // 🔹 Go back to Main Page
        driver.switchTo().defaultContent();

        System.out.println("Nested Frames handled successfully.");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
