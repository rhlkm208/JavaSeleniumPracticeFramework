package SeleniumTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ScrollsPageDown {
   public static void main(String[] args) throws InterruptedException {

      // Initiate the Webdriver
      WebDriver driver = new ChromeDriver();

      // adding implicit wait of 12 secs
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));

      //Opening the webpage where we will perform the scroll down
      driver.get("https://www.tutorialspoint.com/selenium/practice/scroll-top.php");

      // JavascriptExecutor to scrolling to page bottom
      JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
      javascriptExecutor.executeScript("window.scrollBy(0,document.body.scrollHeight)");

      // access element at page bottom after scrolling
      String text = driver.findElement
         (By.xpath("/html/body/main/div/div/div[2]/h3[4]")).getText();
      System.out.println("Get text at page bottom: " + text);

      // quitting the browser
      driver.quit();
   }
}