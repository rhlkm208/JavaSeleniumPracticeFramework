package SeleniumTestCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class WaitExplicitWaitTest {

	@Test
	public void explicitWaitExample() {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.hyrtutorials.com/p/waits-demo.html");

		// Click button
		driver.findElement(By.id("btn1")).click();

		// 🔹 Explicit Wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
        //Handle StaleElementReferenceException
		WebElement textBox = wait
				.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOfElementLocated(By.id("txt1"))));

		textBox.sendKeys("Explicit Wait Example");

		driver.quit();
	}
}
