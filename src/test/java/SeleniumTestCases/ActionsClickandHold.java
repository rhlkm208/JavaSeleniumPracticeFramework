package SeleniumTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;

public class ActionsClickandHold {
	WebDriver driver;

	@BeforeMethod
	public void setup() {
		// Initiate the Webdriver
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		/*
		 * System.setProperty("webdriver.edge.driver", "\\Drivers\\msedgedriver.exe");
		 * WebDriverManager.edgedriver().setup(); driver = new EdgeDriver();
		 * driver.manage().window().maximize();
		 */

		// adding implicit wait of 15 secs
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		// Opening the webpage
		driver.get("https://www.tutorialspoint.com/selenium/practice/menu.php#");

	}

	@Test
	public void actionsClickAndHold() {

		// identify element with xpath for click and hold
		WebElement m = driver.findElement(By.xpath("/html/body/main/div/div/div[2]/nav/div/a"));

		// get element color in rgba format
		String s = m.getCssValue("color");
		System.out.println("rgba code for color element: " + s);

		// object of Actions class to click and hold
		Actions a = new Actions(driver);
		a.clickAndHold(m).build().perform();

		// get element color in rgba format
		String c = m.getCssValue("color");
		System.out.println("rgba code for color for element after click and hold: " + c);

	}

	@AfterMethod
	public void tearDown() {
		// Closing browser

		if (driver != null) {
			driver.quit();
		}

	}
}