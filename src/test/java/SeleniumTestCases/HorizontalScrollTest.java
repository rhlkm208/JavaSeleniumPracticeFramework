package SeleniumTestCases;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HorizontalScrollTest {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.tutorialspoint.com/selenium/practice/horizontal-scroll.php");
    }

    @Test
    public void scrollPageTest() throws InterruptedException {

        JavascriptExecutor js = (JavascriptExecutor) driver;

        // 🔹 Horizontal Scroll (Right)
        js.executeScript("window.scrollBy(1000,0)");
        Thread.sleep(2000);

        // 🔹 Horizontal Scroll (Left)
        js.executeScript("window.scrollBy(-1000,0)");
        Thread.sleep(2000);

        // 🔹 Vertical Scroll (Down)
        js.executeScript("window.scrollBy(0,500)");
        Thread.sleep(2000);

        // 🔹 Scroll to Bottom
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        Thread.sleep(2000);

        // 🔹 Scroll to Top
        js.executeScript("window.scrollTo(0, 0)");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}

