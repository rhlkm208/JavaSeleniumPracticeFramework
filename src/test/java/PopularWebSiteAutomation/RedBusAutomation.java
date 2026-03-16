package PopularWebSiteAutomation;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RedBusAutomation {

	public class TestStatic {
		protected WebDriver driver;

		@BeforeMethod
		public void setup() {
			driver = new ChromeDriver();
			driver.get("https://www.redbus.in/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}

		@Test
		public void redbusmethod() throws InterruptedException {

			driver.findElement(By.xpath("//input[@id='srcinput']")).sendKeys("Bengaluru");

			List<WebElement> FromElements = driver.findElements(By.xpath("//div[starts-with(@class, 'listItem')]"));

			System.out.println(FromElements.size());

			for (WebElement element : FromElements) {
				if (element.getText().equalsIgnoreCase("Majestic")) {
					element.click();
				}
			}

			driver.findElement(By.xpath("//input[@id='destinput']")).sendKeys("Mysore");

			List<WebElement> ToElements = driver.findElements(By.xpath("//div[starts-with(@class, 'listItem')]"));

			System.out.println(ToElements.size());

			for (WebElement element : ToElements) {
				if (element.getText().equalsIgnoreCase("Nanjanagudu, Mysore")) {
					element.click();
				}
			}

			Thread.sleep(5000);

			String parentWindow = driver.getWindowHandle();

			WebElement SiteMapLink = driver.findElement(By.xpath("//a[text()= 'Sitemap']"));

			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView()", SiteMapLink);
			Thread.sleep(5000);

			SiteMapLink.click();

			Set<String> windows = driver.getWindowHandles();

			System.out.println(windows.size());

			for (String window : windows) {
				if (!window.equals(parentWindow)) {
					driver.switchTo().window(window);
				}
			}

			WebElement SiteMapHeader = driver.findElement(By.xpath("//h1[text()=' RTC with redBus ']"));
			System.out.println(SiteMapHeader.getText());

		}

		@AfterMethod
		public void tearDown() {
			driver.quit();
		}

	}

}