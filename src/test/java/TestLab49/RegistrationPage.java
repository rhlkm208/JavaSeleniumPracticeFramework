package TestLab49;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class RegistrationPage {

	private WebDriver driver;

	By firstName = By.xpath("//input[@placeholder='First Name']");
	By lastName = By.xpath("//input[@placeholder='Last Name']");
	By address = By.xpath("//textarea[@ng-model='Adress']");
	By email = By.xpath("//input[@type='email']");
	By phone = By.xpath("//input[@type='tel']");
	By genderMale = By.xpath("//input[@value='Male']");
	By hobbyCricket = By.id("checkbox1");
	By skills = By.id("Skills");
	By languages = By.id("msdd");
	By english = By.xpath("//a[text()='English']");
	By india = By.id("countries");
	By year = By.id("yearbox");
	By month = By.xpath("//select[@placeholder='Month']");
	By day = By.id("daybox");
	By password = By.id("firstpassword");
	By confirmPassword = By.id("secondpassword");
	By submit = By.id("submitbtn");

	public RegistrationPage(WebDriver driver) {
		this.driver = driver;

	}

	public void enterText(By locator, String value) {
		driver.findElement(locator).sendKeys(value);
	}

	public void clickElement(By locator) {
		driver.findElement(locator).click();
	}

	public void selectDropdown(By locator, String value) {
		Select select = new Select(driver.findElement(locator));
		select.selectByVisibleText(value);
	}

	public void fillRegistrationForm() {

		enterText(firstName, "Rahul");
		enterText(lastName, "Kumar");
		enterText(address, "Bangalore");
		enterText(email, "rahul@test.com");
		enterText(phone, "9876543210");

		clickElement(genderMale);
		clickElement(hobbyCricket);

		selectDropdown(skills, "Java");

		clickElement(languages);
		clickElement(english);
		clickElement(By.tagName("body")); // close dropdown

		selectDropdown(india, "India");
		selectDropdown(year, "1995");
		selectDropdown(month, "May");
		selectDropdown(day, "15");

		enterText(password, "Test@123");
		enterText(confirmPassword, "Test@123");
	}

	public void submitForm() {
		clickElement(submit);
	}
}
