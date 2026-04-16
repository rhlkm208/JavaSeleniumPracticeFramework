package SeleniumPractice;

import org.openqa.selenium.WebDriver;

public class BasePage {

    protected CommonWait wait;

    public BasePage(WebDriver driver) {
        this.wait = new CommonWait(driver);
    }
}