package SeleniumTestCases;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ScrollsHorizontal {
   public static void main(String[] args) throws InterruptedException {

      // Initiate the Webdriver
      WebDriver driver = new ChromeDriver();

      // adding implicit wait of 12 secs
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));

      // Opening the webpage where we will perform horizontal scroll
      driver.get("https://www.tutorialspoint.com/selenium/practice/horizontal-scroll.php");

      // JavascriptExecutor to perform horizontal scroll by 20000, 0 pixels
      JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
      javascriptExecutor.executeScript("window.scrollBy(20000,0)", "");

   }
}