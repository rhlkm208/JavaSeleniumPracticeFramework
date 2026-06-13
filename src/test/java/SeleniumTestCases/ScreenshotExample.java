package SeleniumTestCases;

import java.io.File;

import java.io.IOException;
 
import org.openqa.selenium.OutputType;

import org.openqa.selenium.TakesScreenshot;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
 
import org.openqa.selenium.io.FileHandler;
 
public class ScreenshotExample {
 
    public static void main(String[] args) throws IOException {
 
        WebDriver driver = new ChromeDriver();
 
        driver.get("https://www.google.com");
 
        // Step 1: Typecast driver to TakesScreenshot

        TakesScreenshot ts = (TakesScreenshot) driver;
 
        // Step 2: Capture screenshot as File

        File src = ts.getScreenshotAs(OutputType.FILE);
 
        // Step 3: Create destination path

        File dest = new File("C:\\Screenshots\\google.png");
 
        // Step 4: Copy file to destination

        FileHandler.copy(src, dest);
 
        System.out.println("Screenshot taken successfully");
 
        driver.quit();

    }

}

 
