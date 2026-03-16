package SeleniumTestCases;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class ScreenshotCapture {
   public static void main(String[] args) throws InterruptedException, IOException {
      
      // Initiate the Webdriver
      WebDriver driver = new ChromeDriver();
      driver.manage().window().maximize();
      
      // adding implicit wait of 15 secs
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
      
      // Opening the webpage where we will identify an element
      driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
      
      // Identify the input box with xpath locator
      WebElement e = driver.findElement(By.xpath("//*[@id='name']"));
      
      // enter text in input box
      e.sendKeys("Selenium");
      
      // Get the value entered
      String text = e.getAttribute("value");
      System.out.println("Entered text is: " + text);
      
      // take full screenshot and store in project location
      File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
      FileUtils.copyFile(scrFile, new File("C://Users//rahulkumar02//eclipse-workspace//JavaSeleniumPracticeFramework//src//test//resources//ImageFullPage.png"));
            
      // Closing browser
      driver.quit();
   }
}