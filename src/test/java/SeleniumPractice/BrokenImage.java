package SeleniumPractice;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class BrokenImage extends BaseTest {

	
	private By BrokenImageLink = By.xpath("//a[@href='/broken_images']");

	@Test
	public void verifyBrokenImage() {
		
		driver.findElement(BrokenImageLink).click();

		List<WebElement> images = driver.findElements(By.tagName("img"));

		for (WebElement image : images) {

			String imageUrl = image.getAttribute("src");

			try {

				URL url = new URL(imageUrl);

				HttpURLConnection connection = (HttpURLConnection) url.openConnection();
				connection.setRequestMethod("GET");
				connection.connect();

				int statusCode = connection.getResponseCode();

				if (statusCode >= 400) {

					System.out.println("Broken Image" + imageUrl + " Status Code " + statusCode);
				} else {
					System.out.println("Valid Image" + imageUrl + " Status Code " + statusCode);
				}
			} catch (Exception e) {
				System.out.println(" Error with image: " + imageUrl);
			}
		}

	}
}
