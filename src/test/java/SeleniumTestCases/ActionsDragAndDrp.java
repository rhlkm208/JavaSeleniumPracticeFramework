package SeleniumTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class ActionsDragAndDrp {
   public static void main(String[] args) throws InterruptedException {

      // Initiate the Webdriver
      WebDriver driver = new ChromeDriver();

      // adding implicit wait of 15 secs
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

      // URL launch for accessing drag and drop elements
      driver.get("https://www.tutorialspoint.com/selenium/practice/droppable.php");

      // identify source and target elements for drag and drop
      WebElement sourceElement= driver.findElement(By.id("draggable"));
      WebElement targetElement= driver.findElement(By.id("droppable"));

      // drag and drop operations without build and perform methods
      Actions a = new Actions(driver);
      a.dragAndDrop(sourceElement, targetElement).build().perform();

      // identify text after element is dropped
      WebElement text = driver.findElement(By.xpath("//*[@id='droppable']/p"));
      System.out.println("Text is : " + text.getText());

      // quitting browser after drag and drop operations completed
      driver.quit();
   }
}
