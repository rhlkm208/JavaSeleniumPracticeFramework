package SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class CheckboxPage {

	private WebDriver driver;
	private By checkboxLink = By.xpath("//a[@href='/checkboxes']");
	private By checkbox1 = By.xpath("//form[@id='checkboxes']/input[1]");
	private By checkbox2 = By.xpath("//form[@id='checkboxes']/input[2]");

	public CheckboxPage(WebDriver driver) {
		this.driver = driver;
	}

	public void navigateToCheckboxPage() {
		driver.findElement(checkboxLink).click();
	}

	public void checkbox() throws InterruptedException {
		WebElement chckbox1 = driver.findElement(checkbox1);
		WebElement chckbox2 = driver.findElement(checkbox2);

		if (!chckbox1.isSelected()) {
			chckbox1.click();
			Thread.sleep(5000);
		} else if (chckbox2.isSelected()) {
			chckbox2.click();
			Thread.sleep(5000);
		}

		Assert.assertTrue(chckbox1.isSelected(), "Checkbox 1 is not selected");
		Assert.assertFalse(chckbox2.isSelected(), "Checkbox 2 is still selected");

	}

	public void checkboxtest() {
		List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));

		WebElement checkbox1 = checkboxes.get(0);
		WebElement checkbox2 = checkboxes.get(1);

		// Step 1: Select checkbox1 if not selected
		if (!checkbox1.isSelected()) {
			checkbox1.click();
		}

		// Step 2: Deselect checkbox2 if already selected
		if (checkbox2.isSelected()) {
			checkbox2.click();
		}

		// Step 3: Validation
		Assert.assertTrue(checkbox1.isSelected(), "Checkbox 1 is NOT selected");
		Assert.assertFalse(checkbox2.isSelected(), "Checkbox 2 is still selected");
	}
}
