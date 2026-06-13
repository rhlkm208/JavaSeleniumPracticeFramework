package SeleniumTestCases;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FrameTest {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
    }

    @Test
    public void handleAllFrames() {

        // =============================
        // Print total number of iframes
        // =============================
        List<WebElement> frames = driver.findElements(By.tagName("iframe"));
        System.out.println("Total Frames: " + frames.size());

        // =============================
        // FRAME 1
        // =============================
        driver.switchTo().frame("frm1");

        Select courseDropdown = new Select(driver.findElement(By.id("course")));
        courseDropdown.selectByVisibleText("Java");

        driver.switchTo().defaultContent();

        // =============================
        // FRAME 2
        // =============================
        driver.switchTo().frame("frm2");

        driver.findElement(By.id("firstName")).sendKeys("John");
        driver.findElement(By.id("lastName")).sendKeys("Doe");

        driver.switchTo().defaultContent();

        // =============================
        // FRAME 3
        // =============================
        driver.switchTo().frame("frm3");

        // Inside Frame3 there is another frame
        driver.switchTo().frame("frm1");

        Select nestedDropdown = new Select(driver.findElement(By.id("course")));
        nestedDropdown.selectByVisibleText("Python");

        // Come out of nested frame
        driver.switchTo().parentFrame();

        driver.switchTo().defaultContent();

        System.out.println("All frames handled successfully.");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
