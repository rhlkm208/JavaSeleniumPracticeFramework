package SeleniumTestCases;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class ScreenshotCaptureException {
   public static void main(String[] args) throws InterruptedException, IOException {

      // Initiate the Webdriver
      WebDriver driver = new ChromeDriver();
      driver.manage().window().maximize();

      // adding implicit wait of 15 secs
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

      // Opening the webpage where we will identify an element
      driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");

      try {
         // Identify the input box with xpath locator
         WebElement e = driver.findElement(By.xpath("//*[@id='names']"));

         // enter text in input box
         e.sendKeys("Selenium");
         System.out.println("Step successfully executed");
      }

      catch(Exception e) {
         // take screenshot on failure and store in project location
         File scrFile
            = ((TakesScreenshot) driver).
            getScreenshotAs(OutputType.FILE);
         FileUtils.copyFile(scrFile, new File("C://Users//rahulkumar02//eclipse-workspace//JavaSeleniumPracticeFramework//src//test//resources//ImageException.png"));
         
         System.out.println("Element could not be found - Step failed");
      }

      // Closing browser
      driver.quit();
   }
}
