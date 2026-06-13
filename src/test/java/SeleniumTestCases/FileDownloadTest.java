package SeleniumTestCases;

import java.io.File;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FileDownloadTest {

    @Test
    public void downloadFileTest() throws InterruptedException {

        // 🔹 Set download folder path
        String downloadPath = System.getProperty("user.dir") + "/Downloads";

        // 🔹 Configure Chrome download settings
        Map<String, Object> prefs = new HashMap<>();
        prefs.put("download.default_directory", downloadPath);
        prefs.put("download.prompt_for_download", false);
        prefs.put("safebrowsing.enabled", true);

        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("prefs", prefs);
        
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.tutorialspoint.com/selenium/practice/upload-download.php");

        // 🔹 Click Download Button
        driver.findElement(By.id("downloadButton")).click();

        Thread.sleep(5000);  // Wait for download

        // 🔹 Verify file downloaded
        File folder = new File(downloadPath);
        File[] files = folder.listFiles();

        Assert.assertTrue(files.length > 0);

        System.out.println("File downloaded successfully.");

        driver.quit();
    }
}
