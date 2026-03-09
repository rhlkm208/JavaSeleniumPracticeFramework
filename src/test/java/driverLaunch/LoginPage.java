package driverLaunch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    private WebDriver driver;

    @FindBy(id = "loginBtn")
    private WebElement loginButton;

    @FindBy(id = "username")
    private WebElement userName;

    @FindBy(id = "password")
    private WebElement password;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement submit;

    // ✅ Driver passed — PageFactory initialized correctly
    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    
    public WebElement getLoginButton() {
		return loginButton;
	}


    public void clickLoginButton() {
        loginButton.click();
    }

    public void enterUsername(String username) {
        userName.sendKeys(username);
    }

    public void enterPassword(String pwd) {
        password.sendKeys(pwd);
    }

    public void clickSubmit() {
        submit.click();
    }
    
    
    // One clean reusable method
    public void login(String username, String pwd) {
        clickLoginButton();
        enterUsername(username);
        enterPassword(pwd);
        clickSubmit();
    }

	
}