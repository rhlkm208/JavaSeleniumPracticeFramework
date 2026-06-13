package SeleniumTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SeleniumActions1 {

   WebDriver driver;

    public SeleniumActions1(WebDriver driver) {
        this.driver = driver;
    }

    // Method 1
    public void click(By locator) {
        driver.findElement(locator).click();
    }

    // Method 2 (Overloaded)
    public void click(WebElement element) {
        element.click();
    }
    
    
    
}
