package SeleniumPractice;

import org.testng.Assert;
import org.testng.annotations.Test;


public class DropdownTest extends BaseTest{
	
	public DropdownPage dp;

	@Test
	public void verifyDropdownFunctionality() {
		dp = new DropdownPage(driver);
		dp.navigateToDropdown();
		dp.selectByValue("1");
		String value1 = dp.getSelectedValue();
		Assert.assertEquals(value1, "Option 1");
		
		dp.selectByValue("2");
		String value2 = dp.getSelectedValue();
		Assert.assertEquals(value2, "Option 2");
	}
}
