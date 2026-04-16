package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownPage extends BasePage {

	private WebDriver driver;
	private By dropdown = By.id("dropdown");
	private By dropdownLink = By.xpath("//a[@href='/dropdown']");

	public DropdownPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	public void navigateToDropdown() {
		driver.findElement(dropdownLink).click();
	}

	private Select getDropdown() {
		return new Select(wait.waitForVisibleElement(dropdown));
	}

	public void selectByIndex(int index) {
		getDropdown().selectByIndex(index);
	}

	public void selectByValue(String value) {
		getDropdown().selectByValue(value);
	}

	public void selectByVisibleText(String text) {
		getDropdown().selectByVisibleText(text);
	}

	public String getSelectedValue() {
		return getDropdown().getFirstSelectedOption().getText();
	}

}