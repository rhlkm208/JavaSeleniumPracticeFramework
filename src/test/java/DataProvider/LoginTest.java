package DataProvider;

import org.testng.annotations.Test;

public class LoginTest {

    @Test(dataProvider = "excelData", dataProviderClass = DataProviders.class)
    public void loginTest(String username, String password) {

        System.out.println("Username: " + username);
        System.out.println("Password: " + password);

        // Selenium logic here
    }
    
    @Test(dataProvider = "jsonData", dataProviderClass = DataProviders.class)
    public void loginTestJson(String username, String password) {

        System.out.println(username + " - " + password);
    }
}