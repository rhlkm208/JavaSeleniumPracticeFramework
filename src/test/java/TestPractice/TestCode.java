package TestPractice;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class TestCode {

	WebDriver driver;

	By locator1 = By.xpath("//input[@id='test']");
	By locator2 = By.xpath("//button");

	@Test
	public void TestMethod() {

		driver = new ChromeDriver();

		driver.get("https://example.com");

		// Alert
		Alert alert = driver.switchTo().alert();
		alert.accept();

		// Element
		WebElement ele = driver.findElement(locator1);

		// JS Executor
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView()", ele);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(locator1));
		WebElement ele2 = wait.until(ExpectedConditions.visibilityOfElementLocated(locator2));
		ele2.click();
		
		FluentWait<WebDriver> fwait = new FluentWait<>(driver);
		fwait.until(ExpectedConditions.refreshed(ExpectedConditions.elementToBeClickable(locator1)));
		fwait.until(ExpectedConditions.elementToBeClickable(locator1)).click();
		
		String parentWindow = driver.getWindowHandle();
		
		ele.click();
		
		Set<String> windows = driver.getWindowHandles();
		
		for(String window : windows) {
			if(!window.equals(parentWindow)) {
				driver.switchTo().window(window);
				
				String title = driver.getTitle();
				System.out.println(title);
			}
			
		}
		
		driver.switchTo().defaultContent();
		

		driver.quit();
	}
}