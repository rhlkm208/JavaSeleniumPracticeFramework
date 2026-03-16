package SeleniumTestCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WaitImplicitWaitExample {

    @Test
    public void implicitWaitExample() {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // 🔹 Implicit Wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.hyrtutorials.com/p/waits-demo.html");

        // Click button (text box appears after delay)
        driver.findElement(By.id("btn1")).click();

        // No explicit wait used
        driver.findElement(By.id("txt1")).sendKeys("Implicit Wait Example");

        driver.quit();
    }
}

