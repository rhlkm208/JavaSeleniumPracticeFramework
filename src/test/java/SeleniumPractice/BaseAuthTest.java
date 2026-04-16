package SeleniumPractice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class BaseAuthTest extends BaseTest {

	@Test
	public void verifyBasicAuth() {

		BaseAuthPage bs = new BaseAuthPage(driver);
		bs.loginWithAuth("admin", "admin");
		String header = bs.getHeaderText();
		Assert.assertTrue(header.contains("Basic Auth"), "Basic Auth Failed");

	}

}
