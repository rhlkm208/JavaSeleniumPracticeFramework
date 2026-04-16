package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ShadowDomTest extends BaseTest {
	
	@Test
	public void verifyShadowDOM() {

	    driver.get("https://books-pwakit.appspot.com/");

	    JavascriptExecutor js = (JavascriptExecutor) driver;

	    // Step 1: Access first shadow root
	    WebElement shadowHost1 = driver.findElement(By.tagName("book-app"));
	    WebElement shadowRoot1 = (WebElement) js.executeScript("return arguments[0].shadowRoot", shadowHost1);

	    // Step 2: Access second shadow root
	    WebElement appHeader = shadowRoot1.findElement(By.cssSelector("app-header"));
	    WebElement shadowRoot2 = (WebElement) js.executeScript("return arguments[0].shadowRoot", appHeader);

	    // Step 3: Locate search input
	    WebElement input = shadowRoot2.findElement(By.cssSelector("input#input"));

	    // Step 4: Enter text
	    input.sendKeys("Selenium");

	    // Optional wait
	//    Thread.sleep(3000);

	    // Step 5: Validate result
	    WebElement result = shadowRoot1.findElement(By.cssSelector(".books-desc"));

	    System.out.println("Result: " + result.getText());

	    Assert.assertTrue(result.getText().contains("Selenium"));
	}

}
