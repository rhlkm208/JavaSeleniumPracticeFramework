package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class SauceDemoPage {
	
	private WebDriver driver;
	private CommonWait wait;
	
	public SauceDemoPage(WebDriver driver) {
		this.driver=driver;
		this.wait=new CommonWait(driver);
	}

	private By username = By.id("user-name");
	private By password = By.id("password");
	private By loginButton = By.id("login-button");
	private By appLogo = By.xpath("//div[@class='app_logo']");
	
	private By addToCartProduct = By.id("add-to-cart-sauce-labs-bike-light");
	private By addToCartButton = By.xpath("//a[@data-test='shopping-cart-link']");
	
	private By productName = By.xpath("//div[text()='Sauce Labs Bike Light']");
	private By productPrice = By.xpath("//div[text()='Sauce Labs Bike Light']/following::div[2]/div");
	
	
	public void login(String uname, String pwd) {
		wait.waitForClickableElement(username).sendKeys(uname);
		wait.waitForClickableElement(password).sendKeys(pwd);
		wait.waitForClickableElement(loginButton).click();
		String appLogoText = driver.findElement(appLogo).getText();
		Assert.assertTrue(appLogoText.contains("Swag Labs"), "Failed Test case");
	}
	
	public void addToCart() {
		wait.waitForPresenceOfElement(addToCartProduct).click();
		wait.waitForClickableElement(addToCartButton).click();
	}
	
	public void validateProductAndPrice() {
		String proname = driver.findElement(productName).getText();
		String proprice = driver.findElement(productPrice).getText();
		
		Assert.assertTrue(proname.contains("Sauce Labs Bike Light"), "Not Matched");
		Assert.assertTrue(proprice.contains("$9.99"), "Not Matched");

	}
}
