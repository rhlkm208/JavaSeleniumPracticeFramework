package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {
	private WebDriver driver;

	private By clickOnLoginLink = By.xpath("//a[@href='/login']");
    private By username = By.id("username");
    private By password = By.id("password");
    private By loginBtn = By.xpath("//button[@type='submit']");
    private By successMsg = By.id("flash");
    private By logoutBtn = By.xpath("//a[@href='/logout']");

    public LoginPage(WebDriver driver) {
        super(driver);
        this.driver=driver;
    }
    
    public void navigateToLoginPage() {
		driver.findElement(clickOnLoginLink).click();
	}

    public void login(String uname, String pwd) {
        wait.type(username, uname);
        wait.type(password, pwd);
        wait.click(loginBtn);
    }

    public String getSuccessMessage() {
        return wait.getText(successMsg);
    }

    public void clickLogout() {
        wait.click(logoutBtn);
    }

	public String getCurrentUrl() {
		return driver.getCurrentUrl();
	}

	
}