package SeleniumPractice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

	@Test
	public void verifyLoginPage() {
		LoginPage lp = new LoginPage(driver);
		lp.navigateToLoginPage();
		lp.login("tomsmith", "SuperSecretPassword!");
		String message = lp.getSuccessMessage();
		Assert.assertTrue(message.contains("You logged into a secure area!"), "Login Failed");

		lp.clickLogout();

		Assert.assertEquals(lp.getCurrentUrl(), "https://the-internet.herokuapp.com/login", "Logout Failed");

	}

	@Test
	public void invalidLoginTest() {

		LoginPage cp = new LoginPage(driver);

		cp.navigateToLoginPage();
		cp.login("wrongUser", "wrongPass");

		String message = cp.getSuccessMessage();

		Assert.assertTrue(message.contains("Your username is invalid!"));
	}

}
