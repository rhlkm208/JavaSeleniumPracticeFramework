package SeleniumPractice;

import org.testng.annotations.Test;

public class CheckboxTest extends BaseTest {

	@Test
	public void verifyCheckbox() throws InterruptedException {
		CheckboxPage cb = new CheckboxPage(driver);
		cb.navigateToCheckboxPage();
		cb.checkboxtest();
	}
}
