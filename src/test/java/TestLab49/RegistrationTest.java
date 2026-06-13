package TestLab49;

import org.testng.annotations.Test;

public class RegistrationTest extends BaseTest {

    @Test
    public void registerUser() {

    	RegistrationPage page = new RegistrationPage(driver);

        page.fillRegistrationForm();
        page.submitForm();
    }
}