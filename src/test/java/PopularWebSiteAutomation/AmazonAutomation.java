package PopularWebSiteAutomation;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AmazonAutomation {
	protected WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@Test
	public void iPhone17Test() {

		
		// 1. Go to Amazon
		driver.get("https://www.amazon.in");

		// 2. Search iphone 17
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 17");

		driver.findElement(By.id("nav-search-submit-button")).click();

		// 3. Select first result
		List<WebElement> results = driver.findElements(By.xpath("//div[@data-component-type='s-search-result']"));

		WebElement firstProduct = results.get(0);

		// Print name
		String name = firstProduct.findElement(By.xpath(".//h2/span")).getText();

		System.out.println("Product Name = " + name);

		// Print price
		String price = firstProduct.findElement(By.xpath(".//span[@class='a-price-whole']")).getText();

		System.out.println("Price = " + price);

		// Click first product
		firstProduct.findElement(By.xpath(".//h2")).click();

		// 4. Switch to new tab
		String parent = driver.getWindowHandle();

		for (String win : driver.getWindowHandles()) {
		    if (!win.equals(parent)) {
		        driver.switchTo().window(win);
		    }
		}
	}
		
	
		public void relativeLocatormethod() {

		WebElement AddToCartButton = driver.findElement(By.id("add-to-cart-button"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", AddToCartButton);
		
		// 5. Click Add to cart
		AddToCartButton.click();

		System.out.println("Added to cart");
		
		
		}

	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}