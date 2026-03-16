package SeleniumTestCases;


import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BrowserWindowsTest {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.tutorialspoint.com/selenium/practice/browser-windows.php");
    }

    @Test
    public void handleBrowserWindows() {

        // 🔹 Store Parent Window
        String parentWindow = driver.getWindowHandle();
        System.out.println("Parent Window ID: " + parentWindow);

        // 🔹 Click "New Tab" button
        driver.findElement(By.xpath("//button[text()='New Tab']")).click();

        // 🔹 Get all window handles
        Set<String> allWindows = driver.getWindowHandles();

        // 🔹 Switch to new window
        for (String window : allWindows) {
            if (!window.equals(parentWindow)) {
                driver.switchTo().window(window);
                System.out.println("Switched to Child Window");
                break;
            }
        }

        // 🔹 Perform action in child window
        System.out.println("Child Window Title: " + driver.getTitle());

        // 🔹 Close child window
        driver.close();

        // 🔹 Switch back to parent window
        driver.switchTo().window(parentWindow);

        System.out.println("Back to Parent Window: " + driver.getTitle());
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}

