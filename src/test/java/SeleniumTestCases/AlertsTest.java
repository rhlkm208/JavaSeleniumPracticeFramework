package SeleniumTestCases;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AlertsTest {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.tutorialspoint.com/selenium/practice/alerts.php");
    }

    @Test
    public void handleAlerts() throws InterruptedException {

        // ==========================
        // 1️⃣ Simple Alert
        // ==========================
        driver.findElement(By.xpath("//button[text()='Alert']")).click();

        Alert simpleAlert = driver.switchTo().alert();
        System.out.println("Simple Alert Text: " + simpleAlert.getText());
        simpleAlert.accept();  // Click OK


        // ==========================
        // 2️⃣ Lazy Alert
        // ==========================
        driver.findElement(By.xpath("//button[@onclick='myMessage()']")).click();
        Thread.sleep(10000);

        Alert lazyAlert = driver.switchTo().alert();
        System.out.println("Confirm Alert Text: " + lazyAlert.getText());
        lazyAlert.accept();   // Click Cancel
        
     // ==========================
        // 3️⃣ Confirmation Alert
        // ==========================
        driver.findElement(By.xpath("//button[@onclick='myDesk()']")).click();

        Alert confirmAlert = driver.switchTo().alert();
        System.out.println("Confirm Alert Text: " + confirmAlert.getText());
        confirmAlert.dismiss();   // Click Cancel
        
        driver.findElement(By.xpath("//button[@onclick='myDesk()']")).click();
        confirmAlert.accept();   // Click Ok


        // ==========================
        // 4th Prompt Alert
        // ==========================
        driver.findElement(By.xpath("//button[@onclick='myPromp()']")).click();

        Alert promptAlert = driver.switchTo().alert();
        promptAlert.sendKeys("Selenium Test");
        promptAlert.accept();  // Click OK

        System.out.println("All alerts handled successfully.");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
