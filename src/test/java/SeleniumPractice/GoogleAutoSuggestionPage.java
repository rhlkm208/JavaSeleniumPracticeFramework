package SeleniumPractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;
import org.testng.Assert;

public class GoogleAutoSuggestionPage {

    private WebDriver driver;
    private WebDriverWait wait;

    private By textbox = By.name("q");
    private By suggestionList = By.xpath("//ul[@role='listbox']//li");
    private By searchResults = By.xpath("//h3");

    public GoogleAutoSuggestionPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void selectSpecificSuggestion(String expectedText, String text) {

        // Step 1: Enter text
        driver.findElement(textbox).sendKeys(text);

        // Step 2: Wait for suggestions
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(suggestionList));

        List<WebElement> lists = driver.findElements(suggestionList);

        // Step 3: Select suggestion
        for (WebElement list : lists) {

            String suggestion = list.getText();

            if (suggestion.toLowerCase().contains(expectedText.toLowerCase())) {
                list.click();
                break; // ✅ VERY IMPORTANT
            }
        }

        // Step 4: Validate result (OUTSIDE loop)
        WebElement result = wait.until(ExpectedConditions.visibilityOfElementLocated(searchResults));

        String res = result.getText();
        System.out.println("Result: " + res);

        Assert.assertTrue(res.toLowerCase().contains(expectedText.toLowerCase()),
                "Invalid result: Expected text not found");
    }
}