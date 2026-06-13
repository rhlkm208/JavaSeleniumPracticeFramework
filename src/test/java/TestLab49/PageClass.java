package TestLab49;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageClass {

	WebDriver driver;
	WebDriverWait wait;

	By firstName = By.xpath("//input[@placeholder='First Name']");
	By lastName = By.xpath("//input[@placeholder='Last Name']");
	By addressField = By.xpath("//textarea[@ng-model='Adress']");
	By emailAddressField = By.xpath("//input[@ng-model='EmailAdress']");
	By phoneField = By.xpath("//input[@ng-model='Phone']");
	By radioButtonMale = By.xpath("//input[@value='Male']");
	By radioButtonFemale = By.xpath("//input[@value='FeMale']");
	By checkboxHobbiesCricket = By.id("checkbox1");
	By checkboxHobbiesMovies = By.id("checkbox2");
	By checkboxHobbiesHockey = By.id("checkbox3");
	By languageBox = By.id("msdd");
	By languageList = By.xpath("//ul[contains(@class,'ui-autocomplete')]");
	By skillsDropdownField = By.xpath("//select[@ng-model='Skill']");
	By countryDropdownField = By.id("countries");
	By selectCountryDropdownField = By.id("country");
	By yearDropdownField = By.id("yearbox");
	By monthDropdownField = By.xpath("//select[@ng-model='monthbox']");
	By dayDropdownField = By.xpath("//select[@ng-model='daybox']");
	By passwordField = By.xpath("//input[@ng-model='Password']");
	By confirmPasswordField = By.xpath("//input[@ng-model='CPassword']");
	By submitButton = By.id("submitbtn");
	By refreshButton = By.id("Button1");

	public PageClass(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}
	
	public WebElement WaitForVisiblityOfElement(By locator) {
	return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
	
	public WebElement WaitForClicakbleElement(By locator) {
		return wait.until(ExpectedConditions.elementToBeClickable(locator));
		}
	

	public WebElement waitForVisibilityOfElement(By locator) {
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}

	public WebElement waitForClickableElement(By locator) {
		return wait.until(ExpectedConditions.elementToBeClickable(locator));
	}

	public void enterText(By locator, String text) {
		waitForVisibilityOfElement(locator).sendKeys(text);
	}

	public void clickRadioButton(By locator) {
		waitForClickableElement(locator).click();
	}

	public void clickCheckBox(By locator) {
		waitForClickableElement(locator).click();
	}
	
	public void selectLanguage(String language, By locator) {
		List <WebElement> langList = driver.findElements(locator);
		for(WebElement langName : langList) {
			if(langName.getText().equalsIgnoreCase(language)) {
				langName.click();
			}
		}
}

	public void selectDropDown(By locator, String value) {
		Select select = new Select(waitForVisibilityOfElement(locator));
		select.selectByVisibleText(value);
	}

	public void clickOnSubmitButton(By locator) {
		waitForClickableElement(locator).click();
	}

	
	public void registration() {

	    enterText(firstName, "Rahul");
	    enterText(lastName, "Kumar");
	    enterText(addressField, "Ward-09, Kamaldah");
	    enterText(emailAddressField, "rahul@test.com");
	    enterText(phoneField, "9876543210");

	    clickRadioButton(radioButtonMale);

	    clickCheckBox(checkboxHobbiesCricket);
	    clickCheckBox(checkboxHobbiesMovies);

	    selectLanguage("English", languageList);

	    selectDropDown(skillsDropdownField, "Java");
	    selectDropDown(countryDropdownField, "Select Country");
	    selectDropDown(selectCountryDropdownField, "India");

	    selectDropDown(yearDropdownField, "1995");
	    selectDropDown(monthDropdownField, "May");
	    selectDropDown(dayDropdownField, "10");

	    enterText(passwordField, "Test@123");
	    enterText(confirmPasswordField, "Test@123");

	    clickOnSubmitButton(submitButton);
	}

}