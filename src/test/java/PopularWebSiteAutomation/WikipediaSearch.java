package PopularWebSiteAutomation;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WikipediaSearch {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.wikipedia.org");

		// Search box
		WebElement searchBox = driver.findElement(By.id("searchInput"));

		searchBox.sendKeys("Agentic");

		// Wait for suggestions
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		List<WebElement> suggestions = wait.until(
				ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[contains(@class,'suggestion')]")));

		System.out.println("Suggestions not containing 'Agentic':");

		for (WebElement suggestion : suggestions) {

			String text = suggestion.getText();

			// Ignore suggestions containing Agentic
			if (!text.toLowerCase().contains("agentic")) {

				System.out.println(text);
			}
		}

		driver.quit();
	}
}