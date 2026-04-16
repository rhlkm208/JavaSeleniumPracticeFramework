package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BaseAuthPage extends BasePage {
	private WebDriver driver;
	private By clickOnAuthLink = By.xpath("//a[@href='/basic_auth']");
	private By successMessage = By.xpath("//h3[text()='Basic Auth']");

	
    public BaseAuthPage(WebDriver driver) {
        super(driver);
        this.driver=driver;
    }

    public void loginWithAuth(String username, String password) {
        wait.click(clickOnAuthLink);
        driver.get("https://" + username + ":" + password + "@the-internet.herokuapp.com/basic_auth");
    }

    public String getHeaderText() {
        return wait.getText(successMessage);
    }
}
