package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.List;

public class FollowingAxisDemo {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com" + "/login");

		Thread.sleep(2000);

		// ── following:: ───────────────────────────────
		// ALL nodes after username input
		// Dissimilar nodes — different tags
		List<WebElement> allFollowing = driver.findElements(By.xpath("//input[@id='username']" + "/following::*"));

		System.out.println("following:: found: " + allFollowing.size() + " dissimilar nodes");

		for (WebElement node : allFollowing) {
			System.out.println("  Tag: " + node.getTagName() + " | Text: " + node.getText().trim());
		}

		// ── following-sibling:: ───────────────────────
		// Only sibling nodes after current
		List<WebElement> siblings = driver.findElements(By.xpath("//input[@id='username']" + "/following-sibling::*"));

		System.out.println("\nfollowing-sibling:: found: " + siblings.size() + " sibling nodes");

		for (WebElement sibling : siblings) {
			System.out.println("  Tag: " + sibling.getTagName() + " | Text: " + sibling.getText().trim());
		}

		driver.quit();
	}
}



/*
 * ## All XPath Axes —
 * 
 * Quick Reference
 * 
 * following:: → ALL nodes AFTER current dissimilar nodes ✅
 * 
 * following-sibling:: → sibling nodes AFTER current same parent only
 * 
 * preceding:: → ALL nodes BEFORE current
 * 
 * preceding-sibling:: → sibling nodes BEFORE current
 * 
 * parent:: → immediate parent node
 * 
 * ancestor:: → all parent nodes upward
 * 
 * descendant:: → all child nodes downward
 * 
 * child:: → direct children only
 * 
 * self:: → current node itself
 */
 