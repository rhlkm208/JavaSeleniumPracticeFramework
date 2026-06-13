package SeleniumTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class WindowHandleExample {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/windows");

        // Get parent window ID
        String parentWindow = driver.getWindowHandle();

        System.out.println("Parent Window ID: " + parentWindow);

        // Click link to open new window
        driver.findElement(By.linkText("Click Here")).click();

        // Get all window handles
        Set<String> windows = driver.getWindowHandles();

        // Loop through windows
        for (String win : windows) {

            if (!win.equals(parentWindow)) {

                driver.switchTo().window(win);

                System.out.println("Child Window Title: "
                        + driver.getTitle());

                // Get text from child window
                String text =
                        driver.findElement(By.tagName("h3")).getText();

                System.out.println("Text: " + text);

                // Close child window
                driver.close();
            }
        }

        // Switch back to parent
        driver.switchTo().window(parentWindow);

        System.out.println("Back to Parent: "
                + driver.getTitle());

        driver.quit();
    }
}