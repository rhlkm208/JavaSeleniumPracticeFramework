package SeleniumTestCases;

import java.net.HttpURLConnection;
import java.net.URI;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckTheBrokenLinks {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in");

        List<WebElement> links = driver.findElements(By.tagName("a"));

        for (WebElement link : links) {

            String url = link.getAttribute("href");

            if (url == null || !url.startsWith("http")) {
                continue;
            }

            try {
                URI uri = new URI(url); // ✅ Recommended
                HttpURLConnection conn = (HttpURLConnection) uri.toURL().openConnection();

                conn.setRequestMethod("HEAD");
                conn.connect();

                int responseCode = conn.getResponseCode();

                if (responseCode >= 400) {
                    System.out.println("❌ Broken: " + url);
                } else {
                    System.out.println("✅ Valid: " + url);
                }

                conn.disconnect();

            } catch (Exception e) {
                System.out.println("⚠️ Error with: " + url);
            }
        }

        driver.quit();
    }
}