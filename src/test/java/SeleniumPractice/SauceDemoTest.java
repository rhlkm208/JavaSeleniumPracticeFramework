package SeleniumPractice;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SauceDemoTest extends BaseTest{
	private SauceDemoPage sp;
	
	/*
	 * @BeforeMethod public void setupTest() { sp = new SauceDemoPage(driver);
	 * sp.login("standard_user", "secret_sauce"); }
	 */

	@Test(enabled=false)
	public void verifyLogin() {
		sp = new SauceDemoPage(driver);
		sp.login("standard_user", "secret_sauce");	
	}
	
	@Test
	public void verifyAddToCart() {
		sp = new SauceDemoPage(driver);
		sp.login("standard_user", "secret_sauce");
		sp.addToCart();
		sp.validateProductAndPrice();
	}
}
