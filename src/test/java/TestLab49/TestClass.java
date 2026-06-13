package TestLab49;

import org.testng.annotations.Test;

public class TestClass extends BaseClass {

	@Test
	public void verifyRegistrationPage() {

		PageClass pc = new PageClass(driver);
		pc.registration();
	}

}
