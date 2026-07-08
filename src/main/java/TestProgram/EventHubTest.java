package TestProgram;

import org.testng.Assert;
import org.testng.annotations.Test;

public class EventHubTest extends EventHubBaseClass {

	@Test
	public void loginTest() {
		
		EventHubPage page = new EventHubPage(driver);		
		page.login("standard_user", "secret_sauce");		
		Assert.assertTrue(driver.getCurrentUrl().contains("inventory.html"), "Login failed");
		
	}
}
