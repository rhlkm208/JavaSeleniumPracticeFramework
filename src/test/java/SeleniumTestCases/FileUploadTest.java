package SeleniumTestCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FileUploadTest {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.tutorialspoint.com/selenium/practice/upload-download.php");
    }

    @Test
    public void uploadFileTest() {

        // 🔹 Provide full file path
        String filePath = "C:\\Users\\rahulkumar02\\eclipse-workspace\\JavaSeleniumPracticeFramework\\src\\test\\resources\\testfile.txt";

        driver.findElement(By.id("uploadFile")).sendKeys(filePath);

        System.out.println("File uploaded successfully.");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
