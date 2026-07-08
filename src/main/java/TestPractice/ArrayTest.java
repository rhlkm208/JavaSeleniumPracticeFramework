package TestPractice;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ArrayTest {
	public static WebDriver driver;
	static ExtentReports extent;
		
	@BeforeMethod
	public void setup() {
		driver = new ChromeDriver();
		
	}
		
	@Test
	public void TakeScreenshot() {
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File("/downloads");
		
		try {
			FileHandler.copy(source, target);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}	
		
	@Test
	public void ScrollPageFeature() {
		
		WebElement element = driver.findElement(By.xpath("//*[text()='Footer']"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", element);
		js.executeScript("window.scrollTo(0,0)");
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
		
	}
	
	public static ExtentReports ExtentReport() {
		
		extent = new ExtentReports();
		
		if (extent==null) {
			
		}
		
		return extent;
	}
		
	public static ExtentReports getExtentReport() {

        if (extent == null) {

            ExtentSparkReporter reporter = new ExtentSparkReporter("reports/ExtentReport.html");

            reporter.config().setReportName("Automation Test Report");
            reporter.config().setDocumentTitle("Selenium Hybrid Framework");

            extent = new ExtentReports();
            extent.attachReporter(reporter);

            extent.setSystemInfo("Tester", "Rahul");
            extent.setSystemInfo("Environment", "QA");
            extent.setSystemInfo("Browser", "Chrome");
        }
        return extent;
    }	

		
}
